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
public class Lingkaran {
    
     double r, phi, luas;
     void hitunglingkaran (){          
     Scanner Input = new Scanner(System.in);
     System.out.println(" -  Silahkan Masukan Jari jari lingkaran  - ");
     System.out.print(" Jari jari lingkaran = "); 
     r = Input.nextDouble();
     phi = 3.14;
     luas = phi*r*r*4; 
     System.out.println(" =========================== ");
     System.out.println(" Jari jari lingkaran = "+r);
     System.out.println(" Luas lingkaran = "+luas);   
    }
    
    
    

       }
    
   


     