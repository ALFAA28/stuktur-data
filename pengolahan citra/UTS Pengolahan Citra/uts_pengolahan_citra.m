%tugas UTS%

%NAMA   : MUHAMMAD ALFA WIJAYA
%NIM    : 2355201031
%PRODI  : ILMU KOMPUTER SMT4
%MATKUL : PENGOLAHAN CITRA

% 1. perbedaan citra biner, grayscale, dan RGB
%Memuat package yang dibutuhkan histogram
pkg load image;

img = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\McLaren_P1.jpg');  % Memuat gambar RGB
gray_img = rgb2gray(img);
binary_img = im2bw(gray_img, 0.5);


figure;
subplot(1,2,1);
imshow (img);
title('Gambar RGB');

subplot(1,2,2);
imhist (img);
title('Hasil Histogram RGB');

figure;
subplot(1,2,1);
imshow(gray_img);
title('Gambar Grayscale');

subplot(1,2,2);
imhist (gray_img);
title('Hasil Histogram Grayscale');

figure;
subplot(1,2,1);
imshow(binary_img);
title('Gambar Biner');

subplot(1,2,2);
imhist (binary_img);
title('Hasil Histogram Biner');

pkg load image;

% 2. kuantisasi pada sebuah citra grayscale menjadi 2, 4, dan 8 tingkat keabuan.
% Memuat citra grayscale (jika citra asli masih RGB, gunakan rgb2gray)
img_gray = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\boneka.png');

function q_img = quantize_image(img, n_levels)

  step = 256 / n_levels;

  q_img = uint8(floor(double(img) / step) * step);
endfunction

% Kuantisasi ke 2 tingkat, 4 tingkat, dan 8 tingkat
q_img2 = quantize_image(img_gray, 2);
q_img4 = quantize_image(img_gray, 4);
q_img8 = quantize_image(img_gray, 8);

% Menampilkan citra asli dan hasil kuantisasi dalam satu figure
figure;
subplot(2,2,1), imshow(img_gray), title('Citra Grayscale Asli');
subplot(2,2,2), imshow(q_img2), title('2 Tingkat Keabuan');
subplot(2,2,3), imshow(q_img4), title('4 Tingkat Keabuan');
subplot(2,2,4), imshow(q_img8), title('8 Tingkat Keabuan');
pkg load image;

% 3. Meningkatkan Kecerahan
%kecerahan berwarna
RGB = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\resArea2.png');
RGB2 = RGB + 80;

figure;
subplot(2,2,1);
imshow (img);
title('Hasil Gambar Normal');

subplot(2,2,2);
imshow(RGB2);
title('Hasil Meningkatkan Kecerahan RGB');

subplot(2,2,3);
imhist (img);
title('Hasil Histogram asli');

subplot(2,2,4);
imhist (RGB2);
title('Hasil Histogram Meningkatkan Kecerahan RGB');
pkg load image;

% 4. teknik ekualisasi histogram pada sebuah foto wajah yang diambil di dalam ruangan.
pkg load image;

% Baca citra
citra_asli = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\no4.png');
citra_gray = rgb2gray(citra_asli); % Konversi ke grayscale

% Ekualisasi histogram
citra_eq = histeq(citra_gray);

% Tampilkan citra sebelum dan sesudah
subplot(1,2,1), imshow(citra_gray), title('Citra Asli');
subplot(1,2,2), imshow(citra_eq), title('Citra Setelah Ekualisasi Histogram');

pkg load image;

% 5. gambar yang memiliki banyak noise
%Median kernel 3x3
pkg load image;

citra_gray= imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\Grayscale-salt_and_pepper_noise.png');

% Terapkan filter median
citra_median = medfilt2(citra_gray, [3 3]);

% Tampilkan hasil
subplot(1,2,1), imshow(citra_gray), title('Citra Asli');
subplot(1,2,2), imshow(citra_median), title('Citra Setelah Filter Median');

pkg load image;

%median vs mean
pkg load image;

citra_gray= imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\Grayscale-salt_and_pepper_noise.png');

% Terapkan filter median
citra_median = medfilt2(citra_gray, [3 3]);

