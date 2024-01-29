/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author wellington
 */
public class chickenTest {
    
    public static void main(String [] args){
    
    chicken c1 = new chicken();
    
    
    c1.egging().egging().egging().egging();
    
    chicken c2 = new chicken();
    
    c2.egging().egging();
    
        System.out.println(c2.eggs);
    
        System.out.println(c1.eggs);
        // Accessing the object method eggFarming.
        // this is a method that belows to the class
        // and not to the object.
        System.out.println(chicken.eggsFarm);
    
        
        System.out.println(chicken.averageFarm(2));
    }
    
}
