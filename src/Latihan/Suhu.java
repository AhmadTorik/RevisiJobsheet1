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
public class Suhu {
    public static void main (String[]Torik){
        Scanner masukan = new Scanner(System.in);
        float cel = 78;
        
        System.out.println("Fahrenheit : "+(((9/5) * cel)+32));
        System.out.println("Reamur : "+ (cel * 4/5));
        System.out.println("Kelvin : "+(273+ cel));
    }
    
}
