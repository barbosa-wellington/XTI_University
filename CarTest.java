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
    
    Engine v12 = new Engine();
    
    v12.typeEngine = "V12";
    v12.power = 660;
    
    //This line will add the engine to ferrari
    Ferrari.engine = v12; 
    
    
    /**
     Utilizing a constructor that receive parameters to
     * initiate the object.     
     */
    Car Lamborgini = new Car("Lamborgini", 429, 1.9);
    
    Engine v8 = new Engine("V8", 1018);
    Lamborgini.engine = v8;
    
    
    //System.out.println(Lamborgini.model);
    
        System.out.println("This is an engine of Lamborgini " + Lamborgini.engine.power);
        
        
    Car bugatti = new Car("Cheron", 415, 2.2, new Engine("W16", 1200));
        System.out.println("The Bugatti engine type: " +bugatti.engine.typeEngine);
        System.out.println("The Bugatti power horse: " +bugatti.engine.power);

    
        
    }
    
}
