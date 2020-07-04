/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class TugasBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String nama, alamat, pesanan, hari ;
        int total;
        double harga;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Nama Anda?");
        nama = br.readLine();
        
        System.out.println("Alamat ?");
        alamat = br.readLine();
        
        System.out.println("Mau Pesan Kue yang Gimana ?");
        pesanan = br.readLine();
        
        System.out.println("Buat Hari Apa ?");
        hari = br.readLine();
        
        System.out.println("Anda Minta Harga yang Berapa ?");
        harga = Double.parseDouble(br.readLine());
        
        System.out.println("Pesan Berapa Biji ?");
        total = Integer.parseInt(br.readLine());
        
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jenis Pesanan : " + pesanan);
        System.out.println("Diambil hari : " + hari);
        System.out.println("Dengan Harga Rp" + harga);
        System.out.println("Jumlah Pesanan " + total + " biji");
    }
    
}
