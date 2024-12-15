/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi_7_Method_Constructor;

/**
 *
 * @author alfa wijaya
 */
public class username {
    String nama;
    String umur;
    double ikan;
    
    public username(String nama, String umur, double ikan){
        this.nama = nama;
        this.umur = umur;
        this.ikan = ikan;
    }

    public static void main(String[] args) {
        username nelayan = new username("nelayancode", "23", 12);
        System.out.println("nama           : " + nelayan.nama);
        System.out.println("umur           : " + nelayan.umur);
        System.out.println("ikan diperoleh : " + nelayan.ikan);
    }
}

