/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_10_polimorfisme_dinamis;

/**
 *
 * @author alfa wijaya
 */
public class main {
    
    public static void main(String[] args) {
    hewan h = new hewan();
    anjing a = new anjing();
    sapi s = new sapi();
    serigala sr = new serigala();
    
        System.out.println("SUARA ANJING ");
        a.suara();
        System.out.println("SUARA SAPI");
        s.suara();
        System.out.println("SUARA SERIGALA");
        sr.suara();
    }
}
