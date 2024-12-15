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
public class ubah {
    
   koneksi kon = new koneksi();

    public void update(long nim, String nama, String alamat, String gr) {

        try {
            kon.Koneksi();
            Statement statement = kon.conn.createStatement();
              String sql_nama   = "update identitas set nama   = '"+ nama +"'where nim = '"+nim+"'";
              String sql_alamat = "update identitas set alamat = '"+ alamat +"'where nim = '"+nim+"'";
              String sql_gender = "update identitas set gender = '"+ gr +"'where nim = '"+nim+"'";

            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_gender);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    
}
