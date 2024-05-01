/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5.shorting;

/**
 *
 * @author alfa wijaya
 */
public class INSERTIONSORT {
    
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");

                System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 178, 0, 19, 1234, 54 };
                System.out.println("SEBELUM DI GUNAKAN INSERTION SORT");
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i] + "");
            }
                System.out.println("");
                INSERTIONSORT ob = new INSERTIONSORT ();
                ob.sort(arr);
            
                System.out.println("SESUDAH DI GUNAKAN INSERTION SORT");
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i] + "");
            }
        System.out.println("");
    }   
}
