/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author wellington
 */
public class Math {
    
    
    /** 
     * @param one
     * @param two
     * @return the sum of both numbers 
     */
    int graterThan(int one, int two){
        
        
        if (one > two){
        return one;
        } else {
        return two;
        }
    }
    
    /** 
     * @param one
     * @param two
     * @return the sum of both numbers 
     */
    double sumupNumber(double one, double two){
        
        return one + two;
       
    }
    
    
    // This is a method that will receive many number.
    // The same can be done by adding an double[]
    // variable arguments
    // Adding more variable for a method, however
    // the java languange does not allows you to add
    // two variables.
    //String title
    double sumNum(double ...numbers){
        //System.out.println("The number are: ");
        double total = 0;
        for(double n : numbers){
            total += n;        
        }
        return total;
    }
    /** 
     * @param number
     * @param count - Variable that will count each time that an even number will be identified
     * @param powNum - Variable that will receive the sub of the given number minus the even number.
     * @return - this variable will return the count variable which determine the Squareroot of a given number.
     */
    double routeNumber(double number){
    
        int count = 1;
        double powNum = number;
        
        for(int i = 1; i < number; i++){
            
            if((i % 2) == 1){
                
                powNum -= i;
                count += 1;
                
                if(powNum < i){
                    break;
                    
                }           
            }
        }
      return count;
    }
    
    double average(int x){
        System.out.println("Math.average(x)");
        return x;
    }
    
    double average(int x, int j){
        System.out.print("average (x + y)/2 ");
        return (x + j) /2;
    
    }
    
       
    double average(double ...numbers){
        System.out.println("oop.Math.average([])");
        return this.sumNum(numbers) / numbers.length;
    }
    
    
    double average(String x, String y){
        System.out.print("average(String x, String y) ");
        int ix = Integer.parseInt(x);
        int iy = Integer.parseInt(y);
        return (ix + iy) /2;
    }
    
    
    
}
