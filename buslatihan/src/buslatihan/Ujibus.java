/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buslatihan;

/**
 *
 * @author MOKLET-02
 */
public class Ujibus {
    public static void main(String[] args) {
    //membuat objek busBesar dari class Bus
Bus2 busBesar = new Bus2(40);
busBesar.cetak();

//penambahan penumpang
busBesar.addPenumpang(5) ;//menambahkan 15 penumpang
busBesar.cetak();

//penambahan penumpang
busBesar.addPenumpang (5) ;//menambahkan 5 penumpang
busBesar.cetak();

//penambahan penumpang
busBesar.addPenumpang (26) ;//menambahkan 2d penumpang
busBesar.cetak();

    }
    
}
