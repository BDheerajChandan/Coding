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
        self.seeking = False
        self.last_positions = []
        self.dot_positions = []
        self.prev_gray = None
        self.prev_white_mask = None  # FIXED: Initialize to avoid AttributeError
        self.frame_count = 0
        self.tracking_only = False

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

        self.track_btn = tk.Button(self.root, text="Track", command=self.track_button_clicked, state=tk.DISABLED)
        self.track_btn.pack()

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
        self.seek_slider.bind("<ButtonPress-1>", self.seek_start)
        self.seek_slider.bind("<ButtonRelease-1>", self.seek_end)

        # Video frames
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
            self.prev_white_mask = None  # FIXED: reset on new video load
            self.frame_count = 0
            self.running = False
            self.paused = False
            self.seeking = False

            self.start_btn.config(state=tk.NORMAL)
            self.pause_btn.config(state=tk.DISABLED, text="Pause")
            self.stop_btn.config(state=tk.DISABLED)
            self.video_label1.config(image='')
            self.video_label2.config(image='')
            self.track_btn.config(state=tk.NORMAL)

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
            self.pause_btn.config(text="Resume" if self.paused else "Pause")
            if not self.paused:
                self.update_frame()

    def stop_video(self):
        if self.cap:
            self.running = False
            self.paused = False
            self.cap.release()
            self.cap = None
            self.prev_gray = None
            self.prev_white_mask = None  # FIXED: reset on stop
            self.frame_count = 0
            self.start_btn.config(state=tk.DISABLED)
            self.pause_btn.config(state=tk.DISABLED, text="Pause")
            self.stop_btn.config(state=tk.DISABLED)
            self.last_positions.clear()
            self.dot_positions.clear()
            self.video_label1.config(image='')
            self.video_label2.config(image='')
            self.tracking_only = False

    def stop_and_close(self):
        self.stop_video()
        self.root.destroy()

    def seek_start(self, event):
        self.seeking = True

    def seek_end(self, event):
        self.seeking = False
        self.seek_video(self.seek_slider.get())

    def seek_video(self, val):
        if self.cap:
            frame_num = int(val)
            self.cap.set(cv2.CAP_PROP_POS_FRAMES, frame_num)
            self.last_positions.clear()
            self.dot_positions.clear()
            self.prev_gray = None
            self.prev_white_mask = None  # FIXED: reset on seek
            self.frame_count = frame_num
            if not self.running or self.paused or self.seeking:
                self.update_frame(single=True)

    def detect_moving_objects(self, frame):
        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        _, white_mask = cv2.threshold(gray, 240, 255, cv2.THRESH_BINARY)
        white_mask = cv2.GaussianBlur(white_mask, (5, 5), 0)

        if self.prev_white_mask is None:
            self.prev_white_mask = white_mask
            return []

        diff = cv2.absdiff(self.prev_white_mask, white_mask)
        self.prev_white_mask = white_mask

        _, motion_mask = cv2.threshold(diff, 25, 255, cv2.THRESH_BINARY)
        motion_mask = cv2.dilate(motion_mask, None, iterations=2)

        contours, _ = cv2.findContours(motion_mask, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
        moving_white_objects = []

        for cnt in contours:
            if cv2.contourArea(cnt) < 10:
                continue
            x, y, w, h = cv2.boundingRect(cnt)
            center = (x + w // 2, y + h // 2)
            moving_white_objects.append((center, w, h))

        return moving_white_objects
    def update_frame(self, single=False, track_mode=False):
        if self.cap and (self.running or single or track_mode) and not self.paused:
            ret, frame = self.cap.read()
            if ret:
                self.frame_count += 1
                frame_display = frame.copy()
                moving_objs = self.detect_moving_objects(frame_display)

                new_center = None
                for (pos, w, h) in moving_objs:
                    cv2.rectangle(frame_display, (pos[0] - w // 2, pos[1] - h // 2),
                                (pos[0] + w // 2, pos[1] + h // 2), (255, 0, 0), 2)
                    new_center = pos  # Save last detected object center

                # Draw red center dot
                if new_center:
                    cv2.circle(frame_display, new_center, 8, (0, 0, 255), -1)
                    self.last_positions.append(new_center)

                    if len(self.last_positions) > self.max_memory:
                        self.last_positions.pop(0)

                    if self.frame_count % 10 == 0:
                        self.dot_positions.append(new_center)

                # Draw trail dots and path on frame_display (Frame 1)
                for dot in self.dot_positions:
                    cv2.circle(frame_display, dot, 5, (0, 255, 0), -1)
                for i in range(1, len(self.last_positions)):
                    cv2.line(frame_display, self.last_positions[i - 1],
                             self.last_positions[i], (0, 255, 255), 3)

                # Prepare trace-only white frame (Frame 2)
                trace_frame = np.ones_like(frame_display, dtype=np.uint8) * 255
                if len(self.dot_positions) == 0:
                    cv2.putText(trace_frame, "Tracking path will appear here...", (30, 30),
                                cv2.FONT_HERSHEY_SIMPLEX, 0.7, (100, 100, 100), 2)
                else:
                    for dot in self.dot_positions:
                        x, y = int(dot[0]), int(dot[1])
                        if 0 <= x < self.video_width and 0 <= y < self.video_height:
                            cv2.circle(trace_frame, (x, y), 5, (0, 255, 0), -1)
                    for i in range(1, len(self.last_positions)):
                        x1, y1 = int(self.last_positions[i - 1][0]), int(self.last_positions[i - 1][1])
                        x2, y2 = int(self.last_positions[i][0]), int(self.last_positions[i][1])
                        if (0 <= x1 < self.video_width and 0 <= y1 < self.video_height and
                            0 <= x2 < self.video_width and 0 <= y2 < self.video_height):
                            cv2.line(trace_frame, (x1, y1), (x2, y2), (0, 255, 255), 3)

                # Update seek slider if not seeking
                if not self.seeking:
                    current_frame = int(self.cap.get(cv2.CAP_PROP_POS_FRAMES))
                    self.seek_slider.set(current_frame)

                # Loop video if end reached
                current_frame = int(self.cap.get(cv2.CAP_PROP_POS_FRAMES))
                if current_frame >= self.total_frames - 1:
                    self.cap.set(cv2.CAP_PROP_POS_FRAMES, 0)
                    self.last_positions.clear()
                    self.dot_positions.clear()
                    self.prev_gray = None
                    self.frame_count = 0

                # Convert and display both frames in Tkinter
                img1 = ImageTk.PhotoImage(image=Image.fromarray(cv2.cvtColor(frame_display, cv2.COLOR_BGR2RGB)))
                self.video_label1.imgtk = img1
                self.video_label1.config(image=img1)

                img2 = ImageTk.PhotoImage(image=Image.fromarray(cv2.cvtColor(trace_frame, cv2.COLOR_BGR2RGB)))
                self.video_label2.imgtk = img2
                self.video_label2.config(image=img2)

                if not single and (self.running or self.tracking_only):
                    self.root.after(int(1000 / self.fps), lambda: self.update_frame(track_mode=self.tracking_only))

            else:
                # Frame read failed (end of video), reset and restart
                self.cap.set(cv2.CAP_PROP_POS_FRAMES, 0)
                self.last_positions.clear()
                self.dot_positions.clear()
                self.prev_gray = None
                self.frame_count = 0
                self.update_frame()

        elif single:
            # Single-frame update (e.g., on slider seek)
            ret, frame = self.cap.read()
            if ret:
                frame_display = frame.copy()
                for dot in self.dot_positions:
                    cv2.circle(frame_display, dot, 5, (0, 255, 0), -1)
                for i in range(1, len(self.last_positions)):
                    cv2.line(frame_display, self.last_positions[i - 1],
                             self.last_positions[i], (0, 255, 255), 3)

                trace_frame = np.ones_like(frame_display, dtype=np.uint8) * 255
                if len(self.dot_positions) == 0:
                    cv2.putText(trace_frame, "Tracking path will appear here...", (30, 30),
                                cv2.FONT_HERSHEY_SIMPLEX, 0.7, (100, 100, 100), 2)
                else:
                    for dot in self.dot_positions:
                        x, y = int(dot[0]), int(dot[1])
                        if 0 <= x < self.video_width and 0 <= y < self.video_height:
                            cv2.circle(trace_frame, (x, y), 5, (0, 255, 0), -1)
                    for i in range(1, len(self.last_positions)):
                        x1, y1 = int(self.last_positions[i - 1][0]), int(self.last_positions[i - 1][1])
                        x2, y2 = int(self.last_positions[i][0]), int(self.last_positions[i][1])
                        if (0 <= x1 < self.video_width and 0 <= y1 < self.video_height and
                            0 <= x2 < self.video_width and 0 <= y2 < self.video_height):
                            cv2.line(trace_frame, (x1, y1), (x2, y2), (0, 255, 255), 3)

                img1 = ImageTk.PhotoImage(image=Image.fromarray(cv2.cvtColor(frame_display, cv2.COLOR_BGR2RGB)))
                self.video_label1.imgtk = img1
                self.video_label1.config(image=img1)

                img2 = ImageTk.PhotoImage(image=Image.fromarray(cv2.cvtColor(trace_frame, cv2.COLOR_BGR2RGB)))
                self.video_label2.imgtk = img2
                self.video_label2.config(image=img2)

    def track_button_clicked(self):
        if not self.cap:
            print("No video loaded.")
            return

        if not self.tracking_only:
            self.tracking_only = True
            self.paused = False  # Ensure not paused
            self.running = False  # Disable normal playback
            self.last_positions.clear()
            self.dot_positions.clear()
            self.prev_white_mask = None
            self.update_frame(track_mode=True)
            print("Continuous tracking started.")


        """# Read current frame
        current_frame_num = int(self.cap.get(cv2.CAP_PROP_POS_FRAMES))
        ret, frame = self.cap.read()

        if not ret:
            print("Failed to read frame.")
            return

        # Reset tracking state
        self.last_positions.clear()
        self.dot_positions.clear()
        self.prev_white_mask = None
        self.frame_count = current_frame_num

        frame_display = frame.copy()
        moving_objs = self.detect_moving_objects(frame_display)

        new_center = None
        for (pos, w, h) in moving_objs:
            cv2.rectangle(frame_display, (pos[0] - w // 2, pos[1] - h // 2),
                          (pos[0] + w // 2, pos[1] + h // 2), (255, 0, 0), 2)
            new_center = pos

        if new_center:
            cv2.circle(frame_display, new_center, 8, (0, 0, 255), -1)
            self.last_positions.append(new_center)
            self.dot_positions.append(new_center)

        # Draw trails
        for dot in self.dot_positions:
            cv2.circle(frame_display, dot, 5, (0, 255, 0), -1)
        for i in range(1, len(self.last_positions)):
            cv2.line(frame_display, self.last_positions[i - 1], self.last_positions[i], (0, 255, 255), 3)

        # Create trace-only frame
        trace_frame = np.ones_like(frame_display, dtype=np.uint8) * 255
        for dot in self.dot_positions:
            x, y = int(dot[0]), int(dot[1])
            if 0 <= x < self.video_width and 0 <= y < self.video_height:
                cv2.circle(trace_frame, (x, y), 5, (0, 255, 0), -1)
        for i in range(1, len(self.last_positions)):
            x1, y1 = int(self.last_positions[i - 1][0]), int(self.last_positions[i - 1][1])
            x2, y2 = int(self.last_positions[i][0]), int(self.last_positions[i][1])
            if (0 <= x1 < self.video_width and 0 <= y1 < self.video_height and
                0 <= x2 < self.video_width and 0 <= y2 < self.video_height):
                cv2.line(trace_frame, (x1, y1), (x2, y2), (0, 255, 255), 3)

        # Update UI
        img1 = ImageTk.PhotoImage(image=Image.fromarray(cv2.cvtColor(frame_display, cv2.COLOR_BGR2RGB)))
        self.video_label1.imgtk = img1
        self.video_label1.config(image=img1)

        img2 = ImageTk.PhotoImage(image=Image.fromarray(cv2.cvtColor(trace_frame, cv2.COLOR_BGR2RGB)))
        self.video_label2.imgtk = img2
        self.video_label2.config(image=img2)

        print("Tracking visualization updated.")
"""
if __name__ == "__main__":
    root = tk.Tk()
    app = BallPathTrackerApp(root)
    root.mainloop()
