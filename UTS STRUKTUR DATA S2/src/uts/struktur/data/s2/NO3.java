/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.struktur.data.s2;

/**
 *
 * @author alfa wijaya
 */
public class NO3 {

    public static void main(String[] args) {
        
        int[] array = {8, 9, 1, 3, 4, 2, 8};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] freq = new int[max + 1];

        for (int i = 0; i < array.length; i++) {
            freq[array[i]]++;
        }

        System.out.println("JUMLAH KEMUNCULAN SETIAP KEMUNCULAN : ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("ELEMEN " + i + " MUNCUL " + freq[i] + " KALI");
            }
        }
    }
}