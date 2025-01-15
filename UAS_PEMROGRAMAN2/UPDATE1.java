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
public class UPDATE1 {
    Koneksi ko = new Koneksi();

    public void ubah1( int idPilot,  int idKopilot, String namaPilot, String namaKopilot, String Maskapai, String jadwalTakeOff, String jenisPesawat) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();
              
              String sql_idKopilot = "update tbljadwal set idKopilot = '"+ idKopilot +"'where idPilot = '"+idPilot+"'";
              String sql_namaKopilot = "update tbljadwal set namaKopilot = '"+ namaKopilot +"'where idPilot = '"+idPilot+"'";
              String sql_idPilot   = "update tbljadwal set idPilot = '"+ idPilot +"'where idPilot = '"+idPilot+"'";
              String sql_namapilot  = "update tbljadwal set namaPilot   = '"+ namaPilot +"'where idPilot = '"+idPilot+"'";
              String sql_maskapai = "update tbljadwal set Maskapai = '"+ Maskapai +"'where idPilot = '"+idPilot+"'";
              String sql_jadwalTakeOff = "update tbljadwal set jadwalTakeOff = '"+ jadwalTakeOff+"'where idPilot = '"+idPilot+"'";
              String sql_jenisPesawat = "update tbljadwal set jenisPesawat = '"+ jenisPesawat+"'where idPilot = '"+idPilot+"'";
              
            statement.executeUpdate(sql_idKopilot);  
            statement.executeUpdate(sql_namaKopilot);    
            statement.executeUpdate(sql_idPilot);
            statement.executeUpdate(sql_namapilot);
            statement.executeUpdate(sql_maskapai);
            statement.executeUpdate(sql_jadwalTakeOff);
            statement.executeUpdate(sql_jenisPesawat);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
