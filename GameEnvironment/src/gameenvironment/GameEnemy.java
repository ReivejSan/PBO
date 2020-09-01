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
public class GameEnemy {
    public double width;
    public double height;
    public int positionX;
    public int positionY;
    
    public GameEnemy() {
        
    }
    
    public GameEnemy(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public GameEnemy(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public int getX() {
        return positionX;
    }
    
    public int getY() {
        return positionY;
    }
    
    public void Run() {
        System.out.println("Fans is running...");
    }
}
