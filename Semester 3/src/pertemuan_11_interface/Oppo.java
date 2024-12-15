/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_11_interface;

import static pertemuan_11_interface.Phone.MAX_VOLUME;
import static pertemuan_11_interface.Phone.MIN_VOLUME;

/**
 *
 * @author alfa wijaya
 */
public class Oppo implements Phone {
  
    private int volume;
    private boolean isPowerOn;
    
    public Oppo () {
        this.volume = 40;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("HANDPHONE MENYALA ABANGKUUUUU...");
        System.out.println("SELAMAT DATANG DI OPPO");
        System.out.println("ANDROID VERSI 40000");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("HANDPHONE DI MATIKAN");
    }

    @Override
    public void volumeUp() {
        if(isPowerOn) {
            if(this.volume == MAX_VOLUME) {
                System.out.println("VOLUME fULLL");
                System.out.println("SUDAH  " + this.getVolume() + "%");
            }else{
                this.volume+= 30;
                System.out.println("VOLUME SEKARANG: " + this.getVolume());
            }
        }else{
            System.out.println("NYALAKAN DULU HP LUUU BRO..!!");
        }
    }

    @Override
    public void volumeDown() {
        if(isPowerOn) {
            if(this.volume == MIN_VOLUME) {
                System.out.println("VOLUME DAH PALING RENDAH NIH");
                System.out.println("SUDAH  " + this.getVolume() + "%");
            }else{
                this.volume-= 20;
                System.out.println("VOLUME SEKARANG: " + this.getVolume());
            }
        }else{
            System.out.println("NYALAKAN DULU HP LUUU BRO..!!");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
}
