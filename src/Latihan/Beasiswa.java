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
public class Beasiswa {
    public static void main (String[]Torik){
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukkan Nilai TPA :");
        int TPA = masukan.nextInt();
        System.out.println("Masukkan nilai Bahasa Inggris :");
        int bahasainggris = masukan.nextInt();
        if ((TPA > 95) && (bahasainggris > 90))
        System.out.println("Siswa dapat beasiswa");
        else if ((TPA >= 80) && (bahasainggris >= 75))
        System.out.println("Siswa dapat Mengikuti Tes Tambahan");
        
        else
        System.out.println("siswa tidak dapat beasiswa");
    }
}
