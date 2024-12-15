/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_8_getter_setter;

/**
 *
 * @author alfa wijaya
 */
public class main {
    public static void main(String[] args) {
        mahasiswa m = new mahasiswa();
        
        m.setnama("ALFA");
        m.setnim("2355201031");
        m.setumur(21);
        
        System.out.println("Nama   : " + m.getnama());
        System.out.println("NIM    : " + m.getnim());
        System.out.println("Umur   : " + m.getumur());
        
  }
  
}
