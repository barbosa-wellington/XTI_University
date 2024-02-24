/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    
    /*
    Metacharacter of front
    ^ initiate
    $ finalize
    | or 
    */
    
    // Validating the initial character
    b = "Pier21".matches("^Pier.*");
    
    // Validating the end of the string with a number
    b = "Pier21".matches(".*21$");

    //verify if its has Java in the middle
    b = "There is Java here".matches(".*Java.*");
    
    
    // verify if the string begins with the word there,
    // the (?i) will ignore the upper or lower case
    b = "There is Java here".matches("(?i)^There.* here$");
    
    // Verify if there is a pattern like yes, no\ male or fimale
    b = "yes".matches("yes|no");
    
    /**Groups
     * 
     * [...]            Groupers
     * [a-z]            All letters between a to z
     * [a-e][i-u]       Union parts
     * [a-z&&[aeiou]]   Intersecsion
     * [^abc]           exceptions - everythings besides [abc]
     * [a-z&&[^m-p]]    Subtraction
     * \x   scape literal
     * */
    
    // Validating anything between a to z
    b = "A".matches("[a-z]");
    
    // Validating any thing between 0 to 3
    b = "3".matches("[0-3]");
    
    // validating the first character of the word true upper or lower case
    b = "True".matches("[tT]rue");
    
    b = "Yes".matches("[tT]rue|[yY]es");
    
    // name validation
    //Upper case first character
    b = "yes".matches("yes|no");
    
    boolean name = "Wellington".matches("[A-Z][a-z]*");
    //System.out.println(name);
    
    b = "olho".matches("[^abc]lho");
    
    
    // email validation
    boolean email = "test@test.com.au".matches("\\w+@\\w+\\.\\d{2,3}");
    System.out.println(email);
    
    // Java will using the matches class in time rutinme while executing the code.
    // It will apply some algorithms 
    
    String sweet = "Which sweet is the most SWeet of all sweeT";
    
    // The class Pattern will offer an use for more than thousand approaches
    
    // This expression will find the occurence of the word "sweet"
    // and the loop while has an variable count that will count the number of time
    // where this word occure as well as the forms.
    Matcher matcherT = Pattern.compile("(?i)sweet").matcher(sweet);
    
    int count = 0;
    while(matcherT.find()){
        
        count += 1;
        System.out.println(matcherT.group() + " " + count);
    }    
    
    /* Substitucion*/
    
    // Here the replaceAll method will replace the sweet to sweety as an adjective
    String r = sweet.replaceAll("(?i)sweet", "sweety");
    System.out.println(r);
    
    String rat = "O rato roeu a roupa do rei de roma";
    r = rat.replaceAll("r[aeiou]", "XX");
    System.out.println(r);
    
    
    r = "Replace this text".replaceAll("\\s", "\t");
    
    String url = "www.xti.com.br/clients-2023.html";
                    //https://www.xti.com.br/2023/clients.jsp
                    
   String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";                 
   b = url.matches(re);
   
   System.out.println(b);
   
   re = "(www.xti.com.br/)(\\w{2,})-(\\d{4}).html";
   
   System.out.println(re);
   r = url.replaceAll(re, "https://$1/$3/$2.jsp");
   System.out.println(r);
   
    }
    
}
