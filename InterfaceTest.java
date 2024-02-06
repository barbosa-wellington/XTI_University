/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class InterfaceTest {
    
    public static void area(CalculatedArea o){
        System.out.println(o.calculateArea());
    }
    
    public static void volume(CalculateVolume o){
        System.out.println(o.calculateVolume());
    }
    
    public static void main(String[] args){
    
        area(new FigureSquare(2));
        volume(new Cube(2));
    
    
    }
    
}
