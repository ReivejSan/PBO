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
public class MotorVehicle extends Vehicle {
    private int sizeofEngine = 1;
    private String licensePlate = "H 1 DN";
    
    public MotorVehicle() {
        
    }
    
    public MotorVehicle(int sizeofEngine, String licensePlate) {
        
        this.sizeofEngine = sizeofEngine;
        this.licensePlate = licensePlate;
    }
    
    public int getSizeofEngine() {
        return sizeofEngine;
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
}
