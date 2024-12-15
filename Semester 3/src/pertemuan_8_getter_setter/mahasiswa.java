/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_8_getter_setter;

/**
 *
 * @author alfa wijaya
 */
public class mahasiswa {
    private String nama;
    private String nim;
    private int umur;
    
    public void setnama (String nama){
        this.nama = nama;
    }
    
    public void setnim (String nim){
      this.nim = nim;  
    }
    
    public void setumur (int umur){
        this.umur = umur;
    }
    
    public String getnama(){
        return this.nama;
    }
    
    public String getnim (){
        return this.nim;
    }
    
    public int getumur (){
        return this.umur;
    }
}
