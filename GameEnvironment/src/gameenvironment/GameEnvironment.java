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
import java.util.ArrayList;


public class GameEnvironment {

    /**
     * @param args the command line arguments
     */
    public double width;
    public double height;
    public ArrayList<GamePlayer> arrPlayer;
    public ArrayList<GameEnemy> arrEnemy;
    
    GameEnvironment() {
        arrPlayer = new ArrayList<GamePlayer>();
        arrEnemy = new ArrayList<GameEnemy>();
    }
    
    GameEnvironment(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public void addPlayer(GamePlayer Player) {
        arrPlayer.add(Player);
    }
    
    public void removePlayer(GamePlayer Player) {
        arrPlayer.remove(Player);
    }
    
    public void getAllPlayer() {
        System.out.println("All Player : "+arrPlayer);
    }
    
    public void addEnemy(GameEnemy Enemy) {
        arrEnemy.add(Enemy);
    }
    
    public void removeEnemy(GameEnemy Enemy) {
        arrEnemy.remove(Enemy);
    }
    
    public void getAllEnemies() {
        System.out.println("All Enemy: "+arrEnemy);
    }
    
    public static int EuclideanDistance(int X1, int Y1, int X2, int Y2) {
        return (int)Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)));
    }
    
    public void Interaction() {
        if (arrPlayer == null || arrEnemy == null) {
            System.out.println("Player or Enemy hasn't been sets, please set it first ");
        }
        for(int i = 0; i<arrPlayer.size(); i++) {
            for(int j = 0; j<arrEnemy.size(); j++) {
                if(arrPlayer.get(i).getY() != arrEnemy.get(j).getY()) {
                    System.out.println("Player : "+arrPlayer.get(i)+" and Enemy : " +arrEnemy.get(j)+" not in the same Y position");
                }
                if(EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(j).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY())<2) {
                    System.out.println("Player : "+arrPlayer.get(i)+" Attacked");
                    System.out.println("Enemy : "+arrEnemy.get(j)+" Lose");
                    removeEnemy(arrEnemy.get(j));
                }
                else {
                    System.out.println("--> Player "+arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("Current X position = "+arrPlayer.get(i).getX()+" <--");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}

