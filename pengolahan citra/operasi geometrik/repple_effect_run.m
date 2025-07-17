pkg load image;  % Memuat paket pemrosesan citra

%% 1. Memuat Gambar Wajah dan Filter
face = imread('D:\tugas kuliah\pemrograman\pengolahan citra\operasi geometrik\face.jpeg');      % Gambar wajah pengguna
filter_img = imread('D:\tugas kuliah\pemrograman\pengolahan citra\operasi geometrik\filter.png');  % Gambar filter dengan background transparan (PNG)

% Tampilkan gambar asli
figure("name", "Filter pada Wajah");
subplot(2,2,1);
imshow(face);
title('Gambar Wajah Asli');

subplot(2,2,2);
imshow(filter_img);
title('Gambar Filter Asli');

%% 2. Pisahkan Warna dan Kanal Alpha (Jika Ada)
% Jika file PNG memiliki 4 channel (RGBA), pisahkan channel warna dan alpha.
if size(filter_img,3) == 4
    filter_rgb = filter_img(:,:,1:3);
    filter_alpha = filter_img(:,:,4);
else
    % Jika filter tidak memiliki channel alpha, buat alpha berdasarkan threshold
    filter_rgb = filter_img;
    % Diasumsikan background putih: buat mask (nilai 255 -> background, 0 -> objek)
    tol = 20;
    mask = ~((abs(double(filter_img(:,:,1))-255) < tol) & ...
             (abs(double(filter_img(:,:,2))-255) < tol) & ...
             (abs(double(filter_img(:,:,3))-255) < tol));
    filter_alpha = uint8(mask)*255;
endif

%% 3. Tentukan Parameter Rotasi dan Penskalaan
% Parameter berikut diatur agar filter cocok dengan posisi wajah
angle = -15;      % Sudut rotasi dalam derajat (misalnya -15° untuk menyesuaikan kemiringan wajah)
scale_factor = 0.8; % Faktor skala (0.8 berarti filter diperkecil 80%)

%% 4. Terapkan Rotasi ke Filter dan Kanal Alpha
filter_rotated = imrotate(filter_rgb, angle, 'bilinear', 'crop');
alpha_rotated  = imrotate(filter_alpha, angle, 'bilinear', 'crop');

%% 5. Terapkan Penskalaan (Resize) ke Filter dan Alpha Channel
filter_transformed = imresize(filter_rotated, scale_factor);
alpha_transformed  = imresize(alpha_rotated, scale_factor);

subplot(2,2,3);
imshow(filter_transformed);
title(['Filter setelah Rotasi (' num2str(angle) '°) & Skala (' num2str(scale_factor) 'x)']);

%% 6. Menentukan Lokasi Overlay pada Wajah
% Misalnya, tempatkan filter di bagian atas wajah (koordinat ditentukan secara manual)
[pos_y, pos_x] = deal(50, 100);  % pos_y: baris, pos_x: kolom (sesuaikan dengan posisi yang diinginkan)

% Ukuran filter hasil transformasi
[filter_h, filter_w, ~] = size(filter_transformed);
[face_h, face_w, ~] = size(face);

% Pastikan ROI berada dalam batas gambar wajah
if pos_y + filter_h - 1 > face_h
    filter_h = face_h - pos_y + 1;
end
if pos_x + filter_w - 1 > face_w
    filter_w = face_w - pos_x + 1;
end

%% 7. Overlay Filter ke Gambar Wajah Menggunakan Alpha Blending
output_image = face;  % Mulai dengan salinan wajah

for i = 1:filter_h
    for j = 1:filter_w
        % Normalisasi nilai alpha (0 sampai 1)
        alpha_val = double(alpha_transformed(i,j)) / 255;
        % Bridging nilai pixel: filter * alpha + background * (1 - alpha)
        for ch = 1:3  % untuk setiap channel (RGB)
            output_image(pos_y+i-1, pos_x+j-1, ch) = uint8( ...
                double(filter_transformed(i,j,ch)) * alpha_val + ...
                double(face(pos_y+i-1, pos_x+j-1, ch)) * (1 - alpha_val));
        end
    end
end

subplot(2,2,4);
imshow(output_image);
title('Gambar Wajah dengan Filter Diterapkan');

%% 8. (Opsional) Menyimpan Hasil Akhir
imwrite(output_image, 'face_with_filter.png');  % Format PNG mendukung transparansi





pkg load image   % Pastikan paket image telah diload

img = imread('D:\tugas kuliah\pemrograman\pengolahan citra\operasi geometrik\face.jpeg');           % Baca gambar
gray = rgb2gray(img);              % Ubah ke grayscal (jika gambar berwarna)
hasil = combinedGeometricOps(gray, 20, 20, 30, 1.2, 1.2, 'horizontal');
imshow(hasil);                     % Tampilkan citra hasil transformasi

