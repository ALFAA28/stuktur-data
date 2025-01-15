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
public class UPDATE2 {
    
    Koneksi ko = new Koneksi();

    public void ubah2( int idPilot,  String namaPilot, String jamTerbang, String alamat, String umur, String gr, String bahasa) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();
              
             
              String sql_alamat = "update tblpilot set alamat = '"+ alamat +"'where idPilot = '"+idPilot+"'";
              String sql_gender = "update tblpilot set gender = '"+ gr +"'where idPilot = '"+idPilot+"'";
              String sql_idPilot1   = "update tblpilot set idPilot = '"+ idPilot +"'where idPilot = '"+idPilot+"'";
              String sql_namapilot  = "update tblpilot set namaPilot   = '"+ namaPilot +"'where idPilot = '"+idPilot+"'";
              String sql_umur = "update tblpilot set umur = '"+ umur +"'where idPilot = '"+idPilot+"'";
              String sql_jamTerbang = "update tblpilot set jamTerbang = '"+ jamTerbang+"'where idPilot = '"+idPilot+"'";
              String sql_bahasa = "update tblpilot set bahasa = '"+ bahasa +"'where idPilot = '"+idPilot+"'";
             
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_gender);
            statement.executeUpdate(sql_idPilot1);
            statement.executeUpdate(sql_namapilot);
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
