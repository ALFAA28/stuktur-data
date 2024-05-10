/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.struktur.data.s2;

/**
 *
 * @author alfa wijaya
 */
public class NO4 {

    public static void main(String[] args) {
        
        int array [] = {1, 2, 2, 3, 4, 4, 5};
        int n = array.length;
        
        if (n == 0 || n == 1) {
            return;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }

        temp[j++] = array[n - 1];

        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }

        System.out.println("ARRAY SETELAH MENGHAPUS DUPLIKAT : ");
        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
