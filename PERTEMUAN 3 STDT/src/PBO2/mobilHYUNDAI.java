/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

/**
 *
 * @author ASUS
 */
public class mobilHYUNDAI {
    public static void main(String[] args) {
        mobil HYUNDAI = new mobil();
        
        HYUNDAI.merkMobil = "HYUNDAI IONIQ";
        HYUNDAI.tahunBuat = 2020;
        HYUNDAI.warnaMobil = "RED";
        
        System.out.println("warna mobil     = " + HYUNDAI.warnaMobil);
        System.out.println("Merk mobil      = " + HYUNDAI.merkMobil);
        System.out.println("Tahun Pembuatan = " + HYUNDAI.tahunBuat);
        HYUNDAI.mobilberjalan();
        HYUNDAI.mobilberhenti();
        
    }
    
}
