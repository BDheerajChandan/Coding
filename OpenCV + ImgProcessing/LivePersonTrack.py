import cv2
import tkinter as tk
from tkinter import filedialog
from PIL import Image, ImageTk, ImageOps
import numpy as np

class FaceTrackerApp:
    def __init__(self, window):
        self.window = window
        self.window.title("Face Tracker (Live Score Display)")

        self.frame_width = 500
        self.frame_height = 500

        self.face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
        self.cap = cv2.VideoCapture(0)

        self.uploaded_face = None  # Grayscale cropped face from uploaded image

        main_frame = tk.Frame(window)
        main_frame.pack(pady=5)

        cam_frame = tk.Frame(main_frame, width=self.frame_width, height=self.frame_height, relief="solid", bd=1)
        cam_frame.grid(row=0, column=0, padx=5)
        cam_frame.pack_propagate(False)

        self.cam_label = tk.Label(cam_frame)
        self.cam_label.pack()

        upload_frame = tk.Frame(main_frame, width=self.frame_width, height=self.frame_height, relief="solid", bd=1)
        upload_frame.grid(row=0, column=1, padx=5)
        upload_frame.pack_propagate(False)

        self.upload_label = tk.Label(upload_frame, text="Uploaded Image will appear here")
        self.upload_label.pack()

        btn_frame = tk.Frame(window)
        btn_frame.pack(pady=5)

        self.upload_btn = tk.Button(btn_frame, text="Upload Image", command=self.upload_image)
        self.upload_btn.grid(row=0, column=0, padx=5)

        self.terminate_btn = tk.Button(btn_frame, text="Terminate", command=self.terminate_app)
        self.terminate_btn.grid(row=0, column=1, padx=5)

        self.message_var = tk.StringVar()
        self.message_label = tk.Label(window, textvariable=self.message_var, font=("Helvetica", 16))
        self.message_label.pack()

        self.update_frame()
        self.window.protocol("WM_DELETE_WINDOW", self.on_close)

    def upload_image(self):
        path = filedialog.askopenfilename(filetypes=[("Image files", "*.jpg *.jpeg *.png")])
        if not path:
            return

        img = cv2.imread(path)
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        faces = self.face_cascade.detectMultiScale(gray, 1.3, 5)

        if len(faces) == 0:
            self.message_var.set("No face detected in uploaded image.")
            self.uploaded_face = None
        else:
            x, y, w, h = max(faces, key=lambda rect: rect[2] * rect[3])
            self.uploaded_face = gray[y:y + h, x:x + w]
            self.message_var.set("Face detected in uploaded image.")

        # Display full uploaded image (not cropped)
        self.display_uploaded_image(img)

    def display_uploaded_image(self, img):
        img_rgb = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
        img_pil = Image.fromarray(img_rgb)
        img_padded = ImageOps.pad(img_pil, (self.frame_width, self.frame_height), method=Image.BICUBIC, color=(0, 0, 0))
        imgtk = ImageTk.PhotoImage(image=img_padded)
        self.upload_label.config(image=imgtk, text="")
        self.upload_label.image = imgtk

    def update_frame(self):
        ret, frame = self.cap.read()
        if not ret:
            return

        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        faces = self.face_cascade.detectMultiScale(gray, 1.3, 5)

        person_found = False
        for (x, y, w, h) in faces:
            cv2.rectangle(frame, (x, y), (x + w, y + h), (255, 0, 0), 2)
            match_score = 0.0

            if self.uploaded_face is not None:
                try:
                    live_face = gray[y:y + h, x:x + w]
                    uploaded_resized = cv2.resize(self.uploaded_face, (w, h))
                    res = cv2.matchTemplate(live_face, uploaded_resized, cv2.TM_CCOEFF_NORMED)
                    _, max_val, _, _ = cv2.minMaxLoc(res)
                    match_score = max_val

                    cv2.putText(frame, f"Score: {match_score:.2f}", (x, y - 35),
                                cv2.FONT_HERSHEY_SIMPLEX, 0.6, (0, 255, 255), 2)

                    if max_val > 0.3:
                        person_found = True
                        cv2.putText(frame, "Person Found", (x, y - 10),
                                    cv2.FONT_HERSHEY_SIMPLEX, 0.8, (0, 255, 0), 2)
                        break
                except:
                    continue

        self.message_var.set("Person found" if person_found else "Still tracking")

        frame_rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        img = Image.fromarray(frame_rgb)
        img_padded = ImageOps.pad(img, (self.frame_width, self.frame_height), method=Image.BICUBIC, color=(0, 0, 0))

        imgtk = ImageTk.PhotoImage(image=img_padded)
        self.cam_label.imgtk = imgtk
        self.cam_label.configure(image=imgtk)

        self.window.after(30, self.update_frame)

    def terminate_app(self):
        self.cap.release()
        self.window.destroy()

    def on_close(self):
        self.cap.release()
        self.window.destroy()


if __name__ == "__main__":
    root = tk.Tk()
    app = FaceTrackerApp(root)
    root.mainloop()
