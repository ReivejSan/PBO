/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvironment;

/**
 *
 * @author Asus
 */
public class TestGame {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Game of The Lych King");
        System.out.println("~Escape From the Death~");
        System.out.println("-------------------------");
        System.out.println("Game Start");
        System.out.println("-------------------------");
        
        GamePlayer Eline = new GamePlayer();
        Eline.setDimension(15,40);
        Eline.setPosition(10, 220);
        System.out.println("Player position : "+Eline.getX()+", "+Eline.getY());
        Eline.Run(15);
        System.out.println("Curent player position : "+Eline.getX()+", "+Eline.getY());
        
        GamePlayer Rexxar = new GamePlayer();
        Rexxar.setDimension(22,65);
        Rexxar.setPosition(10, 10);
        
        GameEnemy Tchalla = new GameEnemy();
        Tchalla.setDimension(30,75);
        Tchalla.setPosition(10, 10);
        
        GameEnvironment Scene1 = new GameEnvironment();
        Scene1.addPlayer(Eline);
        Scene1.addPlayer(Rexxar);
        Scene1.getAllPlayer();
        Scene1.removePlayer(Eline);
        Scene1.getAllPlayer();
        Scene1.addEnemy(Tchalla);
        Scene1.Interaction();
        
        ///To Be Continued
    }   
}
