/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_11_interface;

import java.util.Scanner;

/**
 *
 * @author alfa wijaya
 */
public class Main {
    public static void main(String[] args) {
      Phone Xiaomi = new Xiaomi();
      Phone Iphone = new Iphone();
      Phone Samsung = new Samsung();
      Phone Oppo= new Oppo();

      
      Scanner input = new Scanner (System.in);
      String aksi;
      
      while (true) { 
          System.out.println("\n====== APLIKASI INTERFACE ======");
          System.out.println("[1] Xiaomi");
          System.out.println("[2] Iphone");
          System.out.println("[3] Samsung");
          System.out.println("[4] Oppo");
          System.out.println("[0] Keluar");
          System.out.print("PILIH HP: ");
          String hp = input.nextLine();
          PhoneUser ALFA;
          if (hp.equals("1")) {
              ALFA = new PhoneUser(Xiaomi);
          } else if (hp.equals("2")) {
              ALFA = new PhoneUser(Iphone);
          } else if (hp.equals("3")) {
              ALFA = new PhoneUser(Samsung);
           } else if (hp.equals("4")) {
              ALFA = new PhoneUser(Oppo);   
          } else if (hp.equals("0")) {
              break;
           } else { 
              System.out.println("Pilihan tidak valid!");
          continue;
    }
      
      while(true) {
          System.out.println("======APLIKASI INTERFAC======");
          System.out.println("[1] NYALAKAN HP");
          System.out.println("[2] MATIKAN HP");
          System.out.println("[3] PERBESAR VOLUME");
          System.out.println("[4] KECILKAN VOLUME");          
          System.out.println("[0] KEMBALI");
          System.out.println("PILIHAN AKSI");  
          
          aksi = input.nextLine();
          
          if(aksi.equals("1")) {
             ALFA.turnOnThePhone();
          }else if (aksi.equals("2")){
              ALFA.turnOffThePhone();
          }else if (aksi.equals("3")){
              ALFA.makePhoneLouder();
          }else if (aksi.equals("4")){
              ALFA.makePhoneSilent();
          }else if (aksi.equals("0")){
              break;
          }
          else{
              System.out.println("SALAH COYYYYYY");
          }
      }
    }
    input.close();
}
}
