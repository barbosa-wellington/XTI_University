/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

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
    
}
