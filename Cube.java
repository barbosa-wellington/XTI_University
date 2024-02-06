/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class Cube implements CalculateVolume, CalculatedArea {
    
    double side;
    
    public Cube(double side){
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return 6 * side * side;
    }

    @Override
    public double calculateArea() {
        return side * side * side;
    }
    
}
