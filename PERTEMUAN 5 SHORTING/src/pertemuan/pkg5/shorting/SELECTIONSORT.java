/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5.shorting;

/**
 *
 * @author alfa wijaya
 */
public class SELECTIONSORT {
    void sort(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
            System.out.println();
    
}
    public static void main(String args[])
    {
        int arr[] = {333,35,00,4323,17};
                System.out.println("SEBELUM DI GUNAKAN INSERTION SORT");
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i] + "");
            }
                System.out.println("");
                SELECTIONSORT ob = new SELECTIONSORT();
                ob.sort(arr);
                System.out.println("SESUDAH DI GUNAKAN INSERTION SORT");
            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i] + "");
            }
        System.out.println("");
    }
}
