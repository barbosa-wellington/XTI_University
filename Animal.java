/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class Animal {
    
    protected int serial;
    double weigth;
    String food;
    
       
    public Animal(double weigth, String food){
        this.weigth = weigth;
        this.food = food;
    }
    
    
    void sleep(){
        System.out.println(" its sleeping.");
    }
    
    void makeNoise(){System.out.println("its making noise.");}
}
