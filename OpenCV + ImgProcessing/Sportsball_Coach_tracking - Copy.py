import tkinter as tk
from tkinter import filedialog
from PIL import Image, ImageTk
import cv2
import numpy as np

class BallPathTrackerApp:
    def __init__(self, root):
        self.root = root
        self.root.title("White Ball Path Tracker")

        self.cap = None
        self.running = False
        self.paused = False
        self.last_positions = []

        self.fps = 30
        self.max_memory = 10

        self.video_width = None
        self.video_height = None

        # UI
        control_frame = tk.Frame(root)
        control_frame.pack(pady=10)

        self.upload_btn = tk.Button(control_frame, text="Upload Video", command=self.upload_video)
        self.upload_btn.grid(row=0, column=0, padx=5)

        self.start_btn = tk.Button(control_frame, text="Start", command=self.start_video, state=tk.DISABLED)
        self.start_btn.grid(row=0, column=1, padx=5)

        self.pause_btn = tk.Button(control_frame, text="Pause", command=self.pause_video, state=tk.DISABLED)
        self.pause_btn.grid(row=0, column=2, padx=5)

        self.stop_btn = tk.Button(control_frame, text="Stop", command=self.stop_video, state=tk.DISABLED)
        self.stop_btn.grid(row=0, column=3, padx=5)

        tk.Label(control_frame, text="FPS:").grid(row=1, column=0)
        self.fps_slider = tk.Scale(control_frame, from_=1, to=60, orient=tk.HORIZONTAL, command=self.update_fps)
        self.fps_slider.set(self.fps)
        self.fps_slider.grid(row=1, column=1)

        tk.Label(control_frame, text="Memory (Trail Length):").grid(row=1, column=2)
        self.mem_slider = tk.Scale(control_frame, from_=1, to=30, orient=tk.HORIZONTAL, command=self.update_memory)
        self.mem_slider.set(self.max_memory)
        self.mem_slider.grid(row=1, column=3)

        self.video_label = tk.Label(root)
        self.video_label.pack()

    def update_fps(self, val):
        self.fps = int(val)

    def update_memory(self, val):
        self.max_memory = int(val)
        if len(self.last_positions) > self.max_memory:
            self.last_positions = self.last_positions[-self.max_memory:]

    def upload_video(self):
        filepath = filedialog.askopenfilename(filetypes=[("MP4 files", "*.mp4")])
        if filepath:
            if self.cap:
                self.cap.release()
            self.cap = cv2.VideoCapture(filepath)
            if not self.cap.isOpened():
                print("Failed to open video")
                return

            # Get original dimensions
            self.video_width = int(self.cap.get(cv2.CAP_PROP_FRAME_WIDTH))
            self.video_height = int(self.cap.get(cv2.CAP_PROP_FRAME_HEIGHT))

            self.last_positions.clear()
            self.running = False
            self.paused = False

            self.start_btn.config(state=tk.NORMAL)
            self.pause_btn.config(state=tk.DISABLED)
            self.stop_btn.config(state=tk.DISABLED)
            self.video_label.config(image='')

            # Resize window to video size
            self.root.geometry(f"{self.video_width}x{self.video_height + 100}")

    def start_video(self):
        if self.cap and not self.running:
            self.running = True
            self.paused = False
            self.start_btn.config(state=tk.DISABLED)
            self.pause_btn.config(state=tk.NORMAL)
            self.stop_btn.config(state=tk.NORMAL)
            self.update_frame()

    def pause_video(self):
        if self.running:
            self.paused = not self.paused
            if self.paused:
                self.pause_btn.config(text="Resume")
            else:
                self.pause_btn.config(text="Pause")
                self.update_frame()

    def stop_video(self):
        if self.cap:
            self.running = False
            self.paused = False
            self.cap.release()
            self.cap = None
            self.start_btn.config(state=tk.DISABLED)
            self.pause_btn.config(state=tk.DISABLED, text="Pause")
            self.stop_btn.config(state=tk.DISABLED)
            self.last_positions.clear()
            self.video_label.config(image='')

    def detect_white_ball(self, frame):
        # Convert to grayscale for adaptive threshold
        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

        # Blur to reduce noise
        blurred = cv2.GaussianBlur(gray, (7,7), 0)

        # Adaptive threshold to isolate bright objects (white ball)
        thresh = cv2.adaptiveThreshold(
            blurred, 255,
            cv2.ADAPTIVE_THRESH_MEAN_C,
            cv2.THRESH_BINARY_INV,
            11, 2)

        # Invert threshold to get white ball as white
        thresh = cv2.bitwise_not(thresh)

        # Morphology to clean noise
        kernel = np.ones((5,5), np.uint8)
        thresh = cv2.morphologyEx(thresh, cv2.MORPH_OPEN, kernel)
        thresh = cv2.morphologyEx(thresh, cv2.MORPH_CLOSE, kernel)

        # Find contours
        contours, _ = cv2.findContours(thresh, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

        if contours:
            # Filter by area and circularity
            possible_balls = []
            for cnt in contours:
                area = cv2.contourArea(cnt)
                if area < 50:  # ignore small noise
                    continue
                perimeter = cv2.arcLength(cnt, True)
                if perimeter == 0:
                    continue
                circularity = 4 * np.pi * (area / (perimeter * perimeter))
                if 0.6 < circularity <= 1.2:  # close to circle
                    possible_balls.append(cnt)

            if possible_balls:
                largest = max(possible_balls, key=cv2.contourArea)
                (x, y), radius = cv2.minEnclosingCircle(largest)
                if radius > 5:
                    return (int(x), int(y))
        return None


    def update_frame(self):
        if self.cap and self.running and not self.paused:
            ret, frame = self.cap.read()
            if ret:
                # Use original dimensions (no resize)
                frame_display = frame.copy()

                pos = self.detect_white_ball(frame_display)
                if pos:
                    self.last_positions.append(pos)
                    if len(self.last_positions) > self.max_memory:
                        self.last_positions.pop(0)

                # Draw ball path
                for i in range(1, len(self.last_positions)):
                    cv2.line(frame_display, self.last_positions[i-1], self.last_positions[i], (0, 255, 255), 3)

                # Draw current ball position
                if pos:
                    cv2.circle(frame_display, pos, 10, (0, 255, 0), -1)

                # Convert to RGB and display
                img = cv2.cvtColor(frame_display, cv2.COLOR_BGR2RGB)
                img = Image.fromarray(img)
                imgtk = ImageTk.PhotoImage(image=img)
                self.video_label.imgtk = imgtk
                self.video_label.config(image=imgtk)

                delay = int(1000 / self.fps)
                self.root.after(delay, self.update_frame)
            else:
                self.stop_video()

if __name__ == "__main__":
    root = tk.Tk()
    app = BallPathTrackerApp(root)
    root.mainloop()
