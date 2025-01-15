/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PEMROGRAMAN2;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alfa wijaya
 */
public class UPDATE3 {
    
    Koneksi ko = new Koneksi();

    public void ubah3( int idKopilot, String alamat, String gr, String namaKopilot, String umur, String jamTerbang, String bahasa) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();
              
             
              String sql_alamat = "update tblkopilot set alamat = '"+ alamat +"'where idKopilot = '"+idKopilot+"'";
              String sql_gender = "update tblkopilot set gender = '"+ gr +"'where idKopilot = '"+idKopilot+"'";
              String sql_idKopilot   = "update tblkopilot set idKopilot = '"+ idKopilot +"'where idKopilot = '"+idKopilot+"'";
              String sql_namaKopilot  = "update tblkopilot set namaKopilot   = '"+ namaKopilot +"'where idKopilot = '"+idKopilot+"'";
              String sql_umur = "update tblkopilot set umur = '"+ umur +"'where idKopilot = '"+idKopilot+"'";
              String sql_jamTerbang = "update tblkopilot set jamTerbang = '"+ jamTerbang+"'where idKopilot = '"+idKopilot+"'";
              String sql_bahasa = "update tblkopilot set bahasa = '"+ bahasa +"'where idKopilot = '"+idKopilot+"'";
             
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_gender);
            statement.executeUpdate(sql_idKopilot);
            statement.executeUpdate(sql_namaKopilot);
            statement.executeUpdate(sql_umur);
            statement.executeUpdate(sql_jamTerbang);
            statement.executeUpdate(sql_bahasa);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
