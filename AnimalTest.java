/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class AnimalTest {
    
    
    public static void main(String [] args){
    
    Dog bilu = new Dog();
    
    bilu.food = "beef";
    bilu.sleep();
    
    Dog hanna = new Dog();
    
    Chicken carijo = new Chicken();
    carijo.sleep();
    
    // The instanceof method allows users to identify if the object is in a specific class
    // and it will return a boolean true or false
        System.out.println(bilu instanceof Dog);
        System.out.println(bilu instanceof Animal);
        System.out.println(bilu );
        
        
        boolean ttt = bilu.equals(carijo);
        System.out.println(ttt);
    
        boolean t2 = hanna.equals(bilu);
        System.out.println("Hanna " + ttt + " dog");
        
        // The method getClass will show the type of the class of the object
        bilu.getClass();
        System.out.println(bilu.getClass());
        
        // overrive the variable food which was firstly asigned with value "meat"
        // that the variable has a new value which is "bone"
        bilu.food = "bone";
        
        System.out.println(bilu.food);
        System.out.println(carijo.food);
        
    }
    
}
