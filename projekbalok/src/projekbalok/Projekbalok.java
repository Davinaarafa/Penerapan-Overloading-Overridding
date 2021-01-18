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
public class Projekbalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     baloknya balok = new baloknya();
     
     balok.panjang= 15;
     balok.lebar=10;
     balok.tinggi=5;
     
     balok.tampilData();
     balok.luasBalok(15, 10, 5);
     balok.getHasil();
    }
    
}
