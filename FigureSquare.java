/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class FigureSquare implements CalculatedArea {

    double side;
    public FigureSquare(double side){
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
    
}
