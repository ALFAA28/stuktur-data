/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.struktur.data.s2;

/**
 *
 * @author alfa wijaya
 */
public class NO7 {
   
    public static void main(String[] args) {
        String[] names = {"WANWAN", "FIKO", "ARDI", "NANA", "ODETTE", "AZIZ", "KHALID"};

        System.out.println("Array asli: ");
        printArray(names);
        
        bubbleSort(names.clone());
        insertionSort(names.clone());
        selectionSort(names.clone());
        
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
     public static void bubbleSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        System.out.println("\nArray setelah Bubble Sort: ");
        printArray(array);
    }

    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        System.out.println("\nArray setelah Insertion Sort: ");
        printArray(array);
    }

    public static void selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j].compareTo(array[min_idx]) < 0)
                    min_idx = j;

            String temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }

        System.out.println("\nArray setelah Selection Sort: ");
        printArray(array);
        System.out.println();
    }   
}
