/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author wellington
 */
public class MathTest {
    
    public static void main (String [] args){
    
    Math cal = new Math();
    
      
    int element = cal.graterThan(10, 20);
    
    System.err.println("the element is " + element);
    
    double total = cal.sumupNumber(27, 10);
    
    System.err.println("the total is " + total);
    
    int pair = cal.graterThan(2, 4);
    int even = cal.graterThan(3, 5);
    double totalCross = cal.sumupNumber(pair, even);
    
    System.out.println("The totalCross of pairs and even are: " + totalCross);
    
    }
    
     
}
