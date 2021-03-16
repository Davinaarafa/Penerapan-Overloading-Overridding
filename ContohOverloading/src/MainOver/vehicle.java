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
public class vehicle {
       
    private String name;
    private int speed;
    
    public vehicle (String name, int speed) {
        super ();
        this.name=name;
        this.speed=speed;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName ( String name) {
        this.name = name;
    }
    
      public int getSpeed () {
        return speed;
    }
      
        public void setSpeed ( int speed) {
              this.speed = speed;
        }
      
                                                                                                                      // O V E R L O A D I N G //
      
        public void countDistance () {
            System.out.println(" name "+ name+ " distance"+ (speed*5) );
        }
        
         public void countDistance (int hour) {
 System.out.println(" name =  "+ name+ " distance = "+ (speed*5*hour) );
        }
        
        
        
        
        
        
}
