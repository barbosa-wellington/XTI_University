/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

/**
 *
 * @author wellington
 */
public class RegularExpressionTest {
    
    public static void main(String[] args){
    
    
    
    
    /**
     * Modificators
     * 
     * (?i), ignore upper and lower case
     * (?x), Comments
     * (?m), multlines
     * (?s), Dottal
     * */
    
    //This line of code will ignore the lower and upper case and ti will validate as positive.
    boolean b = "Java".matches("(?i)java");
    
    /**
     * Modificators
     * 
     * (.), any character
     * (\d), digits             [0-9]
     * (\D), no is digit        [09]
     * (\s), space              [ \t\n\x0b\f\r]
     * (\S), no space           [\s]
     * (\w), letters            [a-zA-Z_0-9]
     * (\W), not letters
     * */
    
    // any symbol
    b = "@".matches(".");
    
    // digit occurance
    b = "2".matches("\\d");
    
    // Find the occurance of letter and numbers
    b = "a".matches("\\w");
    
    // Identify space on the string
    b = " ".matches("\\s");
    
    // To identify more than one single digit or character
    b = "21".matches("\\d\\d");
    
    
    // Create a post of validation
    String post = "\\d\\d\\d\\d\\d-\\d\\d\\d";
    b = "74534-049".matches(post);
    
    System.out.println(b);
    
    }
    
}
