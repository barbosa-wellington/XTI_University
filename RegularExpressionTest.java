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
    
    
    
    /* Quantifications
    X{n}    X, exacly n times
    X{n,}   X, at the least n once
    X{n, m} X, at the least n but not more than m times
    X?      X, 0 or 1 times
    X*      X, 0 or + times
    X+      X, 1 or + times
    
    */
    
    b = "21".matches("\\d{2}");
    
    // looking for more than 2 occurence of a digit
    b = "123".matches("\\d{2,}");
    
    //Here it is check the occurence of a value whicn can start as 2 occurence or
    // five. Any thing less than 2 or more than 5 will return false.
    b = "123456".matches("\\d{2,5}");
    
    
    b = "".matches(".?");
    
    b = "ab".matches(".*");
    
    // find one or more time the occurance
    b= "123".matches(".+");
    
    
    // Create a post of validation
    //String post = "\\d\\d\\d\\d\\d-\\d\\d\\d";
    b = "74534-049".matches("\\d{5}-\\d{3}");
    
    
    // Creating a date validation
    b = "10/05/1994".matches("\\d{2}.\\d{2}.\\d{4}");
    
    System.out.println(b);
    
    }
    
}
