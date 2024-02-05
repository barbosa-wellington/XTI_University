/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wellington
 */
public class OperationTest {
    
    
    // This is an example of a method that extends the method from other classes.
    public static void calculate(OperationMath o, double x, double y){
            System.out.println(o.calculate(x, y));

}
    
    public static void calculateNotPolimorfism(String o, double x, double y){
        if(o.equals("Addition")){
            System.out.println(x + y);
        } else  if(o.equals("Multiplication")){
            System.out.println(x * y);
        }
        
    }
    public static void main(String [] args){
    
        
        // Utilizing the method created early and calling the existent method 
        // Addtion and Multiplication.
        calculate(new Addition(), 5, 5);
        calculate(new Multiplication(), 5, 5);
    
    }
    
}
