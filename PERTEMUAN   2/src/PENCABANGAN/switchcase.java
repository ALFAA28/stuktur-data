/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PENCABANGAN;

/**
 *
 * @author alfa wijaya
 */
public class switchcase {
    public static void main(String[] args) {

        int day = 5;
        String dayString;

        dayString = switch (day) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            case 4 -> "Kamis";
            case 5 -> "Jumat";
            case 6 -> "Sabtu";
            case 7 -> "Minggu";
            default -> "Hari tidak valid";
        };
        System.out.println(dayString);
    }
}
    

