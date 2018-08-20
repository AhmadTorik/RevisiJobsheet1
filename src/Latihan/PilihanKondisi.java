/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PilihanKondisi {
    public static void main (String[]Torik){
            Scanner masukan = new Scanner (System.in);
            System.out.println("Silahkan pilih Dia(1) Atau Aku(2) Atau Orang Tuamu(3) :");
            int bil = masukan.nextInt();
            switch (bil){
                case 1 : System.out.println("Dia");
                break;
                 case 2 : System.out.println("Aku");
                break;
                 case 3 : System.out.println("Orang Tua");
                break;
            }
    
}}
