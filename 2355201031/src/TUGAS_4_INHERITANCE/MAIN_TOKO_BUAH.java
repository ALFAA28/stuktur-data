/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_4_INHERITANCE;

/**
 *
 * @author alfa wijaya
 */
public class MAIN_TOKO_BUAH {
    public static void main(String[] args) {
     
    LIST list = new LIST();
    JERUK jeruk = new JERUK();
    MANGGA mangga = new MANGGA();
    
    list.pertanyaan();
        System.out.println("");
    jeruk.STOK();
    jeruk.TERJUAL();
    mangga.STOK();
    mangga.TERJUAL();
        System.out.println("");
    System.out.println("NAMA PEMBELI  =  " + list.nama("alfa"));
    System.out.println("JULAH BUAH/KG =  " + list.jumlah("2"));
    System.out.println("JENIS BUAH    =  " + list.buah("JERUK"));
        System.out.println("");
    System.out.println("NAMA PEMBELI   =  " + list.nama("BRE"));
    System.out.println("JULAH BUAH/KG =  " + list.jumlah("7"));
    System.out.println("JENIS BUAH    =  " + list.buah("MANGGA"));
  }  
}
