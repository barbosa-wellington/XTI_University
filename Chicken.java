/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class Chicken extends Animal{
    
    // This is a constructor method for the Chiken class.
    public Chicken(){
    
        // the reserved word super refere to the super class or Class Animal
        // The constructor above is a calling from the constructor from the Animal class.
        // this constructor is already initialize with two parameters
        super(2, "Corn");
    }
    
    void makeNoise(){
        System.out.println("Co Co!");
            }

    
    // This method is an original implementation of a abstract methond from an Abstract class called Animal.
    // by abstracting, we are adding one more layer of security on our systems and class.
    // when an method is abstract by a super class, all extends class must implement the method by its best approaches.
    @Override
    void nothing() {
                System.out.println("This method is a abstraction of doing nothing");

    }
    
    
    
    
}
