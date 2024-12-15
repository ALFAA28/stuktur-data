/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2_METHOD_prosedur_fungsi;

/**
 *
 * @author alfa wijaya
 */
//public digunakan untuk kelas ini dan lain nya
public class method {

        int p = 5;
        int l = 2;
        int L ;
        
    //METHOD PROSEDUR - void      
    void luas() {
        L = p * l;
        System.out.println(L);
   }
    
    //METHOD FUNGSI - tipe data
    int Luas(){
        L = p * l;
        
        return (L);
    }
    
    public static void main(String[] args) {
      method Pp = new method();  
      Pp.luas();
      System.out.println(Pp.Luas());
    }
    
}
