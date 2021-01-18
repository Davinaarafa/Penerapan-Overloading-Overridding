/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

import java.io.PrintStream;

/**
 *
 * @author MOKLET-02
 */
public class Segitigaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<<< Menghitung Luas Segitiga >>>");
        
        Segitiga tiga  = new Segitiga();
        tiga.input ();
        tiga.hitung();
        
        System.out.println(tiga.hasil());
    }
    
}
