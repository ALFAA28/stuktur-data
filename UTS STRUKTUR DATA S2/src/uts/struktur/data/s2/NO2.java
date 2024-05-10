/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.struktur.data.s2;

/**
 *
 * @author alfa wijaya
 */
public class NO2 {
    
        /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int array1 [] = {4, 6, 8, 0, 2};
        int array2 [] = {1, 2, 3, 4, 5, 6, 7, 8};
        
        System.out.println("ARRAY KE-1");
        
         int length = array1.length + array2.length;
        
         int[] array3 = new int[length];
        
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
            System.out.println(array1[i]);
        }
        
        System.out.println("ARRAY KE-2");
        
        for (int i = 0; i < array2.length; i++){
            array3[i + array1.length] = array2[i];
            System.out.println(array2[i]);
        }
        
        System.out.println("GABUNGAN KEDUA ARRAY");
        
        for (int i = 0; i < array3.length; i++)
        System.out.println(array3[i]);
    }
}
