/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2Enkakulapsi;

/**
 *
 * @author ASUS
 */
public class Bus {
   
  public int penumpang;
  public int maxpenumpang;
  
  public void cetak(){
      System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
      System.out.println("Penumpang maksimum seharusnya adalah "+ maxpenumpang);
      
  }
  
    public static void main(String[]torik)
    {  
      //membuat objek busmini dari kelas bus
        Bus busmini = new Bus();
        //Memasukkan nilai jumlah penumpang dan penumpang maksimal
        //ke dalam objek bus mini
        busmini.penumpang = 5;
        busmini.maxpenumpang = 15 ;
        //memanggil method cetak pada kelas bus
        busmini.cetak();
        
        //menambahkan penumpang bus mini
        busmini.penumpang=busmini.penumpang + 5;
         //memanggil method cetak pada kelas bus
        busmini.cetak();
        
         //mengurangi jumlah penumpang bus mini
        busmini.penumpang=busmini.penumpang - 2;
         //memanggil method cetak pada kelas bus
        busmini.cetak();
        
         //menambahkan penumpang bus mini
        busmini.penumpang=busmini.penumpang + 8;
         //memanggil method cetak pada kelas bus
        busmini.cetak();
    }
    
}
