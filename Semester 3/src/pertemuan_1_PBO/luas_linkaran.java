/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_1_PBO;

/**
 *
 * @author alfa wijaya
 */
public class luas_linkaran {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        rumus2 L = new rumus2();
        
        L.phi = 3.14;
        L.jari2 = 10;
        
        L.luas = L.phi * (L.jari2 * L.jari2);
        
        System.out.println("phi        = " + L.phi);
        System.out.println("jari-jari  = " + L.jari2);
        System.out.println("Luas       = " + L.luas);
        
    }
}