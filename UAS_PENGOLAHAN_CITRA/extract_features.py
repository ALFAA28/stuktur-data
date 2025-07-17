import os
import numpy as np
import pickle
import faiss
import tensorflow as tf
from tensorflow.keras.applications.mobilenet_v2 import MobileNetV2, preprocess_input
from PIL import Image

# Pastikan TensorFlow tidak menggunakan GPU jika tidak tersedia
tf.config.set_visible_devices([], 'GPU')

# Load model
model = MobileNetV2(weights='imagenet')

# Direktori utama dataset (berisi banyak folder hewan)
MAIN_DIR = r"D:\tugas_kuliah\pemrograman\UAS_PENGOLAHAN_CITRA\archive\raw-img"

# Mendapatkan semua subfolder dalam direktori utama
folders = [os.path.join(MAIN_DIR, folder) for folder in os.listdir(MAIN_DIR) if os.path.isdir(os.path.join(MAIN_DIR, folder))]

# Menyimpan path gambar dan fitur
image_paths = []
feature_vectors = []
labels = []  # Menyimpan nama folder sebagai label hewan

# Loop melalui setiap folder
for folder in folders:
    hewan = os.path.basename(folder)  # Nama folder sebagai label hewan
    print(f"🔍 Memproses folder: {hewan}")

    # Ambil semua gambar dalam folder
    img_files = [os.path.join(folder, f) for f in os.listdir(folder) if f.endswith((".jpg", ".jpeg", ".png"))]

    # Ekstraksi fitur untuk setiap gambar
    for img_path in img_files:
        try:
            img = Image.open(img_path).convert('RGB')
            img_resized = img.resize((224, 224))
            img_array = tf.keras.preprocessing.image.img_to_array(img_resized)
            img_array = np.expand_dims(img_array, axis=0)
            img_array = preprocess_input(img_array)
            feature_vector = model.predict(img_array).flatten()

            # Simpan data
            image_paths.append(img_path)
            feature_vectors.append(feature_vector)
            labels.append(hewan)  # Simpan label hewan
        except Exception as e:
            print(f"❌ Gagal memproses gambar {img_path}: {e}")

# Simpan fitur ke database jika ada data
if feature_vectors:
    feature_vectors = np.array(feature_vectors)
    index = faiss.IndexFlatL2(feature_vectors.shape[1])
    index.add(feature_vectors)

    feature_data = {"paths": image_paths, "features": feature_vectors, "labels": labels}
    with open(r"D:/tugas_kuliah/pemrograman/UAS_PENGOLAHAN_CITRA/features.pkl", "wb") as f:
        pickle.dump(feature_data, f)

    print("✅ Database fitur CBIR berhasil dibuat!")
else:
    print("⚠️ Tidak ada fitur yang dapat disimpan!")