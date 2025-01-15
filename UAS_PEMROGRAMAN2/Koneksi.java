/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PEMROGRAMAN2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alfa wijaya
 */
public class Koneksi {

    public static void main(String[] args) {
        
        
        Koneksi tes = new Koneksi();
        tes.koneksi();
        
    }
    
    Connection connn = null;
    
    String statusKoneksi; 
    public void koneksi() {
       
        try {
             String DB_URL = "jdbc:mysql://localhost/dbbandara_1031";
             String USER = "root";
             String PASS = "";
              Class.forName ("com.mysql.cj.jdbc.Driver");
             connn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
             statusKoneksi = "Terkoneksi";
        } catch (Exception e) {
             statusKoneksi = "Tidak Terkoneksi";
        }
    }
    
}
