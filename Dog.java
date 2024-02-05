/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class Dog extends Animal {
    
    // the reserved word super refere to the super class or Class Animal
        // The constructor above is a calling from the constructor from the Animal class.
        // this constructor is already initialize with two parameters
    public Dog(){
        super(30, "Meat");
    }
    
    void makeNoise(){
        System.out.println("barkign barking! ");
    
    }

    @Override
    void nothing() {
        System.out.println("This method is a abstraction of doing nothing");
    }
    
    
    
}
