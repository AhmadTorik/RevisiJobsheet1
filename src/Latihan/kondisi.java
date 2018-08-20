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
public class kondisi {
    public static void main(String[]Torik){
        Scanner masukan = new Scanner (System.in);
        int nilai;
        System.out.println("Masukkan Nilai Akhit PBO :");
        nilai = masukan.nextInt();
        if (nilai<70)
            System.out.println("Siswa tidak lulus");
        if (nilai > 70)
            System.out.println("Siswa lulus");
    }
}
