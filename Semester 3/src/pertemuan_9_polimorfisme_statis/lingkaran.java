/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_9_polimorfisme_statis;

/**
 *
 * @author alfa wijaya
 */
public class lingkaran {
    
    float luas (float jari2) {
        return (float) (Math.PI * jari2 * jari2);    
    }
    double luas (double diameter) {
        return (double) (Math.PI * diameter * 1/4);
    }
    public static void main(String[] args) {
        lingkaran LK = new lingkaran();
        
         float jari = 40;
         double d = 50;
         
         System.out.println("LUAS JARI-JARI LINGKARAN = " + LK.luas(jari));
         System.out.println("LUAS DIAMETER LINGKARAN  = " + LK.luas(d));
    }
    
}
