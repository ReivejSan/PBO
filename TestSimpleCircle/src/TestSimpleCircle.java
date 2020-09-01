/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCircle circle = new SimpleCircle();
        circle.jari = 10;
        System.out.println(circle.jari);
    }
    
}

class SimpleCircle {
    int jari;
}