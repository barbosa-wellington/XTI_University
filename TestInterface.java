/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class TestInterface {
    
    
    public static void main(String [] args){
    
    Buffalo buffalo = new Buffalo();
    
    buffalo.flee();
    
    Lion lion = new Lion();
    
    System.out.println("The buffalo is fleeing because of the...." + lion.getClass());
        
    lion.hunt();
        
    Fish salmon = new Fish();
    
    salmon.flee();
    
    }
    
}