h = fspecial('average', [3 3]);
citra_mean = imfilter(citra_gray, h);

figure;
subplot(2,2,1);
imshow (citra_median);
title('Filter Median');

subplot(2,2,2);
imshow(citra_mean);
title('Filter Mean');

subplot(2,2,3);
imhist (citra_median);
title('Hasil Histogram Median');

subplot(2,2,4);
imhist (citra_mean);
title('Hasil Histogram Mean');

pkg load image;

%6. Filter high-boost
pkg load image;
img = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\AMAZING.png');
if size(img, 3) == 3
  img_gray = rgb2gray(img); % Konversi ke grayscale jika RGB
else
  img_gray = img; % Jika sudah grayscale
endif
img_gray = im2double(img_gray); % Konversi ke format double

A = 1.5; % Faktor High-Boost (>1)
h = fspecial('average', 3); % Filter rata-rata 3x3
blurred = imfilter(img_gray, h, 'replicate'); % Proses blur
high_boost = A * img_gray - blurred; % High-Boost Filter

figure;
% Gambar sebelum
subplot(2,2,1);
imshow(img_gray);
title('Sebelum ');

subplot(2,2,3);
imhist(img_gray);
title('Histogram Sebelum');

% Gambar sesudah
subplot(2,2,2);
imshow(high_boost, []);
title(['Sesudah High-Boost ']);

subplot(2,2,4);
imhist(high_boost);
title('Histogram Sesudah');

pkg load image;



% 7. rotation & pembesaran
%Rotasi
pkg load image;
img = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\papantulis.jfif');

% Tentukan sudut rotasi (dalam derajat)
angle = 90;

% Rotasi gambar dengan interpolasi bilinear dan mode 'crop'
rotated_img = imrotate(img, angle, 'bilinear', 'crop');

% Tampilkan gambar asli dan gambar hasil rotasi
figure;
subplot(1, 2, 1);
imshow(img);
title('Gambar Asli');

subplot(1, 2, 2);
imshow(rotated_img);
title(['Gambar Setelah Rotasi ', num2str(angle), '°']);
pkg load image;

%rotasi dan perbesar
pkg load image;

img = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\papantulis.jfif');

% Tentukan sudut rotasi (derajat)
angle = 90;

% Rotasi gambar interpolasi bilinear
rotated_img = imrotate(img, angle, 'bilinear', 'crop');

% 4. Perbesar citra
scale_factor = 20;
resized_img = imresize(rotated_img, scale_factor, 'bilinear');

% 5. Tampilkan gambar asli dan hasil
figure;

subplot(1,2,1);
imshow(img);
title('Gambar Asli');

subplot(1,2,2);
imshow(resized_img);
title(['Rotasi ', num2str(angle), '° + Perbesaran ', num2str(scale_factor), 'x']);

pkg load image;


pkg load image;

function G = uts_pengolahan_citra(berkas, sy, sx)
  % PERBESAR2 Melakukan operasi pembesaran citra dengan interpolasi bilinear.
  % Masukan:
  %   berkas = nama berkas image
  %   sy = skala pembesaran pada sumbu Y
  %   sx = skala pembesaran pada sumbu X

  F = imread(berkas);

  if ndims(F) == 3
    F = rgb2gray(F); % Konversi ke grayscale jika berkas berupa citra berwarna
  end

  [tinggi, lebar] = size(F);
  tinggi_baru = round(tinggi * sy);
  lebar_baru = round(lebar * sx);

  F2 = double(F);
  G = zeros(tinggi_baru, lebar_baru);

  for y = 1 : tinggi_baru
    y2 = (y - 1) / sy + 1;
    for x = 1 : lebar_baru
      x2 = (x - 1) / sx + 1;

      % Lakukan interpolasi bilinear
      p = floor(y2);
      q = floor(x2);
      a = y2 - p;
      b = x2 - q;

      if p >= tinggi || q >= lebar
        G(y, x) = F2(min(p, tinggi), min(q, lebar));
      else
        intensitas = (1-a)*((1-b)*F2(p,q) + b*F2(p,q+1)) + ...
                      a * ((1-b)*F2(p+1,q) + b*F2(p+1,q+1));
        G(y, x) = intensitas;
      end
    end
  end

  G = uint8(G);
