/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg5.shorting;

/**
 *
 * @author alfa wijaya
 */
public class BUBBLESORT {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) 
{
int arraytest[] ={233,10,1,0,95,536,41};

            System.out.println("ARRAY SEBELUM DIGUNAKAN BUBBLE SORT");
        for(int i = 0; i < arraytest.length; i++)
        {
            System.out.print(arraytest[i] + " ");
            System.out.println("");
        }
            System.out.println();
            bubbleSort(arraytest); 
            System.out.println("ARRAY SESUDAH DIGUNAKAN BUBBLE SORT");
        for(int i = 0; i < arraytest.length; i++)
        {
            System.out.print(arraytest[i] + " ");
            System.out.println("");
        }
    System.out.println("");
}   

static void bubbleSort(int[] arraytest) 
    {
    int n = arraytest.length; 
    int temp = 0;
        for(int i = 0; i < n; i++)  
        { 
        for(int j = 1; j < (n-i); j++)
        {
            if(arraytest[j - 1] > arraytest[j])
            { 
                temp = arraytest[j - 1]; 
                arraytest[j - 1] = arraytest[j]; 
                arraytest[j] = temp; 
            }
        }
        }
    
    }
}

