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
public class TestAgeException {
    
    
    static void CheckAge(int age) throws AgeException{
        
        if(age < 18){
            throw new AgeException("\n" + "You must be 18+ to sign up");
        } else
        {
            System.out.println("You are now signed up!");  
        }
        }
    
    public static void main(String[] args){
    
        
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        try{
            
            CheckAge(age);
        }
        catch(Exception e){
            System.err.println("A problem pccired: " + e);
        }
        
        
    }
    
    
    
}
