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
public class UPDATE {
    
     Koneksi ko = new Koneksi();

    public void ubah(int idTransaksi, int idPenumpang, String namaPenumpang, String alamat, String gr, String jenisTiket, int jmlTiket, String Maskapai, String jenisPesawat, String Rute, String jadwalTakeOff) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();
              String sql_idPenumpang   = "update tbltransaksi set idPenumpang = '"+ idPenumpang +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_namapenumpang   = "update tbltransaksi set namaPenumpang   = '"+ namaPenumpang +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_alamat = "update tbltransaksi set alamat = '"+ alamat +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_gender = "update tbltransaksi set gender = '"+ gr +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_jenisTiket = "update tbltransaksi set jenisTiket = '"+ jenisTiket +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_jmlTiket = "update tbltransaksi set jmlTiket = '"+ jmlTiket +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_Maskapai = "update tbltransaksi set Maskapai = '"+ Maskapai +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_jenisPesawat = "update tbltransaksi set jenisPesawat = '"+ jenisPesawat +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_Rute = "update tbltransaksi set Rute = '"+ Rute +"'where idTransaksi = '"+idTransaksi+"'";
              String sql_jadwalTakeOff = "update tbltransaksi set jadwalTakeOff = '"+ jadwalTakeOff +"'where idTransaksi = '"+idTransaksi+"'";

            statement.executeUpdate(sql_idPenumpang);
            statement.executeUpdate(sql_namapenumpang);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_gender);
            statement.executeUpdate(sql_jenisTiket);
            statement.executeUpdate(sql_jmlTiket);
            statement.executeUpdate(sql_Maskapai);
            statement.executeUpdate(sql_jenisPesawat);
            statement.executeUpdate(sql_Rute);
            statement.executeUpdate(sql_jadwalTakeOff);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
