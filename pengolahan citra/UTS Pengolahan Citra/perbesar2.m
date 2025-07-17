pkg load image;

% Memuat citra
img = imread('D:\tugas kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\papantulis.png');

% Rotasi citra
angle = 3;  % Sudut rotasi, sesuaikan dengan kemiringan gambar
rotated_img = imrotate(img, angle, 'bilinear', 'crop');

% Perbesaran citra setelah rotasi
scale_factor = 10;  % Faktor perbesaran (contoh: 1.5 kali ukuran asli)
scaled_img = imresize(rotated_img, scale_factor, 'bilinear');

% Menampilkan hasil
figure;
subplot(1, 3, 1);
imshow(img);
title('Citra Asli');

subplot(1, 3, 2);
imshow(rotated_img);
title('Hasil Rotasi');

subplot(1, 3, 3);
imshow(scaled_img);
title('Hasil Rotasi & Perbesaran');
