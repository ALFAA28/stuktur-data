/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_penilaian_mahasiswa;

/**
 *
 * @author alfa wijaya
 */

public class Nilaimahasiswa {
double Nilai;
String Nama;

public String NAMA(String Nama){
    this.Nama = Nama;
    
    return Nama;
}

public double NILAI(double Nilai){
    this.Nilai = Nilai;
    
    return Nilai;
}

public void KETERANGAN(){
    if (Nilai >= 70){
        System.out.println("LULUS");
    }
    else{
        System.out.println("TIDAK LULUS");
    }
}

    public static void main(String[] args) {
        Nilaimahasiswa Nm = new Nilaimahasiswa();
    
        System.out.println("NAMA        = " + Nm.NAMA("ALFA")); 
        System.out.println("NILAI       = " + Nm.NILAI(60)); 
        System.out.print(  "KETERANGAN  = " );
        Nm.KETERANGAN();   
        
        System.out.println("NAMA        = " + Nm.NAMA("bagus")); 
        System.out.println("NILAI       = " + Nm.NILAI(80)); 
        System.out.print(  "KETERANGAN  = " );
        Nm.KETERANGAN();

    
    }
}
