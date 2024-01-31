/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author wellington
 */
public class CarTest {
    
    public static void main(String [] args){
    
    Car Ferrari = new Car();
    Ferrari.model = "Enzo";
    Ferrari.MaxSpeed = 349;
    Ferrari.torchinSecond = 3.2;
    
    /**
     Utilizing a constructor that receive parameters to
     * initiate the object.     
     */
    Car Lamborgini = new Car("Lamborgini", 429, 1.9);
    
        System.out.println(Lamborgini.model);
    }
    
}
