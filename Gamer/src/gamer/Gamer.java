/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamer;

import java.util.ArrayList;

/**
 *
 * @author Jevier's FX504GD
 */
public class Gamer {

    /**
     * @param args the command line arguments
     */
    public String Nama;
    public int Umur;
    ArrayList<String> listGame;
    
    Gamer() {
        ArrayList<String> listGame = new ArrayList<String>();
        listGame.add("GTA V");
        listGame.add("ETS 2");
        listGame.add("Minecraft");
        listGame.add("Amnesia: Dark Descent");
        listGame.add("PUBG");
        listGame.add("CSGO");
    }
    
    void namaGamer(String Nama) {
        this.Nama = Nama;
    }
    
    void umurGamer(int Umur) {
        this.Umur = Umur;
    }
    
    String getGamer() {
        return Nama;
    }
    
    int getUmur() {
        return Umur;
    }
    
    void showGames() {
       getGamer();
       System.out.println("is playing");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Gamer gemer = new Gamer();
        gemer.Nama = "Yousoroo";
        gemer.Umur = 18;
        gemer.showGames();
    }
    
}

class YouTuber extends Gamer {
    int Subscriber = 185;
    int Viewer = 5320;
    
    YouTuber() {
        
    }
    
    void Viewer(int Viewer) {
        this.Viewer = Viewer;
    }
    
    void Subscriber(int Subscriber) {
        this.Subscriber = Subscriber;
    }
    
    int getViewer() {
        return Viewer;
    }
    
    int getSubscriber() {
        return Subscriber;
    }  
}

class ProGamer extends Gamer {
    ProGamer() {
        
    }
    
    void Play() {
        System.out.println(+Nama."is winning on"+listGame);
    }
    
}