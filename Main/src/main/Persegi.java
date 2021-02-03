/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class Persegi{
     int sisi ;   
     float  luas;
     
    void hitungpersegi(){          
     Scanner Input = new Scanner(System.in);
     System.out.println(" -  Silahkan Masukan Salah satu sisi  - ");
     System.out.print(" Sisi = "); 
     sisi = Input.nextInt();
     luas = sisi*sisi; 
     
     System.out.println(" =========================== ");
     System.out.println(" Sisi : "+sisi);
     System.out.print(" Luas : "+(sisi*sisi));
     luas = (float) (sisi*sisi);   
    }
}

        
   
 

    
   
