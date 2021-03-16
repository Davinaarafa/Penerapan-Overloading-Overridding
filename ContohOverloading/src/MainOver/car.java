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
public class car extends vehicle {
    
    private String ACModel;
    
    public car (String name, int speed, String ACModel) {
        super (name, speed);
        this.ACModel = ACModel;
        
    }
    
    public String getACModel () {
        return ACModel;
    }
    
    public void setACModel () {
        ACModel = ACModel;
    }
    
        // O V E R R I D I N G  //
    
     public void countDistance () {
            System.out.println(" Car Name = "+ getName() + " Distance = "+ getSpeed()* 5 );
        }
}
