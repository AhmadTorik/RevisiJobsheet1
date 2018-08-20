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
public class Bus3 {
    public int penumpang;
    public int maxpenumpang;
    
    
    
    public Bus3(int maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addpenumpang(int penumpang)
    {
        int temp;
        temp = this.penumpang+penumpang;
        if (temp > maxpenumpang)
        {
            System.out.println("penumpang melebihi kouta");
            
        }
        else 
        {
            this.penumpang=temp;
        }
    }
    public void getpenumpang(int password)
    {
        if (password==24)
        {
            System.out.println("Password Benar");
        }
        else
        {
            System.out.println("password salah");
        }
    }
    
    public void cetakpenumpang()
    {
     System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
      System.out.println("Penumpang maksimum seharusnya adalah "+ maxpenumpang);
    }

public static void main(String[]abc)
{
    Bus3 bus = new Bus3(5);
    bus.getpenumpang(17);
    bus.getpenumpang(24);
    
    bus.cetakpenumpang();
    
    //penambahan penumpang
    bus.addpenumpang(2);
    bus.cetakpenumpang();
    
     //penambahan penumpang
    bus.addpenumpang(1);
    bus.cetakpenumpang();
    
     //penambahan penumpang
    bus.addpenumpang(2);
    bus.cetakpenumpang();
    
     //penambahan penumpang
    bus.addpenumpang(2);
    bus.cetakpenumpang();
    
    
}
}