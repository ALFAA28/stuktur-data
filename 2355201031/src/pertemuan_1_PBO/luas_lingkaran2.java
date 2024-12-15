/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_1_PBO;

import javax.swing.JOptionPane;

/**
 *
 * @author alfa wijaya
 */
public class luas_lingkaran2 {
    
    public static void main(String[] args) {
        
        double phi = 3.14;
        String jari2 = JOptionPane.showInputDialog("masukkan input jari-jari");
        double luas = phi * (Double.parseDouble(jari2)*Double.parseDouble(jari2));
        
        System.out.println(luas);
    }
    
}
