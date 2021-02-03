/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class Kendaraan {
    
    static void Datamobil() {
        
       Scanner namon = new Scanner  (System.in);
       System.out.println("                     BUKTI PEMILIK KENDARAAN BERMOTOR                                                ");
       System.out.println("         ");
       System.out.println("                          IDENTITAS KENDARAAN       ");
       System.out.println("                   ================================       ");

       String nama, pekerjaan, alamat,  merek, type, jenis, model, nomormesin, warna, bahanbakar, nomorrangka;
       int nomorplat, tahun, silinder, roda;
       
       System.out.print(" Nama Pemilik   = ");
       nama = namon.next();
       System.out.print(" Pekerjaan   = ");
       pekerjaan = namon.next();
       System.out.print(" Alamat  = ");
       alamat = namon.next();     
       System.out.print(" Nomor Plat  = ");
       nomorplat = namon.nextInt();
       System.out.print(" Merek   = ");
       merek = namon.next();
       System.out.print(" Type  = "); 
       type = namon.next();
       System.out.print(" Jenis  = ");
       jenis = namon.next();
       System.out.print(" Model  = ");
       model = namon.next();
       System.out.print(" Tahun Pembuatan = ");
       tahun = namon.nextInt();
       System.out.print(" Isi Silinder  = ");
       silinder = namon.nextInt();
       System.out.print(" Nomer Mesin  = ");
       nomormesin = namon.next();
       System.out.print(" Warna Mobil  = ");
       warna = namon.next();
       System.out.print(" Bahan Bakar  = ");
       bahanbakar = namon.next();
       System.out.print(" Nomer Rangka  = ");
       nomorrangka = namon.next();
       System.out.print(" Jumlah Roda = ");
       roda = namon.nextInt();
    }
}
