/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import oop.Account;

/**
 *
 * @author wellington
 */
public class serializing {
    
    
    public static void main(String[] args) throws Exception{
    
        String[] names = {"Jj","Wellington","Kelly","Leandro"};
        
        
        Account account1 = new Account("Diego", 11000);
        
        
        
        
        /**/
        FileOutputStream fos = new FileOutputStream("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/object.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account1);
        oos.close();
        
        /* Read the object on the file*/
        FileInputStream fis = new FileInputStream("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/object.ser");
        ObjectInputStream oof = new ObjectInputStream(fis);
//        String[] names_d = (String[]) oof.readObject();
        Account c1 = (Account) oof.readObject();
        oof.close();
//        System.out.println(Arrays.toString(names_d));

        c1.showBalance();

    }
    
}
