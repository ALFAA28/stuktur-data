/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//// */
package TUGAS_PERTEMUAN2_KRS;

/**
 *
 * @author alfa wijaya
 */
public class GabunganSemua {

    public static void main(String[] args) {
        MasterDosen D = new MasterDosen();
        MasterMahasiswa M = new MasterMahasiswa();
        MasterMatkul K = new MasterMatkul();
        MasterSKSnJadwal S = new MasterSKSnJadwal();

        S.Jumlah = S.sks5 + S.sks5 + S.sks7 + S.sks5 + S.sks6 + S.sks7 + S.sks6;

        System.out.println("Mahasiswa     : " + M.NIM + "-" + M.alfa);
        System.out.println("Dosen Wali    : " + M.vera + "-" + M.dosenwali);
        System.out.println("Fakultas      : " + M.fakultas);
        System.out.println("Jurusan       : " + M.jurusan);
        System.out.println("Jenis Kelamin : " + M.gender);
        System.out.println("");
        System.out.println("KRS sudah dikunci oleh VERADELLA YUELISA MAFULA, S.Kom., M.Kom. pada tanggal 9");
        System.out.println("      September 2024, 06:46:40, hubungi petugas akademik untuk mengubah");
        System.out.println("");
        System.out.println("//=====================================================================================================================//");
        System.out.println("//                              Kartu Rencana Studi (KRS) - Semesteer Gasal 2024 - 2025                                //");
        System.out.println("//=====================================================================================================================//");
        System.out.println("// No. //        Nama Matakuliah             // SKS  //         Jadwal        //         Dosen Pengajar                //");
        System.out.println("//-----//------------------------------------//------//-----------------------//---------------------------------------//");
        System.out.println("//  1  //" + " " + K.bina + "                   //" + "  " + S.sks2 + "   // " + S.bina + "  //" + " " + D.wempi + "   " + "//");
        System.out.println("//-----//------------------------------------//------//-----------------------//---------------------------------------//");
        System.out.println("//  2  //" + " " + K.bing + "                   //" + "  " + S.sks2 + "   // " + S.bing + "  //" + " " + D.winda + "     " + "//");
        System.out.println("//-----//------------------------------------//------//-----------------------//---------------------------------------//");
        System.out.println("//  3  //" + " " + K.pem2 + "                      //" + "  " + S.sks4 + "   // " + S.pem2 + "   //" + " " + D.charis + "    " + "//");
        System.out.println("//-----//------------------------------------//------//-----------------------//---------------------------------------//");
        System.out.println("//  4  //" + " " + K.tba + "          //" + "  " + S.sks2 + "   // " + S.tba + "  //" + " " + D.huda + " " + "//");
        System.out.println("//-----//------------------------------------//------//-----------------------//---------------------------------------//");
        System.out.println("//  5  //" + " " + K.sp + "            //" + "  " + S.sks3 + "   // " + S.sp + " //" + " " + D.vita + "      " + "//");
        System.out.println("//-----//------------------------------------//------//-----------------------//---------------------------------------//");
        System.out.println("//  6  //" + " " + K.sbd + "                  //" + "  " + S.sks4 + "   // " + S.sbd + " //" + " " + D.tito + "                  " + "//");
        System.out.println("//-----//------------------------------------//------//-----------------------//---------------------------------------//");
        System.out.println("//  7  //" + " " + K.aok + " //" + "  " + S.sks3 + "   // " + S.aok + "  //" + " " + D.imam + "              " + "//");
        System.out.println("//-----//------------------------------------//------//-----------------------//---------------------------------------//");
        System.out.println("//                                           //" + "  " + S.Jumlah + "  " + "//                                                                //");
        System.out.println("//-------------------------------------------//------//----------------------------------------------------------------//");
    }

}
