/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mistakes;

import inheritance.Animal;
import inheritance.Chicken;
/**
 *
 * @author wellington
 */
public class CommonExceptions {
    
    
    static int[] arrayNull = new int[0];
    
    public static void main(String [] args){
    
        /**
         * 
         *This class was designed to examplify the understanding of common exception.
         * 
         * We have already seem how exception works and how to deal with it.
         * However, a more deep knowledge of exception can help professional 
         * developer to go into solve a more challenging problem that programming
         * computer faces.
         * 
         * 
         * 
         * 
         */
        
        
        //NullPointerEception
        //System.out.println(arrayNull.length);
        
        //ArithmeticException
        //int x = 5 /0;
        
        //java.lang.ArrayIndexOutOfBoundsException
        System.out.println(arrayNull[1]);
        
        //ClassCastException
        //Animal a = new Chicken();
        //Dog g = (Dog) a;
        
        
        //NumberFormatException
        int raw = Integer.parseInt("X");
    }
    
}
