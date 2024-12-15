/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3_modifier;

/**
 *
 * @author alfa wijaya
 */
//pulic
public class Nilaimahasiswa_modifier {
        //private
    private double nilai;
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public void keterangan() {
        if (nilai >= 70) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }

    public static void main(String[] args) {
        Nilaimahasiswa_modifier nm = new Nilaimahasiswa_modifier();
        
        nm.setNama("ALFA");
        nm.setNilai(60);
        System.out.println("NAMA = " + nm.getNama()); 
        System.out.println("NILAI = " + nm.getNilai());
        System.out.print("KETERANGAN = ");
        nm.keterangan();
        
        nm.setNama("Bagus");
        nm.setNilai(80);
        System.out.println("NAMA = " + nm.getNama());
        System.out.println("NILAI = " + nm.getNilai());
        System.out.print("KETERANGAN = ");
        nm.keterangan();
        
    }
}

//protected
class NilaiDetil extends Nilaimahasiswa_modifier{
    protected String mataKuliah;

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void tampilkanDetil() {
        System.out.println("Nama: " + getNama());
        System.out.println("Nilai: " + getNilai());
        System.out.println("Mata Kuliah: " + mataKuliah);
        keterangan();
    }

    public static void main(String[] args) {
        NilaiDetil nd = new NilaiDetil();
        nd.setNama("ALFA");
        nd.setNilai(85);
        nd.setMataKuliah("Matematika");

        nd.tampilkanDetil();
    }
}

    
