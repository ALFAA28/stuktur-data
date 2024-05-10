/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.struktur.data.s2;

/**
 *
 * @author alfa wijaya
 */
public class NO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        int angka [] = {1, 2, 7, 4, 6, 8, 7};
        
        System.out.println("SEBELUM DI BALIK");
        
          for (int j = 0; j < angka.length ; j++) {
             System.out.println(angka[j]);
        }
    
        for (int i = 0; i < angka.length / 2; i++) {
            int temp = angka[i];
            angka[i] = angka[angka.length - 1 - i];
            angka[angka.length - 1 - i] = temp;
        }
        System.out.println("SESUDAH DI BALIK");
        
        // Mencetak array yang telah dibalik
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        
    }
    
}