end

% Contoh pemanggilan fungsi
Img = uts_pengolahan_citra('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\papantulis.jfif', 4, 4);
imshow(Img);

png load image;
%8.Efek repple dan twirl

pkg load image;

% 1. Membaca citra dan konversi ke grayscale jika berwarna
I = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\kakashi.jpg');
if size(I, 3) == 3
    I = rgb2gray(I);
end
I = im2double(I); % Konversi ke tipe double

% 2. Mendapatkan ukuran citra
[row, col] = size(I);
[X, Y] = meshgrid(1:col, 1:row);

% 3. Menerapkan efek Ripple
ripple_strength = 15; % Intensitas gelombang
ripple_freq = 0.06; % Frekuensi gelombang
X_ripple = X + ripple_strength * sin(Y * ripple_freq);
Y_ripple = Y + ripple_strength * cos(X * ripple_freq);
I_ripple = interp2(X, Y, I, X_ripple, Y_ripple, 'linear', 0);

% 4. Menerapkan efek Twirl
twirl_strength = 0.006; % Kekuatan putaran
cx = col / 2;
cy = row / 2;
[X_shift, Y_shift] = meshgrid(1:col, 1:row);
dx = X_shift - cx;
dy = Y_shift - cy;
radius = sqrt(dx.^2 + dy.^2);
theta = twirl_strength * radius; % Rotasi berbasis jarak dari pusat
X_twirl = cx + dx .* cos(theta) - dy .* sin(theta);
Y_twirl = cy + dx .* sin(theta) + dy .* cos(theta);
I_twirl = interp2(X, Y, I, X_twirl, Y_twirl, 'linear', 0);

% 5. Menampilkan hasil
figure;
subplot(1, 3, 1);
imshow(I);
title('Hasil Citra Asli');

subplot(1, 3, 2);
imshow(I_ripple);
title('Hasil Efek Ripple');

subplot(1, 3, 3);
imshow(I_twirl);
title('Hasil Efek Twirl');
pkg load image;


%9. Gaussian

pkg load image;

I = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\osaka.png'); % Ganti dengan path citra yang ingin diproses
if size(I, 3) == 3
    I = rgb2gray(I);
end
I = im2double(I);
h = fspecial('gaussian', [5 5], 2);

% Mengaburkan citra
I_blur = imfilter(I, h, 'replicate');

% Menampilkan hasil
figure;
subplot(1, 2, 1);
imshow(I);
title('Citra Asli');

subplot(1, 2, 2);
imshow(I_blur);
title('Citra dengan Gaussian Blur');

pkg load image;

%10. penerapan transformasi affine
pkg load image;

img = imread('D:\tugas_kuliah\pemrograman\pengolahan citra\UTS Pengolahan Citra\IMAGE\whiteHouse.png');
if size(img, 3) == 3
    img = rgb2gray(img);
end
img = im2double(img);

% parameter transformasi affine
theta = deg2rad(30);  % Rotasi derajat
scale_x = 1.2;        % Skala horizontal (perbesaran)
scale_y = 0.8;        % Skala vertikal (perkecilan)
tx = 60;              % Translasi sepanjang sumbu x (geser ke kanan)
ty = 30;              % Translasi sepanjang sumbu y (geser ke bawah)

% Buat matriks transformasi affine
T = [scale_x*cos(theta), -sin(theta), tx;
     sin(theta), scale_y*cos(theta), ty;
     0, 0, 1];

% Konversi matriks ke bentuk transformasi yang kompatibel dengan Octave
tform = maketform('affine', T');

% transformasi menggunakan imtransform()
img_transformed = imtransform(img, tform, 'bilinear', ...
    'XData', [1 size(img,2)], 'YData', [1 size(img,1)]);

% Tampilkan citra asli dan hasil transformasi dalam satu figure
figure;
subplot(1, 2, 1);
imshow(img);
title('Hasil Citra Asli');

subplot(1, 2, 2);
imshow(img_transformed);
title('Hasil Citra Setelah Transformasi Affine');

pkg load image;

