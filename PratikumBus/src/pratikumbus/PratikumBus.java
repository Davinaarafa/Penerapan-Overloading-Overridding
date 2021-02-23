/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikumbus;

/**
 *
 * @author MOKLET-02
 */
public class PratikumBus {
    public static void main(String[] args) {
         int password;
        
        //Membuat objek busBesar dari class bus
         Pbus busku = new Pbus (40);
         busku.cetak ();
         
         // penambahan penumpang
        busku.addpenumpang (2); 
        busku.cetak () ;
       
         // penambahan penumpang
        busku.addpenumpang (1); 
        busku.cetak ();
        
         // penambahan penumpang
        busku.addpenumpang (2); 
        busku.cetak ();
        
         // penambahan penumpang
        busku.addpenumpang (2); 
        busku.cetak ();
         
        System.out.println( "Rata-rata Penumpang : "+busku.getAverage());
           
       

    }
    
}
