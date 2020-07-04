/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TugasScanner {
    public static void main(String[] args) {
        String nama, alamat, jenis ;
        int noHp;
        double berat;
        Scanner InputUser = new Scanner(System.in);
        
        System.out.println("Nama Anda Siapa ?");
        nama = InputUser.nextLine();
        
        System.out.println("Alamat Rumah ?");
        alamat = InputUser.nextLine();
        
        System.out.println("Jenis Cucian ?");
        jenis = InputUser.nextLine();
        
        System.out.println("Berapa Nomer HP kamu ?");
        noHp = Integer.parseInt(InputUser.nextLine());
        
        System.out.println("Berapa Berat Cucian Anda ? ");
        berat = Double.parseDouble(InputUser.nextLine());
        
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jenis Cucian : " + jenis);
        System.out.println("Nomer HP : " + noHp);
        System.out.println("Berat Cucian : " + berat + "kg");
    }
}
