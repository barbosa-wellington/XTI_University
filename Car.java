/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author wellington
 */
public class Car {
    
    String model;
    int MaxSpeed;
    double torchinSecond;
    Engine engine;
    
    // A constructor assist in the initialization of a class
    // Once a empty constructor is created
    // a class can be receive an object. However.
    // it if no longer exist, so the main class will
    // generate a error pointing to the absence of a constructor method.
    public Car(){
    
    
    }
    
    public Car(String model, int MaxSpeed, double torchinSecond){
        //this.model = model;
        //this.MaxSpeed = MaxSpeed;
        //this.torchinSecond = torchinSecond;
        
        // This command will call the more completed constructor method to initialize this method.
        this(model, MaxSpeed, torchinSecond, null);
    }
    
    public Car(String model, int MaxSpeed, double torchinecond, Engine engin){
        this.model = model;
        this.MaxSpeed = MaxSpeed;
        this.torchinSecond = torchinecond;
        this.engine = engin;

    }
    
}
