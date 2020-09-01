/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Jevier's FX504GD
 */
public class Vehicle {

    /**
     * @param args the command line arguments
     */
    public double speed = 0;
    public String color = "orange";
    
    public Vehicle() {
        
    }
    
    public void goStraight() {
        System.out.println("Maju...");
    }
    
    public void turnLeft() {
        System.out.println("Belok Kiri...");
    }
    
    public void turnRight() {
        System.out.println("Belok Kanan...");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
