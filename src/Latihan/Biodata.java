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
public class Biodata {
    public static void main(String[]Torik)
    {
        
        Scanner masukan = new Scanner(System.in);
        String nama,nis,tempat,lahir,jenis,alamat,motto;
        System.out.println ("Masukkan Data Diri Anda");
        System.out.print ("Nama : ");
        nama= masukan.next();
         System.out.print ("NIS : ");
         nis = masukan.next();
        System.out.print ("Tempat lahir : ");
        tempat= masukan.next();
         System.out.print ("Tanggal Lahir : ");
         lahir = masukan.next();
         System.out.print ("Jenis Kelamin : ");
        jenis= masukan.next();
         System.out.print ("Alamat Di Malang : ");
         alamat = masukan.next();
          System.out.print ("Motto Hidup : ");
         motto = masukan.next();
         
         System.out.println();
       System.out.println ("Biodata : ");
        System.out.println ("Nama : "+nama);
      
         System.out.println ("NIS : "+nis);
     
        System.out.println ("Tempat lahir : "+tempat);
     
         System.out.println ("Tanggal Lahir : "+lahir);
     
         System.out.println ("Jenis Kelamin : "+jenis);
     
         System.out.println ("Alamat Di Malang : "+alamat);
        
          System.out.println ("Motto Hidup : "+motto);
      
    }
}
