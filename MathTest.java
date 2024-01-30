/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class MathTest {
    
    public static void main (String [] args){
    
    Math cal = new Math();
    
        System.out.println(args.toString());
    
    System.out.println("\n");
      
    int element = cal.graterThan(10, 20);
    
    System.out.println("the element is " + element);
    
    double total = cal.sumupNumber(27, 10);
    
    System.out.println("the total is " + total);
    
    int pair = cal.graterThan(2, 4);
    int even = cal.graterThan(3, 5);
    double totalCross = cal.sumupNumber(pair, even);
    
    System.out.println("The totalCross of pairs and even are: " + totalCross);
    
    System.out.println("\n");
        
    //double npow = cal.powNumber(4);
    
    //System.out.println(npow);
    
    
    double[] nu = {2,4,6,8,10};
    
    // Testing a method with multiple arguments.
    double t = cal.sumNum(" Numbers",2,4,6,8,10);
    
        System.out.println("this is a method that return the sum of many numbers " +t);
    double nnnnn = cal.routeNumber(17);
    
        System.out.println("the squareroot is: " + nnnnn);
    }
    
    
    
}
