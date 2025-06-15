import tkinter as tk
from tkinter import filedialog, ttk
from PIL import Image, ImageTk, ImageDraw
import cv2
import numpy as np
import tensorflow as tf
from tensorflow.keras.applications import MobileNetV2
from tensorflow.keras.applications.mobilenet_v2 import preprocess_input
from tensorflow.keras.models import Model

class ImageSimilarityApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Live Cosine Similarity with Face Detection")
        self.root.geometry("1100x820")  # Increased height for log box

        self.image1 = None
        self.image2 = None
        self.angle1 = 0
        self.angle2 = 0
        self.img_display_size = (300, 300)
        self.epochs = tk.IntVar(value=5)

        self.face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
        base_model = MobileNetV2(include_top=False, pooling='avg', input_shape=(224, 224, 3))
        self.feature_extractor = Model(inputs=base_model.input, outputs=base_model.output)

        frame = tk.Frame(root)
        frame.pack(pady=10)

        self.frame1 = tk.Frame(frame, width=300, height=300, bg="gray")
        self.frame1.grid(row=0, column=0, padx=10)
        self.frame1.grid_propagate(False)

        self.frame2 = tk.Frame(frame, width=300, height=300, bg="gray")
        self.frame2.grid(row=0, column=1, padx=10)
        self.frame2.grid_propagate(False)

        self.image1_label = tk.Label(self.frame1, bg="white")
        self.image1_label.pack(expand=True, fill='both')

        self.image2_label = tk.Label(self.frame2, bg="white")
        self.image2_label.pack(expand=True, fill='both')

        self.blank_imgtk = self.create_placeholder_image()
        self.image1_label.config(image=self.blank_imgtk)
        self.image2_label.config(image=self.blank_imgtk)

        control_frame = tk.Frame(root)
        control_frame.pack()

        tk.Button(control_frame, text="Upload Image 1", command=self.upload_image1).grid(row=0, column=0, padx=5)
        tk.Button(control_frame, text="Rotate Image 1", command=self.rotate_image1).grid(row=0, column=1, padx=5)
        tk.Button(control_frame, text="Upload Image 2", command=self.upload_image2).grid(row=0, column=2, padx=5)
        tk.Button(control_frame, text="Rotate Image 2", command=self.rotate_image2).grid(row=0, column=3, padx=5)

        tk.Label(control_frame, text="Epochs:").grid(row=0, column=4, padx=5)
        tk.Spinbox(control_frame, from_=1, to=20, textvariable=self.epochs, width=5).grid(row=0, column=5)

        self.compare_btn = tk.Button(root, text="Compare Images", command=self.compare_images, state="disabled")
        self.compare_btn.pack(pady=10)

        self.progress = ttk.Progressbar(root, orient="horizontal", length=300, mode="determinate")
        self.progress.pack(pady=5)

        self.result_label = tk.Label(root, text="", font=("Helvetica", 14))
        self.result_label.pack(pady=5)

        self.live_result_label = tk.Label(root, text="", font=("Helvetica", 16, "bold"), fg="blue")
        self.live_result_label.pack(pady=10)

        # Epoch log box
        self.epoch_log_text = tk.Text(root, height=10, width=100, state="disabled", font=("Courier", 10))
        self.epoch_log_text.pack(pady=10)

    def create_placeholder_image(self):
        img = Image.new("RGB", self.img_display_size, color=(200, 200, 200))
        draw = ImageDraw.Draw(img)
        draw.text((90, 140), "No Image", fill="black")
        return ImageTk.PhotoImage(img)

    def upload_image1(self):
        path = filedialog.askopenfilename(filetypes=[("Image Files", "*.jpg *.jpeg *.png")])
        if path:
            self.image1 = cv2.imread(path)
            self.angle1 = 0
            self.display_image(self.image1, self.image1_label)
        self.enable_compare()

    def upload_image2(self):
        path = filedialog.askopenfilename(filetypes=[("Image Files", "*.jpg *.jpeg *.png")])
        if path:
            self.image2 = cv2.imread(path)
            self.angle2 = 0
            self.display_image(self.image2, self.image2_label)
        self.enable_compare()

    def rotate_image1(self):
        if self.image1 is not None:
            self.angle1 = (self.angle1 + 90) % 360
            self.display_image(self.rotate_cv_image(self.image1, self.angle1), self.image1_label)

    def rotate_image2(self):
        if self.image2 is not None:
            self.angle2 = (self.angle2 + 90) % 360
            self.display_image(self.rotate_cv_image(self.image2, self.angle2), self.image2_label)

    def rotate_cv_image(self, img, angle):
        if angle == 0:
            return img
        (h, w) = img.shape[:2]
        center = (w // 2, h // 2)
        M = cv2.getRotationMatrix2D(center, angle, 1.0)
        return cv2.warpAffine(img, M, (w, h))

    def display_image(self, img_cv, label):
        img = cv2.resize(img_cv, self.img_display_size)
        img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
        img_pil = Image.fromarray(img)
        imgtk = ImageTk.PhotoImage(img_pil)
        label.config(image=imgtk)
        label.image = imgtk

    def enable_compare(self):
        if self.image1 is not None and self.image2 is not None:
            self.compare_btn.config(state="normal")

    def extract_features(self, img):
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        faces = self.face_cascade.detectMultiScale(gray, scaleFactor=1.1, minNeighbors=5)
        if len(faces) > 0:
            x, y, w, h = faces[0]
            img = img[y:y+h, x:x+w]

        img = cv2.resize(img, (224, 224))
        img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
        img = preprocess_input(img.astype("float32"))

        # Add small Gaussian noise to simulate variation
        noise = np.random.normal(0, 0.01, img.shape).astype(np.float32)
        img += noise
        img = np.clip(img, -1, 1)

        img = np.expand_dims(img, axis=0)
        return self.feature_extractor.predict(img)


    def cosine_similarity(self, vec1, vec2):
        vec1 = vec1.flatten()
        vec2 = vec2.flatten()
        dot = np.dot(vec1, vec2)
        norm1 = np.linalg.norm(vec1)
        norm2 = np.linalg.norm(vec2)
        return dot / (norm1 * norm2)

    def compare_images(self):
        self.img1_rotated = self.rotate_cv_image(self.image1, self.angle1)
        self.img2_rotated = self.rotate_cv_image(self.image2, self.angle2)

        self.total_epochs = self.epochs.get()
        self.current_epoch = 0
        self.similarities = []

        self.compare_btn.config(state="disabled")
        self.progress["maximum"] = self.total_epochs
        self.progress["value"] = 0
        self.result_label.config(text="")

        # Clear previous logs
        self.epoch_log_text.config(state="normal")
        self.epoch_log_text.delete("1.0", tk.END)
        self.epoch_log_text.config(state="disabled")

        self.run_epoch()

    def run_epoch(self):
        if self.current_epoch >= self.total_epochs:
            avg_similarity = np.mean(self.similarities)
            similarity_percent = round(avg_similarity * 100, 5)
            self.result_label.config(text=f"Final Avg Similarity: {similarity_percent}%")
            self.compare_btn.config(state="normal")
            return
        
        feat1 = self.extract_features(self.img1_rotated)
        feat2 = self.extract_features(self.img2_rotated)
        sim = self.cosine_similarity(feat1, feat2)
        self.similarities.append(sim)

        similarity_percent = round(sim * 100, 5)
        log_line = f"Epoch {self.current_epoch + 1}/{self.total_epochs} Similarity: {similarity_percent}%\n"

        self.live_result_label.config(text=log_line.strip())

        # Append to log box
        self.epoch_log_text.config(state="normal")
        self.epoch_log_text.insert(tk.END, log_line)
        self.epoch_log_text.see(tk.END)
        self.epoch_log_text.config(state="disabled")

        self.current_epoch += 1
        self.progress["value"] = self.current_epoch
        self.root.after(10, self.run_epoch)

if __name__ == "__main__":
    root = tk.Tk()
    app = ImageSimilarityApp(root)
    root.mainloop()
