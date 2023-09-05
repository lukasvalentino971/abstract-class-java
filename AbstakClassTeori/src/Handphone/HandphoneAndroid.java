/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handphone;

/**
 *
 * @author ACER
 */
public abstract class HandphoneAndroid {
    public int min_volume, max_volume;
    public boolean power;
    
    public abstract void powerOn();
    
    public abstract void powerOff();
    
    public abstract void volumeUp();
    
    public abstract void volumeDown();
}
