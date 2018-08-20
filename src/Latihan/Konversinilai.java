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
public class Konversinilai {
    public static void main (String[]Torik)
    {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Nilai WEB :");
        int nilai= masukan.nextInt();
        if (nilai >= 90)
            System.out.println("Nilai A");
        else if (nilai >= 75)
            System.out.println("Nilai B");
         else if (nilai >= 50)
            System.out.println("Nilai C");
         else if (nilai >= 35)
            System.out.println("Nilai E");
    }
}