function G = combinedGeometricOps(F, dx, dy, theta, sx, sy, flip_mode)
% COMBINEDGEOMETRICOPS Mengaplikasikan beberapa operasi geometrik berurutan pada citra.
%
%    Operasi yang diterapkan secara berurutan:
%       1. Translasi    : Menggeser citra sebesar dx dan dy.
%       2. Rotasi       : Memutar citra sebesar theta derajat (berpusat di tengah).
%       3. Scaling      : Mengubah ukuran citra dengan faktor sx (horisontal) dan sy (vertikal).
%       4. Flipping     : Membalik citra sesuai mode ('horizontal' atau 'vertical').
%       5. Warping      : Menerapkan efek warping sinusoidal.
%
%    Input:
%       F         - Citra input (matriks grayscale).
%       dx, dy    - Nilai offset translasi pada sumbu x dan y.
%       theta     - Sudut rotasi dalam derajat.
%       sx, sy    - Faktor penskalaan pada sumbu x dan y.
%       flip_mode - Mode flipping, yaitu 'horizontal' atau 'vertical'.
%
%    Output:
%       G         - Citra output akhir dengan hasil transformasi (tipe uint8).
%
%    Contoh penggunaan:
%       img = imread('citra.png');
%       gray = rgb2gray(img);
%       hasil = combinedGeometricOps(gray, 20, 20, 30, 1.2, 1.2, 'horizontal');
%       imshow(hasil);
%
% Catatan: Fungsi ini kompatibel dengan GNU Octave.

    % Set nilai default bila parameter tidak lengkap
    if nargin < 7, flip_mode = 'horizontal'; end
    if nargin < 6, sy = 1.0; end
    if nargin < 5, sx = 1.0; end
    if nargin < 4, theta = 0; end
    if nargin < 3, dy = 0; end
    if nargin < 2, dx = 0; end

    % Konversi citra ke tipe double untuk perhitungan lebih akurat
    F = double(F);

    % 1. Translasi
    F_trans = translateImage(F, dx, dy);

    % 2. Rotasi (berpusat pada titik tengah)
    F_rot = rotateImage(F_trans, theta);

    % 3. Scaling
    F_sca = scaleImage(F_rot, sx, sy);

    % 4. Flipping
    F_flip = flipImage(F_sca, flip_mode);

    % 5. Warping (efek sinusoidal di sumbu x)
    F_warp = warpImage(F_flip);

    % Konversi hasil akhir ke tipe uint8
    G = uint8(F_warp);
end

% ---------------------------------------------------
% Sub-fungsi untuk operasi geometrik

function T = translateImage(F, dx, dy)
% TRANSLATEIMAGE Menggeser citra F sebesar dx ke kanan dan dy ke bawah.
    [height, width] = size(F);
    T = zeros(height, width);
    for y = 1:height
        for x = 1:width
            newX = x + dx;
            newY = y + dy;
            if (newX >= 1 && newX <= width && newY >= 1 && newY <= height)
                T(round(newY), round(newX)) = F(y, x);
            end
        end
    end
end

function T = rotateImage(F, theta)
% ROTATEIMAGE Memutar citra F sebesar theta derajat dengan pusat di tengah citra.
    [height, width] = size(F);
    T = zeros(height, width);
    cx = round(width / 2);
    cy = round(height / 2);
    rad = deg2rad(theta);   % Konversi theta ke radian
    for y = 1:height
        for x = 1:width
            % Hitung koordinat baru menggunakan matriks rotasi
            newX = cos(rad) * (x - cx) - sin(rad) * (y - cy) + cx;
            newY = sin(rad) * (x - cx) + cos(rad) * (y - cy) + cy;
            if (newX >= 1 && newX <= width && newY >= 1 && newY <= height)
                T(y, x) = F(round(newY), round(newX));
            end
        end
    end
end

function T = scaleImage(F, sx, sy)
% SCALEIMAGE Mengubah ukuran citra F dengan faktor sx dan sy.
    [height, width] = size(F);
    newHeight = round(height * sy);
    newWidth = round(width * sx);
    T = zeros(newHeight, newWidth);
    for y = 1:newHeight
        for x = 1:newWidth
            origY = y / sy;
            origX = x / sx;
            if origX >= 1 && origX <= width && origY >= 1 && origY <= height
                T(y, x) = F(round(origY), round(origX));
            end
        end
    end
end

function T = flipImage(F, mode)
% FLIPIMAGE Membalik citra F sesuai dengan mode:
%   'horizontal': balik secara horizontal,
%   'vertical'  : balik secara vertikal.
    if strcmpi(mode, 'horizontal')
        T = F(:, end:-1:1);
    elseif strcmpi(mode, 'vertical')
        T = F(end:-1:1, :);
    else
        error('Mode flipping harus ''horizontal'' atau ''vertical''.');
    end
end

function T = warpImage(F)
% WARPIMAGE Menerapkan efek warping sinusoidal pada sumbu x.
    [height, width] = size(F);
    T = zeros(height, width);
    A = 10;  % Amplitudo efek warping
    for y = 1:height
        for x = 1:width
            newX = x + A * sin(2 * pi * y / height);
            newY = y;
            if newX >= 1 && newX <= width
                T(y, x) = F(y, round(newX));
            else
                T(y, x) = 0;
            end
        end
    end
end
