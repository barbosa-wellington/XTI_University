/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author wellington
 */
public class EnumTest {
    
    
    
    /*
    In java, to create variable that will be using as a constants the class ENUM must be utilized.
    ENUM is a class java that allows an variable to be global or constant. Constant is a 
    variable that it internal value will never change.
    
    to create an constant variable you must using the following parameters:
     Public static final.
    
    The same can be applicatable for methods.
    
    **/
    public static final double PI = 3.14;
    
    public static void walking(Measures average, int total){
        
        if(average == Measures.M){
            System.out.println(" You have just walked " + 100 );
        } else if (average == Measures.CM){
            System.out.println("You have just walked " + total);
        
        }
    
    
    }
    
    public static void main(String[] args){
    
    
        System.out.println(ChessPiecies.BISHOP);
        
        System.out.println(Measures.M.title);
        
        // This loop allows you to identify all items in a Enum list.
        for(Measures m : Measures.values()){
            System.out.println(m + " : " + m.title);
            
        }
        
        
        for(ChessPiecies c : ChessPiecies.values()){
            System.out.println(c + " : " + c.toString());
            
        }
        
        // This is an example of a constant method.
        walking(Measures.M, 100);
        
        
        
    }
}
