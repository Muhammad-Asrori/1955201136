/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class TugasJOptionPane {
    public static void main(String[] args) {
       
        String nama, alamat, jalur;
        int sks;
        double registrasi;
        
        nama = JOptionPane.showInputDialog("Siapa Nama Anda ?");
        JOptionPane.showMessageDialog(null,"Nama : " + nama);
        
        alamat = JOptionPane.showInputDialog("Alamat Rumah ?");
        JOptionPane.showMessageDialog(null,"Alamat : " + alamat);
        
        jalur = JOptionPane.showInputDialog("Lewat Jalur Pendaftaran Apa ?");
        JOptionPane.showMessageDialog(null,"Anda Memilih Jalur " + jalur);
        
        registrasi = JOptionPane.showConfirmDialog(null, "Bayar Registrasi Rp.2.000.000", "KONFIRMASI", JOptionPane.DEFAULT_OPTION);
        sks = JOptionPane.showConfirmDialog(null,"Akan Ada 20 SKS !", "KONFIRMASI", JOptionPane.YES_NO_OPTION);
        
        JOptionPane.showMessageDialog(null,"Anda Telah MengKonfirmasi");
    }
}