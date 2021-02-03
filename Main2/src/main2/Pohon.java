/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class Pohon {
     
    String nama;
    int tinggi;
    
    void setNama() {
        Scanner dav = new Scanner (System.in);
        System.out.print( " Nama Pohon = ");
        nama = dav.next();
    }
    
    void setTinggi() {
        Scanner dav = new Scanner (System.in);
        System.out.print( " Tinggi Pohon = ");
        tinggi= dav.nextInt();       
    }
   
    void getNama () {
        System.out.print(" Nama Pohon  =  "+nama);
    }
    
    void getTinggi () {
       System.out.println(" Tinggi Pohon  =  "+tinggi);

    }
}
