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
public class hapus {
     koneksi kon = new koneksi();

    public void delete(long nim) {

        try {
            kon.Koneksi();
            Statement statement = kon.conn.createStatement();

            String sql = "delete from identitas where nim = '" + nim + "'"; 

            statement.executeUpdate(sql);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
