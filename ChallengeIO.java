/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import oop.Account;

/**
 *
 * @author wellington
 */
public class ChallengeIO {
    
    
    public static void main(String[] args){
    
    
        
        ArrayList<Account> accounts = new ArrayList<>();
        Path path = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/Accounts.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        
        
        
//        Creating the accounts  
        accounts.add(new Account("Wellington", 12500));
        accounts.add(new Account("JJ", 34000));
        accounts.add(new Account("Kelly", 10000));
        accounts.add(new Account("Leandro", 32000));
        
        
//        Creating a range of clients to be add to the file.
//        for(int i =0; i <150000; i++){
//        
//            accounts.add(new Account("User"+i, i+ 23 +i + 40));
//        }
        
//        Method to write new lines on the file and print on hte ocnsole.
        try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
            
          for(Account ac : accounts){
              w.write("Client Name: " + ac.getClient() + " \t balance: $AU" + ac.getBalance() + "\n");
          }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
//        Method to read each line of the file and print on hte ocnsole.
        try (BufferedReader r = Files.newBufferedReader(path, utf8)){
            String line = null;
            while((line = r.readLine()) != null){
                System.out.println(line);
            }
            
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
