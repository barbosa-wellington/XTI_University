/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

/**
 *
 * @author wellington
 */
public class StringToken {
    
    public static void main(String[] args){
    
    
        String s = "XHTML ; CSS; JavaScript ; JQuery ; Java";
        // The split delimitator can be anything since a space, a first character or ponctuation
        String[] tokens = s.split(";");
        System.out.println(tokens.length);
        
        for(String token : tokens){
            System.out.println(token);
        }
        
    }
    
}
