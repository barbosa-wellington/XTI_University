package mistakes;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wellington
 */
public class DivideByZero {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    boolean going = true;
        
    
    do {
        
        
        try{
        
        System.out.println("First Number: ");
        int a = sc.nextInt();
        
        System.out.println("Second Number:");
        int b = sc.nextInt();
        
        
        //InputMismatchException
        // ArithmeticException
        
        System.out.println(a/b);
        
        
        // Creating a variable that will be looping while the user still
        // input a wrong data.
        going = false;
        
        
        // The catch command will treat the error according the developer wishes.
        // It will be execute according the exception arised.
        // for instance the following exception was cause because the user
        // tped an differetn type of date.
        } catch (InputMismatchException e){
            System.err.println("You need to type a int value not a String..");
            sc.nextLine();
            
            // The command above will print the stacktrace of the error generated by
            // the missinpput from the user.
            // The printStakeTrace help to show classes that may be affect by the error.
            //e.printStackTrace();
            
            
            // Additionally, the getMessage also provide the message error
            // in a string form.
            e.getMessage();
        }
        
        // Another exception that this code illustrate is the mathematical problem.
        // Number diveded by zero is not possible to be calculate. So, the 
        // following catch will treat this erro as informing the user
        // to tiping a valable number.
        
         catch (ArithmeticException e1){ 
             System.err.println("Division by 0 is not possible.");
             sc.nextLine();
             e1.printStackTrace();
        }
        
        
        // The finally command is a command that will be execute
        // no metter what would be the outcome of the class.
        finally {
            System.out.println("This class run perfect!");
        
        }
        
    } while (going);
        
    }
    
}
