/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomer3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Asrori_TugasNomer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("sediakan gula dan kopi");
        System.out.println("campur kopi dan gula");
        System.out.println("masak air sampai mendidih");
        System.out.println("tuang air kedalam gelas");
        System.out.println("cicipi kopi");
        System.out.println("jika kopi terlalu pahit(true/false)");
        Scanner s = new Scanner(System.in);
        boolean pahit = s.nextBoolean();
        if (pahit == true){
            System.out.println("tambahkan gula");
        }
        System.out.println("cicipi kopi");
        System.out.println("kopi siap dinikmati ! ");
        
        //Perulangan
        for(int a=1;a<=3;a++){
            
        //Input dan Output
        System.out.println("Kopi nya Sangat Nikmat ");
        Scanner br = new Scanner(System.in);
                 String kopi = br.nextLine();
        }
        
    }
    
}
