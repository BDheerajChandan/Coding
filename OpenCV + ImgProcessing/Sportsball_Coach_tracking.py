import tkinter as tk
from tkinter import filedialog
from PIL import Image, ImageTk
import cv2
import numpy as np

class BallPathTrackerApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Ball Movement Tracker (Motion + Seek)")

        self.cap = None
        self.running = False
        self.paused = False
        self.seeking = False  # Flag to detect slider dragging
        self.last_positions = []
        self.dot_positions = []
        self.prev_gray = None
        self.frame_count = 0

        self.fps = 30
        self.max_memory = 10

        self.video_width = None
        self.video_height = None
        self.total_frames = 0

        # UI Controls
        control_frame = tk.Frame(root)
        control_frame.pack(pady=10)

        self.upload_btn = tk.Button(control_frame, text="Upload Video", command=self.upload_video)
        self.upload_btn.grid(row=0, column=0, padx=5)

        self.start_btn = tk.Button(control_frame, text="Start", command=self.start_video, state=tk.DISABLED)
        self.start_btn.grid(row=0, column=1, padx=5)

        self.pause_btn = tk.Button(control_frame, text="Pause", command=self.pause_video, state=tk.DISABLED)
        self.pause_btn.grid(row=0, column=2, padx=5)

        self.stop_btn = tk.Button(control_frame, text="Stop & Close", command=self.stop_and_close, state=tk.DISABLED)
        self.stop_btn.grid(row=0, column=3, padx=5)

        tk.Label(control_frame, text="FPS:").grid(row=1, column=0)
        self.fps_slider = tk.Scale(control_frame, from_=1, to=60, orient=tk.HORIZONTAL, command=self.update_fps)
        self.fps_slider.set(self.fps)
        self.fps_slider.grid(row=1, column=1)

        tk.Label(control_frame, text="Memory (Trail Length):").grid(row=1, column=2)
        self.mem_slider = tk.Scale(control_frame, from_=1, to=30, orient=tk.HORIZONTAL, command=self.update_memory)
        self.mem_slider.set(self.max_memory)
        self.mem_slider.grid(row=1, column=3)

        tk.Label(control_frame, text="Seek:").grid(row=2, column=0)
        self.seek_slider = tk.Scale(control_frame, from_=0, to=100, orient=tk.HORIZONTAL, length=300,
                                    command=self.seek_video)
        self.seek_slider.grid(row=2, column=1, columnspan=3)
        # Bind mouse events for seek slider to detect dragging start/end
        self.seek_slider.bind("<ButtonPress-1>", self.seek_start)
        self.seek_slider.bind("<ButtonRelease-1>", self.seek_end)

        # Two frames for display: Original + Annotated, and Trace-only
        video_frame = tk.Frame(root)
        video_frame.pack()

        self.video_label1 = tk.Label(video_frame)
        self.video_label1.grid(row=0, column=0, padx=5, pady=5)

        self.video_label2 = tk.Label(video_frame)
        self.video_label2.grid(row=0, column=1, padx=5, pady=5)

    def update_fps(self, val):
        self.fps = int(val)

    def update_memory(self, val):
        self.max_memory = int(val)
        if len(self.last_positions) > self.max_memory:
            self.last_positions = self.last_positions[-self.max_memory:]

    def upload_video(self):
        filepath = filedialog.askopenfilename(filetypes=[("MP4 files", "*.mp4"), ("All files", "*.*")])
        if filepath:
            if self.cap:
                self.cap.release()
            self.cap = cv2.VideoCapture(filepath)
            if not self.cap.isOpened():
                print("Failed to open video")
                return

            self.video_width = int(self.cap.get(cv2.CAP_PROP_FRAME_WIDTH))
            self.video_height = int(self.cap.get(cv2.CAP_PROP_FRAME_HEIGHT))
            self.total_frames = int(self.cap.get(cv2.CAP_PROP_FRAME_COUNT))
            self.seek_slider.config(to=self.total_frames - 1)

            self.last_positions.clear()
            self.dot_positions.clear()
            self.prev_gray = None
            self.frame_count = 0
            self.running = False
            self.paused = False
            self.seeking = False

            self.start_btn.config(state=tk.NORMAL)
            self.pause_btn.config(state=tk.DISABLED, text="Pause")
            self.stop_btn.config(state=tk.DISABLED)
            self.video_label1.config(image='')
            self.video_label2.config(image='')

            self.root.geometry(f"{self.video_width*2 + 40}x{self.video_height + 140}")

    def start_video(self):
        if self.cap and not self.running:
            self.running = True
            self.paused = False
            self.start_btn.config(state=tk.DISABLED)
            self.pause_btn.config(state=tk.NORMAL, text="Pause")
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
            self.prev_gray = None
            self.frame_count = 0
            self.start_btn.config(state=tk.DISABLED)
            self.pause_btn.config(state=tk.DISABLED, text="Pause")
            self.stop_btn.config(state=tk.DISABLED)
            self.last_positions.clear()
            self.dot_positions.clear()
            self.video_label1.config(image='')
            self.video_label2.config(image='')

    def stop_and_close(self):
        self.stop_video()
        self.root.destroy()

    def seek_start(self, event):
        # User started dragging seek slider
        self.seeking = True

    def seek_end(self, event):
        # User released seek slider
        self.seeking = False
        # Force update frame after seeking ends
        self.seek_video(self.seek_slider.get())

    def seek_video(self, val):
        if self.cap:
            frame_num = int(val)
            self.cap.set(cv2.CAP_PROP_POS_FRAMES, frame_num)
            self.last_positions.clear()
            self.dot_positions.clear()
            self.prev_gray = None
            self.frame_count = frame_num
            # If paused or stopped, update frame once for preview
            if not self.running or self.paused or self.seeking:
                self.update_frame(single=True)

    def detect_moving_objects(self, frame):
        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        gray = cv2.GaussianBlur(gray, (21, 21), 0)

        if self.prev_gray is None:
            self.prev_gray = gray
            return []

        diff = cv2.absdiff(self.prev_gray, gray)
        self.prev_gray = gray

        _, thresh = cv2.threshold(diff, 25, 255, cv2.THRESH_BINARY)
        thresh = cv2.dilate(thresh, None, iterations=2)

        contours, _ = cv2.findContours(thresh.copy(), cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
        moving = []

        for cnt in contours:
            if cv2.contourArea(cnt) < 5:  # Lowered threshold for small objects
                continue
            (x, y, w, h) = cv2.boundingRect(cnt)
            center = (x + w // 2, y + h // 2)
            moving.append((center, w, h))

        return moving

    def update_frame(self, single=False):
        if self.cap and (self.running or single) and not self.paused:
            ret, frame = self.cap.read()
            if ret:
                self.frame_count += 1
                frame_display = frame.copy()
                moving_objs = self.detect_moving_objects(frame_display)

                new_center = None

                for (pos, w, h) in moving_objs:
                    cv2.rectangle(frame_display, (pos[0] - w//2, pos[1] - h//2),
                                (pos[0] + w//2, pos[1] + h//2), (255, 0, 0), 2)
                    new_center = pos  # Save last detected object in this frame

                # Draw current detected ball center as a red dot for clarity
                if new_center:
                    cv2.circle(frame_display, new_center, 8, (0, 0, 255), -1)

                # Add to last_positions and dot_positions if detected
                if new_center:
                    self.last_positions.append(new_center)
                    if len(self.last_positions) > self.max_memory:
                        self.last_positions.pop(0)

                    if self.frame_count % 10 == 0:
                        self.dot_positions.append(new_center)

                # === Prepare Frame 1: Original + Annotations ===
                for dot in self.dot_positions:
                    cv2.circle(frame_display, dot, 5, (0, 255, 0), -1)

                for i in range(1, len(self.last_positions)):
                    cv2.line(frame_display, self.last_positions[i - 1],
                             self.last_positions[i], (0, 255, 255), 3)

                # === Prepare Frame 2: Trace Only on White Background ===
                trace_frame = np.ones_like(frame_display, dtype=np.uint8) * 255  # White background

                if len(self.dot_positions) == 0:
                    cv2.putText(trace_frame, "Tracking path will appear here...", (30, 30),
                                cv2.FONT_HERSHEY_SIMPLEX, 0.7, (100, 100, 100), 2)
                else:
                    # Draw green fixed dots
                    for dot in self.dot_positions:
                        x, y = int(dot[0]), int(dot[1])
                        if 0 <= x < self.video_width and 0 <= y < self.video_height:
                            cv2.circle(trace_frame, (x, y), 5, (0, 255, 0), -1)
                    # Draw yellow trailing path
                    for i in range(1, len(self.last_positions)):
                        x1, y1 = int(self.last_positions[i-1][0]), int(self.last_positions[i-1][1])
                        x2, y2 = int(self.last_positions[i][0]), int(self.last_positions[i][1])
                        if (0 <= x1 < self.video_width and 0 <= y1 < self.video_height and
                            0 <= x2 < self.video_width and 0 <= y2 < self.video_height):
                            cv2.line(trace_frame, (x1, y1), (x2, y2), (0, 255, 255), 3)

                # Update seek slider to current frame, only if not seeking (user dragging)
                if not self.seeking:
                    current_frame = int(self.cap.get(cv2.CAP_PROP_POS_FRAMES))
                    self.seek_slider.set(current_frame)

                # Loop if reached end of video
                current_frame = int(self.cap.get(cv2.CAP_PROP_POS_FRAMES))
                if current_frame >= self.total_frames - 1:
                    self.cap.set(cv2.CAP_PROP_POS_FRAMES, 0)
                    self.last_positions.clear()
                    self.dot_positions.clear()
                    self.prev_gray = None
                    self.frame_count = 0

                # Convert for Tkinter
                img1 = cv2.cvtColor(frame_display, cv2.COLOR_BGR2RGB)
                img1 = Image.fromarray(img1)
                imgtk1 = ImageTk.PhotoImage(image=img1)
                self.video_label1.imgtk = imgtk1
                self.video_label1.config(image=imgtk1)

                img2 = cv2.cvtColor(trace_frame, cv2.COLOR_BGR2RGB)
                img2 = Image.fromarray(img2)
                imgtk2 = ImageTk.PhotoImage(image=img2)
                self.video_label2.imgtk = imgtk2
                self.video_label2.config(image=imgtk2)

                if not single:
                    self.root.after(int(1000 / self.fps), self.update_frame)
            else:
                # If frame read fails (e.g. end of video), loop video
                self.cap.set(cv2.CAP_PROP_POS_FRAMES, 0)
                self.last_positions.clear()
                self.dot_positions.clear()
                self.prev_gray = None
                self.frame_count = 0
                self.update_frame()
        elif single:
            # If single frame update requested (e.g. on seek), just show current frame
            ret, frame = self.cap.read()
            if ret:
                frame_display = frame.copy()
                # Draw last tracked points as reference
                for dot in self.dot_positions:
                    cv2.circle(frame_display, dot, 5, (0, 255, 0), -1)
                for i in range(1, len(self.last_positions)):
                    cv2.line(frame_display, self.last_positions[i - 1],
                             self.last_positions[i], (0, 255, 255), 3)

                trace_frame = np.ones_like(frame_display, dtype=np.uint8) * 255  # White background
                if len(self.dot_positions) == 0:
                    cv2.putText(trace_frame, "Tracking path will appear here...", (30, 30),
                                cv2.FONT_HERSHEY_SIMPLEX, 0.7, (100, 100, 100), 2)
                else:
                    for dot in self.dot_positions:
                        x, y = int(dot[0]), int(dot[1])
                        if 0 <= x < self.video_width and 0 <= y < self.video_height:
                            cv2.circle(trace_frame, (x, y), 5, (0, 255, 0), -1)
                    for i in range(1, len(self.last_positions)):
                        x1, y1 = int(self.last_positions[i-1][0]), int(self.last_positions[i-1][1])
                        x2, y2 = int(self.last_positions[i][0]), int(self.last_positions[i][1])
                        if (0 <= x1 < self.video_width and 0 <= y1 < self.video_height and
                            0 <= x2 < self.video_width and 0 <= y2 < self.video_height):
                            cv2.line(trace_frame, (x1, y1), (x2, y2), (0, 255, 255), 3)

                img1 = cv2.cvtColor(frame_display, cv2.COLOR_BGR2RGB)
                img1 = Image.fromarray(img1)
                imgtk1 = ImageTk.PhotoImage(image=img1)
                self.video_label1.imgtk = imgtk1
                self.video_label1.config(image=imgtk1)

                img2 = cv2.cvtColor(trace_frame, cv2.COLOR_BGR2RGB)
                img2 = Image.fromarray(img2)
                imgtk2 = ImageTk.PhotoImage(image=img2)
                self.video_label2.imgtk = imgtk2
                self.video_label2.config(image=imgtk2)

if __name__ == "__main__":
    root = tk.Tk()
    app = BallPathTrackerApp(root)
    root.mainloop()
