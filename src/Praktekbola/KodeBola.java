/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktekbola;

import Bab2Enkakulapsi.Praktik;

/**
 *
 * @author ASUS
 */
public class KodeBola {
     
        public int jarijari;
        public double phi=3.14;
        
        public int getjarijari()
                {
                    return jarijari;
                }
        public double getphi()
        {
            return phi;
        }
        public void setjarijari(int newjarijari)
        {
          jarijari = newjarijari;  
        }
        public void setphi(double newphi)
        {
            phi=newphi;
        }
        public void setShowDiameter()
        {
            int diameter;
            diameter = 2*jarijari;
        }
        public void setShowLuasPermukaan()
        {
            double luas;
            luas = 4*Math.PI*jarijari;
            System.out.println("Luas Permukaan = "+luas+"cm");
        }
         public void setShowVolume()
        {
            double volume;
            volume = (4*Math.PI*jarijari*jarijari);
            System.out.println("Luas Permukaan = "+volume+"cm");
        }
    
      public static void main(String[]args)
    {
        KodeBola jumlah = new KodeBola ();
        jumlah.setjarijari(7);
        jumlah.setShowDiameter();
        jumlah.setShowLuasPermukaan();
        jumlah.setShowVolume();
        
    }
}
