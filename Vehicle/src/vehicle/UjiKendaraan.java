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
public class UjiKendaraan {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle wimcycle = new Bicycle();
        System.out.println("WimCycle adalah sepeda yang memiliki bel");
        System.out.println("Bel Sepeda Berbunyi");
        wimcycle.ringBell();
        System.out.println("Kemudian Sepeda begerak");
        wimcycle.goStraight();
        wimcycle.turnLeft();
        wimcycle.turnRight();
        
        MotorVehicle Alphard = new MotorVehicle();
        System.out.println("Pak Rektor punya mobil Alphard");
        System.out.println("Jumlah mesin Alphard = ");
        System.out.println(Alphard.getSizeofEngine());
        System.out.println("Plat nomer Alphard = ");
        System.out.println(Alphard.getLicensePlate());
        
        Car Vellfire = new Car();
        System.out.println("Sebelah Toyota Alphard ada Toyota Vellfire");
        System.out.println("Apakah penumpang Vellfire memasang seatbelt? : ");
        Vellfire.getSeatBelt();
    }
}