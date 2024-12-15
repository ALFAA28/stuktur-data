/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;


import java.sql.Statement;
import javax.swing.JOptionPane;
import java.lang.Long;

/**
 *
 * @author alfa wijaya
 */
public class insert {

    koneksi kon = new koneksi();

    public void insert(long nim, String nama, String alamat, String gr) {

        try {
            kon.Koneksi();
            Statement statement = kon.conn.createStatement();

            String sql = "insert into identitas (nim, nama, alamat, gender)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + gr + "');";
            
            statement.executeUpdate(sql);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
