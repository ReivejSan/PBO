/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class TestTV {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        tv1.channelDown();
        tv1.volumeUp();
        tv1.volumeUp();
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeUp();
        tv2.volumeUp();
        tv2.volumeDown();
        
        System.out.println("TV1 channel is " +tv1.channel + "and volume level is " +tv1.volumeLevel);
        System.out.println("TV2 channel is " +tv2.channel + "and volume level is " +tv2.volumeLevel);
    
        Manusia man1 = new Manusia("Erik");
        System.out.println("Nama : ");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        System.out.println("Apakah dia Beli TV ? : ");
        man1.beliTV(tvku);
        System.out.println(man1.punyaTV);    
        man1.jualSemuaTV();
        System.out.println("Apakah sekarang dia punya TV ? :  ");
        System.out.println(man1.punyaTV);
    }    
}

class TV {
    int channel = 0;
    int volumeLevel = 10;
    
    public TV() {
        
    }
    
    public void turnOn() {
        
    }
    
    public void turnOff() {
        
    }
    
    public void setChannel(int newChannel) {
        channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel) {
        volumeLevel = newVolumeLevel;
    }
    
    public void channelUp() {
        channel++;
    }
    
    public void channelDown() {
        channel--;
    }
    
    public void volumeUp() {
        volumeLevel++;
    }
    
    public void volumeDown() {
        volumeLevel--;
    }
}

class Manusia {
    String nama;
    boolean punyaTV;
    
    public Manusia() {
        
    }
    
    public Manusia(String nama) {
        this.nama = nama;
    }
    
    public String namaSaya() {
        return nama;
    }
    
    public void beliTV(TV tvku) {
        punyaTV = true;
        System.out.println("Manusia Membeli TV");
    }
    
    public void jualSemuaTV() {
        punyaTV = false;
        System.out.println("Semua TV Dijual");
    }
    
    boolean punyaTV() {
        return punyaTV;
    }
    
}