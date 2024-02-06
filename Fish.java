/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class Fish implements Predator, Prey{

    @Override
    public void hunt() {
        System.out.println("This fish is hunting...");
    }

    @Override
    public void flee() {
        System.out.println("This fish is fleeing...");
    }
    
    
    
}
