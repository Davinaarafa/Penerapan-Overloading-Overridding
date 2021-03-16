/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainOver;

/**
 *
 * @author MOKLET-02
 */
public class MainOverr {
    
    public MainOverr () {
     
     motor d = new motor ("Beat, ", 90);
     car a = new car ( "Inova, ", 115, ", Sharp");
     System.out.println(a.getName()+ " " +a.getSpeed()+ " "+a.getACModel());
     System.out.println(d.getName()+ " " +d.getSpeed());    
    
     a.countDistance();
     a.countDistance(10);
    }
         
      public static void main(String[] args) {
          new MainOverr ();
      }
    
}

    
  
        
         
     

