/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author alfa wijaya
 */
//static berfungsi agar tidak perlu menambah objek baru
public class persegipanjangstatic {
    //method prosedur
     static void luas(int p, int l){
        int L = p * l;
        System.out.println(L);
    }
    //method fungsi
    static int keliling(int p, int l){
        int K = 2 * (p+l);
        return K;
    }
    public static void main(String[] args) {
        
        System.out.print("LUAS : ");
        luas (10,5); 
        System.out.print("LUAS : ");
        luas(100,50);
        
        System.out.println("KELILING : " + keliling(10,5));
        System.out.println("KELILING : " + keliling(100,50));
    }
}
