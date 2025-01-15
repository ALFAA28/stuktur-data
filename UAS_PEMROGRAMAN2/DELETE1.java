/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PEMROGRAMAN2;

import java.awt.event.ActionEvent;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alfa wijaya
 */
public class DELETE1 {
    Koneksi ko = new Koneksi();

    public void hapus1(int idPilot) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();

            String sql = "delete from tbljadwal where idPilot = '" + idPilot + "'"; 

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
