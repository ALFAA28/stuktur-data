/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2_METHOD;

/**
 *
 * @author alfa wijaya
 */
public class persegi_panjang {
    int p = 10;
    int l = 5;
    
    public void luas(){
        int L = p * l;
        System.out.println(L);
    }
    
    public int keliling(){
        int K = 2 * (p+l);
        return K;
    }
    public static void main(String[] args) {
        //method prosedur
        persegi_panjang Pp = new persegi_panjang();
        System.out.print(" LUAS : ");
        Pp.luas();
        
        //method fungsi
        System.out.println("KELILING : " + Pp.keliling());
    }
    
}
