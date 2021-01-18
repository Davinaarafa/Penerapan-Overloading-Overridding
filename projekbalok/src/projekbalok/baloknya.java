/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekbalok;

/**
 *
 * @author MOKLET-02
 */
public class baloknya {
    int hasil;
    int panjang;
    int tinggi;
    int lebar;
    
  void tampilData(){
      System.out.println(" Panjang Balok     :"+panjang+"cm");
      System.out.println(" Tinggi Balok      :"+tinggi+"cm");      
      System.out.println(" Lebar Balok       :"+lebar+"cm");
      System.out.println(" -----------------------------------------");
     
  }
  void luasBalok(int p, int t, int l){
      hasil = 2* (p*t+p*l+l*t);
      System.out.println(" Luas Balok         :2* ("+p+"*"+l+" + "+p+"*"+t+" + "+l+"*"+t+")    = "+ (hasil)+ "cm");
  }
  
  int getHasil(){;
    return hasil;
}
}