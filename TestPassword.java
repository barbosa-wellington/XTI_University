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
public class TestPassword {
    
    
    static void authenticationT(String passw) throws PasswordError{
        if("123".equals(passw)){
            System.out.println("Authentication confirmed.");
        } else {
            throw new PasswordError("Password Invalided");
        }
    }
    
    public static void main(String[] args){
    
        try{
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Informe password for authentication: ");
            String pw = sc.nextLine();
            
            //authenticationT("123");
        
            authenticationT(pw);
        } catch(PasswordError e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    
    }
    
    
}
