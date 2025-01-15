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
public class INSERT {
     Koneksi ko = new Koneksi();

    public void insert1(int idTransaksi, int idPenumpang, String namaPenumpang, String alamat, String gr, String jenisTiket, int jmlTiket, String Maskapai, String jenisPesawat, String Rute, String jadwalTakeOff) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();

            String sql = "insert into tbltransaksi (idTransaksi, idPenumpang, namaPenumpang, alamat, gender, jenisTiket, jmlTiket, Maskapai, jenisPesawat, Rute, jadwalTakeOff)" + "values('" + idTransaksi + "','" + idPenumpang + "','" + namaPenumpang + "','" + alamat + "','" + gr + "','" + jenisTiket + "','" + jmlTiket + "','" + Maskapai + "','" + jenisPesawat + "','" + Rute + "','" + jadwalTakeOff + "');";
            
            statement.executeUpdate(sql);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    

    public void insert2(int idPilot, int idKopilot, String namaPilot, String namaKopilot, String Maskapai, String jenisPesawat, String jadwalTakeOff) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();

            String sql = "insert into tbljadwal (idPilot, idKopilot, namaPilot, namaKopilot, Maskapai, jenisPesawat, jadwalTakeOff)" + "values('" + idPilot + "','" + idKopilot + "','" + namaPilot + "','" + namaKopilot + "','" + Maskapai + "','" + jenisPesawat + "','" + jadwalTakeOff + "');";
            
            statement.executeUpdate(sql);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     public void insert3(int idPilot, String namaPilot, String gr, String umur, String jamTerbang, String bahasa, String alamat) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();

            String sql = "insert into tblpilot (idPilot, namaPilot, gender, umur, jamTerbang, bahasa, alamat)" + "values('" + idPilot + "','" + namaPilot + "','" + gr + "','" + umur + "','" + jamTerbang + "','" + bahasa + "','" + alamat + "');";
            
            statement.executeUpdate(sql);
            statement.close();
            

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
// menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
         public void insert4(int idKopilot, String namaKopilot, String gr, String umur, String jamTerbang, String bahasa, String alamat) {

        try {
            ko.koneksi();
            Statement statement = ko.connn.createStatement();

            String sql = "insert into tblkopilot (idKopilot, namaKopilot, gender, umur, jamTerbang, bahasa, alamat)" + "values('" + idKopilot + "','" + namaKopilot + "','" + gr + "','" + umur + "','" + jamTerbang + "','" + bahasa + "','" + alamat + "');";
            
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
