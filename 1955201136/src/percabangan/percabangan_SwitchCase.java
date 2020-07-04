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
public class percabangan_SwitchCase {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nilai Kamu : ");
              int nilai = input.nextInt();
              
        switch(nilai){
            case 10:
                System.out.println("Nilai Kamu Sempurna ");
                break;
            case 9:
                System.out.println("Nilai Kamu Sangat Bagus");
                break;
            case 8:
                System.out.println("Nilai Kamu Bagus");
                break;
            case 7:
                System.out.println("Nilai Kamu Cukup");
                break;
            case 6:
                System.out.println("Nilai Kamu Kurang");
                break;
            case 5 :
                System.out.println("Nilai Kamu Sangat Kurang");
                break;
            default :
                System.out.println("Nilai Kamu Jelek Sekali");
        }
    }
}
