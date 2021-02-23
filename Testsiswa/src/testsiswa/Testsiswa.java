/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsiswa;

/**
 *
 * @author MOKLET-02
 */
public class Testsiswa {

  public static void main(String[] args) {
      EncapSiswa siswa = new EncapSiswa ();
      siswa.setName (" Davina ");
      siswa.setAge (04);
      siswa. setAddress (" Malang ");
      
      System.out.println(" Name : " + siswa.getName()
              + " Absen : " +siswa.getAbsen() +
              " Address : " + siswa.getAddress() );
    }
    
}
