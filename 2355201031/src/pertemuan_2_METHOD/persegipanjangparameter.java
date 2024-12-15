/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2_METHOD;

/**
 *
 * @author alfa wijaya
 */
//parameter digunakan agar bisa menambahkan 
public class persegipanjangparameter {
    public void luas(int p, int l){
        int L = p * l;
        System.out.println(L);
    }
    
    public int keliling(int p, int l){
        int K = 2 * (p+l);
        return K;
    }
    public static void main(String[] args) {
        persegipanjangparameter Ppp = new persegipanjangparameter();
        System.out.print("LUAS : ");
        Ppp.luas (10,5); 
        System.out.print("LUAS : ");
        Ppp.luas(100,50);
        
        System.out.println("KELILING : " + Ppp.keliling(10,5));
        System.out.println("KELILING : " + Ppp.keliling(100,50));
    }
    
}
