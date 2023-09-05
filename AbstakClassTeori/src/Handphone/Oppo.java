/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handphone;

/**
 *
 * @author ACER
 */
public class Oppo extends HandphoneAndroid{
    private int volume;
    private boolean isPowerOn;
    
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Loading...");
        System.out.println("OPPO");
    }
    
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Off...");
    }
    
    @Override
    public void volumeUp(){
        if(isPowerOn){
           if (this.volume == max_volume) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    
    @Override
    public void volumeDown(){
        if(isPowerOn){
            if (this.volume == min_volume) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
}
