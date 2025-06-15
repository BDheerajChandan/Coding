import tkinter as tk
from tkinter import filedialog
from PIL import Image, ImageTk
import cv2
from skimage.metrics import structural_similarity as ssim
import numpy as np

class ImageSimilarityApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Image Similarity Checker")
        self.root.geometry("1000x600")

        self.image1 = None
        self.image2 = None

        # UI Layout
        frame = tk.Frame(root)
        frame.pack(pady=20)

        self.image1_label = tk.Label(frame, text="Upload Image 1", width=40, height=20, relief="solid")
        self.image1_label.grid(row=0, column=0, padx=20)
        self.image2_label = tk.Label(frame, text="Upload Image 2", width=40, height=20, relief="solid")
        self.image2_label.grid(row=0, column=1, padx=20)

        tk.Button(root, text="Upload Image 1", command=self.upload_image1).pack()
        tk.Button(root, text="Upload Image 2", command=self.upload_image2).pack()

        self.compare_btn = tk.Button(root, text="Compare Images", command=self.compare_images, state="disabled")
        self.compare_btn.pack(pady=10)

        self.result_label = tk.Label(root, text="", font=("Helvetica", 16))
        self.result_label.pack(pady=20)

    def upload_image1(self):
        path = filedialog.askopenfilename(filetypes=[("Image Files", "*.jpg *.png *.jpeg")])
        if path:
            self.image1 = cv2.imread(path)
            self.display_image(path, self.image1_label)
        self.enable_compare()

    def upload_image2(self):
        path = filedialog.askopenfilename(filetypes=[("Image Files", "*.jpg *.png *.jpeg")])
        if path:
            self.image2 = cv2.imread(path)
            self.display_image(path, self.image2_label)
        self.enable_compare()

    def display_image(self, path, label):
        img = Image.open(path)
        img.thumbnail((300, 300))
        imgtk = ImageTk.PhotoImage(img)
        label.config(image=imgtk, text="")
        label.image = imgtk

    def enable_compare(self):
        if self.image1 is not None and self.image2 is not None:
            self.compare_btn.config(state="normal")

    def compare_images(self):
        img1 = cv2.resize(self.image1, (300, 300))
        img2 = cv2.resize(self.image2, (300, 300))

        gray1 = cv2.cvtColor(img1, cv2.COLOR_BGR2GRAY)
        gray2 = cv2.cvtColor(img2, cv2.COLOR_BGR2GRAY)

        score, _ = ssim(gray1, gray2, full=True)
        similarity_percent = round(score * 100, 2)

        self.result_label.config(text=f"Similarity: {similarity_percent}%")

if __name__ == "__main__":
    root = tk.Tk()
    app = ImageSimilarityApp(root)
    root.mainloop()
