/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

/**
 *
 * @author wellington
 */
public class StringOperations {
    
    public static void main(String[] args){
    
    
        String s1 = "Write Once";
        String s2 = s1 + "Run AnyWhere";
        
        String s3 = new String("Java Virtual Machine");

        char[] array = {'J','a','v','a'};
        String s4 = new String(array);
        
        
        //Basic Operations
        int sLenght = s1.length();
        char letter = s1.charAt(0);
        String text = s1.toString();
        
        
        //Localization Methods
        int possition = s3.indexOf("Virtual");
        System.out.println(possition);
        
        // Mehtod that will find the last occurence of a character or world
        int lastL = s3.lastIndexOf('a');
        
        //empty string
        boolean emplyL = s3.isEmpty();
        System.out.println(emplyL);
        
        
        //Comparation
        String xti = "XTI";
        boolean x = xti.equals("xti");
        boolean j = xti.equalsIgnoreCase("xti");
        
        System.out.println(x);
        System.out.println(j);
        
        // These method return a boolean value which determines
        // if an string starts or ends with an specify partterns.
        boolean q = xti.startsWith("TI");
        boolean w = xti.endsWith("TI");
        
        int c = "amor".compareTo("bola");
   
        String so = "Olhe olhe!";
        // By default this line will check if the string is equal by the previous one.
        // however it will not ignore the case sensitive so that it will return false.
        //boolean o = so.regionMatches(6, "Olhe", 0, 4);
        
        // Now the same approached by use case sensitive validation 
        boolean p = so.regionMatches(true, 6 ,"Olhe", 0,  4);
        System.out.println("regionMatches method : " + p);
        
        // Extractoin data on a String
        
        String l = "Brazil is a beautiful";
        String s5 = l.substring(10);
        System.out.println(s5);
        
        // Calling a constructor ethod from substring method.
        String s6 = l.substring(0,5);
        System.out.println(s6);
        
        
        // Modification of strings
        String s7 = l.concat(".However there is a lot of politicians.");
        System.out.println(s7);
        
        //chage character
        String s8 = l.replace('z', 's');
        //String s9 = l.replaceFirst(" ","-");
        //String s9 = l.replaceAll(" ", "-");
        
        
        // Method to turn a string into all uppercase
        //String s9 = l.toUpperCase();
        String s9 = l.toLowerCase();
        
        // The method trim() remove the early and last space in a string
        // but not remove the spaces between the string
        System.out.println(" space on this string ".trim());
    }
    
}
