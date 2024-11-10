/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_penilaian_mahasiswa;

/**
 *
 * @author alfa wijaya
 */
import java.util.Scanner;
public class Nilaimahasiswa {
            
    // Method fungsi untuk menentukan keterangan lulus atau tidak
    public static String tentukanKeterangan(int nilai) {
        return (nilai > 70) ? "LULUS" : "TIDAK LULUS";
    }

    // Method prosedur untuk menampilkan hasil
    public static void tampilkanHasil(String nama, int nilai, String keterangan) {
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Keterangan: " + keterangan);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input nama dan nilai
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = scanner.nextInt();

        // Tentukan keterangan lulus atau tidak
        String keterangan = tentukanKeterangan(nilai);

        // Tampilkan hasil
        tampilkanHasil(nama, nilai, keterangan);
    }
}
