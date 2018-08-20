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
public class Encapkelas {
    private String nama;
    private String alamat;
    private int absen;
    
    public int getAbsen()
    {
        return absen;
    }
    public String getNama()
    {
        return nama;
    }
     public String getAlamat()
    {
        return alamat;
    }
     public void setAge( int newAbsen){
         absen = newAbsen;
     }
      public void setNama( String newNama){
         nama = newNama;
     }
       public void setAlamat( String newAlamat){
         alamat = newAlamat;
     }
       public static void main(String[]torik){
           Encapkelas siswa = new Encapkelas();
           siswa.setNama("Torik");
           siswa.setAge(23);
           siswa.setAlamat("malang");
           
           System.out.println("Name : " + siswa.getNama());
           System.out.println("Absen : " + siswa.getAbsen());
           System.out.println("Alamat : " + siswa.getAlamat());
       }
}


