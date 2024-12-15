/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author alfa wijaya
 */
// bisa juga diimpor sekaligus seperti ini:
// import java.sql.*

public class koneksi {

    public static void main(String[] args) {
        
        
        koneksi tes = new koneksi();
        tes.Koneksi();
        
    }
    
    Connection conn = null;
    
    String statusKoneksi; 
    public void Koneksi() {
       
        try {
             String DB_URL = "jdbc:mysql://localhost/mahasiswa";
             String USER = "root";
             String PASS = "";
              Class.forName ("com.mysql.cj.jdbc.Driver");
             conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
             statusKoneksi = "Berhasil Koneksi";
        } catch (Exception e) {
             statusKoneksi = "Koneksi Gagal";
        }
    }

    void addRow(Object[] object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

