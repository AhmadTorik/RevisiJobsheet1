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
public class Counter {
    public static void main(String[]Torik)
    {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukkan Batasa Bilangan :");
        int batas = masukan.nextInt();
        int hasil = 0;
        for(int i=1; i<=batas; i++)
            hasil += i;
        System.out.println("Total Jumlahnya Adalah :" +hasil);
    }
}
