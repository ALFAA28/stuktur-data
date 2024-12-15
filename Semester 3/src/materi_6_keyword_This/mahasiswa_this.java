/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi_6_keyword_This;

/**
 *
 * @author alfa wijaya
 */
public class mahasiswa_this {
    private String nama;
    private String NIM;
    private int usia;

    // Konstruktor
    public mahasiswa_this(String nama, String NIM, int usia) {
        this.nama = nama;
        this.NIM = NIM;
        this.usia = usia;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
        System.out.println("Usia: " + this.usia + " tahun");
    }

    // Metode untuk mengubah nama mahasiswa
    public void ubahNama(String nama) {
        this.nama = nama;
    }
    // Metode untuk mengubah nama mahasiswa
    public void ubahNIM(String NIM) {
        this.NIM = NIM;
    }
     // Metode untuk mengubah nama mahasiswa
    public void ubahusia(int usia) {
        this.usia = usia;
    }
    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        mahasiswa_this mahs = new mahasiswa_this("Budi", "12345678", 20);

        // Menampilkan informasi mahasiswa sebelum perubahan
        System.out.println("Informasi Mahasiswa sebelum perubahan:");
        mahs.tampilkanInfo();

        // Mengubah nama mahasiswa menggunakan metode ubahNama
        mahs.ubahNama("Andi");

        // Mengubah nama mahasiswa menggunakan metode ubahNama
        mahs.ubahNIM("2355201031");
        
        // Mengubah nama mahasiswa menggunakan metode ubahNama
        mahs.ubahusia(70);
        
        // Menampilkan informasi mahasiswa setelah perubahan
        System.out.println("\nInformasi Mahasiswa setelah perubahan:");
        mahs.tampilkanInfo();
    }
}

    

