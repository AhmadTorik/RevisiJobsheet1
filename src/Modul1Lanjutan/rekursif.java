/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1Lanjutan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class rekursif {
    
        public static void main (String[]args)
        {
            Scanner masukan = new Scanner(System.in);
            int bil,hasil;
            System.out.println("Masukkan suatu bilangan : ");
            bil = masukan.nextInt();
            hasil = faktorial(bil);
            System.out.println("Nilai faktorial " + bil +"adalah" + hasil);
        }
        
        private static int faktorial (int bil)
        {
            if (bil==1)
            return 1;
            else 
               return (bil*faktorial(bil-1));

                    
        
    
        }
}           
