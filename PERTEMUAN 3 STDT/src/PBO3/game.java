/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO3;

/**
 *
 * @author ASUS
 */
public class game 
{
    public static void main(String[] args) 
    {
        player petani = new player();
        
        petani.name = "M ALFA W";
        petani.speed = 999;
        petani.healthPoin = 0;
        
        petani.run();
        
        if(petani.isDead())
        {
            System.out.println("Game Over!");
        }
    }
}
