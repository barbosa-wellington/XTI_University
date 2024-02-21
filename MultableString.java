/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

/**
 *
 * @author wellington
 */
public class MultableString {
    
    public static void main(String [] args){
    
    
        /*
         * The classes StringBuilder and StringBuffer are classes that are using 
         * for text's modification. For instance, strings are immutable, so an
         * appropriate class must be use, so that the text can be modify.
         */
        
        // Offer synchronized methods
        StringBuffer s0 = new StringBuffer();
        
        // Does not offer synchronized methods
        StringBuilder s1 = new StringBuilder("Java");
        
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        // the capacity of a string will increase gradually
        
        
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        
        
        s1.append(" Trabalhando ");
        char[] c= {'c','o','m'};
        s1.append(c).append(" Texts.");
        
        System.out.println(s1);
        
        // The code above could also be achieve by applying the following structure.
        String s = "Hello" +" How are"+" you";
        // The Virtual Machine will do the following
        String sb = new StringBuilder("Hello").append(" how ").append(" are you").toString();
        
        
        // The following method can delete an specific part of a string
        String url = new StringBuilder("www.google.com").delete(0, 4).toString();
        System.out.println(url);
    }
    
}
