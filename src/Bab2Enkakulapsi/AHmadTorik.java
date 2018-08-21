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
public class AHmadTorik {

    
    
        public String namaayah;
        public String namaibu;
        public String namasendiri;
        public String namasaudara;
        public String alamat;
        public String hobi;
        public String citacita;
        public int umur ;
        
        public void setNamaAyah(String newnamaayah)
        {
            namaayah = newnamaayah;
        }
        public String getnamaayah()
        {
          return namaayah;  
        }
        public void setNamaIbu(String newnamaibu)
        {
            namaibu = newnamaibu;
        }
        public String getnamaibu()
        {
          return namaibu;  
        }
        public void setNamaSendiri(String newnamasendiri)
        {
            namasendiri = newnamasendiri;
        }
        public String getnamasendiri()
        {
          return namasendiri;  
        }
        public void setNamaSaudara(String newnamasaudara)
        {
            namasaudara = newnamasaudara;
        }
        public String getnamasaudara()
        {
          return namasaudara;  
        }
        public void setAlamat(String newalamat)
        {
            alamat = newalamat;
        }
        public String getalamat()
        {
          return alamat;  
        }
        public void sethobi(String newhobi)
        {
            hobi = newhobi;
        }
        public String gethobi()
        {
          return hobi;  
        }
          public void setCitaCita(String newcitacita)
        {
            citacita = newcitacita;
        }
        public String getcitacita()
        {
          return citacita;  
        }
          public void setumur(int newumur)
        {
            umur = newumur;
        }
        public int getumur()
        {
          return umur;  
        }
       
          public static void main(String[]torik)
       {
           AHmadTorik data = new AHmadTorik();
           data.setNamaAyah("Danny");
           data.setNamaIbu("Sarkem");
           data.setNamaSendiri("Torik");
           data.setNamaSaudara("Dina");
           data.setAlamat("Jalan Danau Laut Tawar 2");
           data.sethobi("Memancing");
           data.setCitaCita("Enterpreneur");
           data.setumur(16);
                
            System.out.println("Nama Ayah : " + data.getnamaayah());
           System.out.println("Nama Ibu : " + data.getnamaibu());
           System.out.println("Nama Sendiri : " + data.getnamasendiri());
           System.out.println("Nama saudara : " +data.getnamasaudara());
           System.out.println("Alamat : " + data.getalamat());
           System.out.println("Hobi : " + data.gethobi());
           System.out.println("CitaCita : " + data.getcitacita());
           System.out.println("umur : " + data.getumur());
          
       }
    }
     


