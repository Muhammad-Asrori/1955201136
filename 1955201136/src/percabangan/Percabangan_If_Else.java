/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Percabangan_If_Else {
    public static void main(String[] args) {
        String nama, mapel;
        int nilai;
        
        Scanner io = new Scanner(System.in);
        
        System.out.println("Nama Kamu : ");
        nama = io.nextLine();
        
        System.out.println("Mata Pelajaran : ");
        mapel = io.nextLine();
        
        System.out.println("Nilai Kamu : ");
        nilai = io.nextInt();
        
        if(nilai > 70){
            System.out.println("Selamat Kamu Lulus !");
        }else{
            System.out.println("Kamu Tidak Lulus, Belajar Lagi!");
        }
    }
}
