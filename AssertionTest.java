/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mistakes;

import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class AssertionTest {
    
    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number; ");
    int num = sc.nextInt();
        
    assert (num >= && num <= 10) : "Number incorrect" + num;
        
    System.out.println("You are in " + num);
    }
}
