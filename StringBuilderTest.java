/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

/**
 *
 * @author wellington
 */
public class StringBuilderTest {
    
    public static void main (String []args){
    
    
        String str = "Java";
        StringBuilder str1 = new StringBuilder("Java");
        
        System.out.println(str1);
        
        str1.append(" Tutorial");
        
        System.out.println(str1);
        
        str1.reverse();
        System.out.println(str1);
        
        str1.reverse();
        System.out.println(str1);
        
        str1.delete(0, 4);
        
        System.out.println(str1);
        
        str1.insert(0, "I love study ");
        System.out.println(str1);
    }
    
}
