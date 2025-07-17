%tugas praktikum 1%

%NAMA   : MUHAMMAD ALFA WIJAYA
%NIM    : 2355201031
%PRODI  : ILMU KOMPUTER SMT4
%MATKUL : PENGOLAHAN CITRA

%membaca citra%
Img = imread ('D:\tugas_kuliah\RAR\image\kotatua.tif');

%menampilkan citra%

imshow(Img);

%menampilkan ukuran citra%

Ukuran = size(Img);

%mengkonversi citra warna ke grayscale%

RGB = imread ('D:\tugas_kuliah\RAR\image\dedaunan.png');
Abu = rgb2gray(RGB);
imshow(Abu);

%mengkonversi citra grayscale ke biner%

Img = imread('D:\tugas_kuliah\RAR\image\kartun.tif');
[tinggi, lebar] = size(Img);
ambang = 210; % Nilai ini bisa diubah-ubah
Biner = zeros(tinggi, lebar);
for baris=1 : tinggi
for kolom=1 : lebar
if Img(baris, kolom) >= ambang
Biner(baris, kolom) = 0;
else
Biner(baris, kolom) = 1;
end
end
end
subplot(1,3,3), imshow(Biner), title('Citra Biner');



%menyimpan citra%

RGB = imread ('D:\tugas_kuliah\RAR\image\dedaunan.png');
Abu =255 - rgb2gray(RGB);
imwrite(Abu, 'D:\tugas_kuliah\RAR\image\gray_dedaunan.png');

