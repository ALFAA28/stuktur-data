/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4_inheritance;

/**
 *
 * @author alfa wijaya
 */
public class MAIN_GAME {
    public static void main(String[] args) {
        ENEMY monster = new ENEMY();
        ZOMBIE zumbi = new ZOMBIE();
        POCONG hantupocong = new POCONG();
        BURUNG garuda = new BURUNG();
        
        monster.attack();
        garuda.walk();
        garuda.fly();
        garuda.jump();
        zumbi.walk();
        hantupocong.jump();
        System.out.println("NAMA      :      " + zumbi.nama);
        System.out.println("HP        :      " + zumbi.hp);
        System.out.println("ATTACPOIN :      " + zumbi.attacpoin);
        
    }
    
}
