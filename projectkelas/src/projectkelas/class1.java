/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkelas;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class class1 {
    
    static void midyear (){
     
        int hargabarang;
        int jumlahbarang;
        int totalharga;
        int totalpembayaran;
        int kembalian;
        String namabarang ;
    
      Scanner Input = new Scanner(System.in);
 
      
      System.out.println("                                                                 ");
      System.out.print(" Nama Barang = ");
      namabarang = Input.next();
      System.out.print(" Harga Barang = ");
      hargabarang = Input.nextInt();
      System.out.print(" Jumlah Barang = ");
      jumlahbarang = Input.nextInt();
      System.out.println(" Total Harga = "+(hargabarang*jumlahbarang));
      totalharga = (hargabarang*jumlahbarang);
      System.out.print(" Total Pembayaran =  ");
      totalpembayaran = Input.nextInt();
      System.out.println(" Kembalian  = "+(totalpembayaran-totalharga));
      System.out.println("      ");

        System.out.println("<<< Total Pembayaran Belanja  >>>");
        System.out.println("      ");
        System.out.println("Nama Barang = "+namabarang);
        System.out.println("Harga Barang = "+hargabarang);
        System.out.println("Jumlah Barang = "+jumlahbarang);
        System.out.println("Total Harga = "+(hargabarang*jumlahbarang)+" Rupiah");
        System.out.println("Total pembayaran = "+totalpembayaran+" Rupiah");
        System.out.println("Kembalian = "+(totalpembayaran-totalharga)+" Rupiah");
         System.out.println("      ");

        
    }
}
