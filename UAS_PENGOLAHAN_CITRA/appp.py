import streamlit as st 
import numpy as np 
import os
import faiss
import pickle
from PIL import Image 
import tensorflow as tf
from tensorflow.keras.applications.mobilenet_v2 import MobileNetV2, preprocess_input, decode_predictions

# Load model klasifikasi
model = MobileNetV2(weights='imagenet')

# Load database fitur CBIR
FEATURES_DB_PATH = "D:/tugas_kuliah/pemrograman/UAS_PENGOLAHAN_CITRA/features.pkl"
IMAGE_DIR = "D:/tugas_kuliah/pemrograman/UAS_PENGOLAHAN_CITRA/archive/raw-img"

# Load fitur CBIR jika tersedia
if os.path.exists(FEATURES_DB_PATH):
    with open(FEATURES_DB_PATH, "rb") as f:
        feature_data = pickle.load(f)
    
    image_paths = feature_data["paths"]
    feature_vectors = feature_data["features"]
    labels = feature_data.get("labels", [])  # Pastikan labels tersedia
    
    index = faiss.IndexFlatL2(feature_vectors.shape[1])
    index.add(feature_vectors)
else:
    st.error("⚠️ Database fitur CBIR belum dibuat. Jalankan skrip ekstraksi fitur terlebih dahulu.")

# Judul aplikasi
st.title("🐾 Identifikasi Hewan & Pencarian Gambar Serupa")

# Upload gambar
uploaded = st.file_uploader("Unggah gambar hewan", type=["jpeg", "jpg", "png"])

if uploaded:
    # Simpan gambar asli untuk ditampilkan
    img_asli = Image.open(uploaded).convert('RGB')
    st.image(img_asli, caption="Citra Diupload", use_container_width=True)

    # Resize hanya untuk klasifikasi
    img_resized = img_asli.resize((224, 224))
    img_array = tf.keras.preprocessing.image.img_to_array(img_resized)
    img_array = np.expand_dims(img_array, axis=0)
    img_array = preprocess_input(img_array)


    # Prediksi klasifikasi
    predictions = model.predict(img_array)
    decoded = decode_predictions(predictions, top=1)[0][0]
    label = decoded[1].lower()  # Pastikan label dalam huruf kecil
    confidence = decoded[2]

    st.subheader(f"📌 Prediksi: {label} ({confidence*100:.2f}%)")

    # **Menambahkan deskripsi rinci tentang hewan**
    deskripsi_hewan = {
        "tiger": {
            "nama": "Harimau",
            "habitat": "Hutan tropis dan sabana di Asia",
            "makanan": "Karnivora (mangsa seperti rusa dan babi hutan)",
            "ciri_khas": "Memiliki belang hitam-oranye, sangat kuat dan cepat",
            "fakta": "Harimau adalah kucing terbesar di dunia dan memiliki kemampuan berenang yang luar biasa."
        },
        "elephant": {
            "nama": "Gajah",
            "habitat": "Hutan dan padang rumput di Afrika dan Asia",
            "makanan": "Herbivora (makan daun, buah, dan akar)",
            "ciri_khas": "Memiliki belalai panjang dan gading besar",
            "fakta": "Gajah memiliki ingatan yang sangat kuat dan bisa mengenali anggota keluarganya selama bertahun-tahun."
        },
        "zebra": {
            "nama": "Zebra",
            "habitat": "Padang rumput dan savana di Afrika",
            "makanan": "Herbivora (rumput dan daun)",
            "ciri_khas": "Memiliki pola garis hitam-putih unik",
            "fakta": "Setiap zebra memiliki pola garis yang berbeda, seperti sidik jari manusia."
        },
        "kuda": {
            "nama": "Kuda",
            "habitat": "Padang rumput, peternakan, dan daerah pegunungan",
            "makanan": "Herbivora (rumput, jerami, dan biji-bijian)",
            "ciri_khas": "Memiliki tubuh yang kuat, kaki panjang, dan sering digunakan untuk transportasi atau olahraga",
            "fakta": "Kuda memiliki kemampuan mengingat wajah manusia dan dapat membentuk ikatan emosional dengan pemiliknya."
        },
        "anjing": {
            "nama": "Golden Retriever",
            "habitat": "Domestik (peliharaan manusia)",
            "makanan": "Omnivora (makanan anjing, daging, dan sayuran)",
            "ciri_khas": "Berbulu emas, ramah, dan mudah dilatih",
            "fakta": "Golden Retriever adalah salah satu ras anjing paling cerdas dan sering digunakan sebagai anjing terapi."
        }
    }

    # Pencarian gambar serupa menggunakan CBIR
    k = 5  # Jumlah gambar serupa yang ingin ditampilkan
    distances, indices = index.search(np.array([model.predict(img_array).flatten()]), k)

    # **Gunakan label gambar serupa jika tidak ada deskripsi untuk gambar yang diunggah**
    final_label = label if label in deskripsi_hewan else None

    for i in range(k):
        similar_label = labels[indices[0][i]].lower() if labels else "Tidak diketahui"
        if similar_label in deskripsi_hewan and final_label is None:
            final_label = similar_label  # Gunakan label dari gambar serupa jika tidak ditemukan deskripsi

    # **Menampilkan deskripsi hanya satu kali di bagian atas**
    if final_label in deskripsi_hewan:
        info = deskripsi_hewan[final_label]
        st.markdown(f"**📖 Nama:** {info['nama']}")
        st.markdown(f"**🌍 Habitat:** {info['habitat']}")
        st.markdown(f"**🍽️ Makanan:** {info['makanan']}")
        st.markdown(f"**🔍 Ciri Khas:** {info['ciri_khas']}")
        st.markdown(f"**💡 Fakta Menarik:** {info['fakta']}")
    else:
        st.markdown("**📖 Deskripsi:** Maaf, deskripsi belum tersedia untuk hewan ini.")

    # **Menampilkan gambar serupa tanpa deskripsi tambahan**
    st.subheader("🔍 Gambar Serupa dengan Sudut Berbeda:")
    for i in range(k):
        similar_img_path = image_paths[indices[0][i]]
        similar_label = labels[indices[0][i]].lower() if labels else "Tidak diketahui"

        st.image(similar_img_path, caption=f"Gambar Serupa {i+1} - {similar_label}", use_container_width=True)