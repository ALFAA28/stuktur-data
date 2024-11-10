/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author alfa wijaya
 */
public class penjualan_buah {
     public static void main(String[] args) {
        MasterHarga L = new MasterHarga();
        
        L.anggur = 33000;
        L.jeruk = 15000;
        L.semangka = 13000;
        L.durian = 120000;
        L.mangga = 20000;
        L.apel =19000;
        L.jumlah = L.anggur + L.jeruk + L.semangka;
        
        System.out.println("================HARGA BARANG DI TOKO==================");
        System.out.println("Anggur/kg      = " + L.anggur);
        System.out.println("Jeruk/kg       = " + L.jeruk);
        System.out.println("Semangka/kg    = " + L.semangka);
        System.out.println("Durian/kg      = " + L.durian);
        System.out.println("Mangga/kg      = " + L.mangga);
        System.out.println("Apel/kg        = " + L.apel);
        
        System.out.println("");
        
        System.out.println("=-Jumlah Buah YG Dibeli-=");
        System.out.println("anggur/kg      = " + L.anggur);
        System.out.println("jeruk/kg       = " + L.jeruk);
        System.out.println("semangka/kg    = " + L.semangka);
        
        System.out.println("");

        System.out.println("Harga Semua Buah YG Dibeli = " + L.jumlah);
        
         System.out.println("");
    }

    
}
