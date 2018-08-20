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
public class ujibus {
    private int penumpang;
    private int maxpenumpang;
    
    //konstruktor kelas bus
    public ujibus(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator untuk menambahkan penumpang
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxpenumpang){
            System.out.println("penumpang melebihi kouta");
        } else {
            this.penumpang = temp;
        }
    }
     public void cetak(){
      System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
      System.out.println("Penumpang maksimum seharusnya adalah "+ maxpenumpang);
      
  }
    public static void main(String[] args){
        //membuat objek besar dari class bus
        ujibus busbesar = new ujibus(40);
        busbesar.cetak();
        
        //penambahan penumpang
        busbesar.addpenumpang(15);
        busbesar.cetak();
        
         //penambahan penumpang
        busbesar.addpenumpang(5);
        busbesar.cetak();
        
        //penambahan penumpang
        busbesar.addpenumpang(26);
        busbesar.cetak();
    }
}
