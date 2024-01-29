/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author wellington
 */
public class chicken {
    
    // the modifier static turn the variable into global
    // which can be only created once.
    public static int eggsFarm;
    
    // this variable will be create each time that an object 
    // chicken is created.
    public int eggs;
    
    // This method allow the count static incrementation 
    
    public chicken egging(){
        this.eggs++;
        chicken.eggsFarm++;
        return this;
    }
    
    public static double averageFarm(int chicken){
        return eggsFarm/ chicken;
    }
}
