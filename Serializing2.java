/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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






public class Serializing2 {

//            private Path path = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/Accounts.txt");
//            private Charset utf8 = StandardCharsets.UTF_8;

    
//    Creating a method that can allows encapsulation.
    public void storeAccouts(ArrayList<Account> accounts) throws IOException{
        
//        By adding this new line of code, the method does not require the path and charset utf8
        try(FileOutputStream fos = new FileOutputStream("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/accounts.ser")){
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(accounts);
            }
        }
        
        
//        This is the old method of write on the file
//        try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
//            for(Account ac : accounts){
////                w.write("Client Name: " + ac.getClient() + "; Balance: " + ac.getBalance() + "\n");
//                  w.write(ac.getClient() + ";" + ac.getBalance() + "\n");
//            }
//        }
    }
    
    
    public ArrayList<Account> readAccounts() throws IOException, ClassNotFoundException {
        
        try(FileInputStream fis = new FileInputStream("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/accounts.ser")){
            try(ObjectInputStream oof = new ObjectInputStream(fis)){
                return (ArrayList<Account>) oof.readObject();
            }
        }
        
//        Old method implementaiton which used the BufferedReader to read all the file content.
//        ArrayList<Account> accountsClass = new ArrayList<>();
//        
//
//        try(BufferedReader r = Files.newBufferedReader(path, utf8)){
//            String line = null;
//            while((line = r.readLine()) != null){
//                String[] t = line.split(";");
//                //System.out.println(t[0]+t[1]);
//                Account accounts = new Account(t[0],Double.parseDouble(t[1]));
//                accountsClass.add(accounts);
//            }       
//        }
//        return accountsClass;
    }

    
    public static void main(String[] args) throws ClassNotFoundException{
    
    
        
        ArrayList<Account> accounts = new ArrayList<>();
        Path path = Paths.get("C:/Users/wellb/Documents/Code/Java-Programming/JavaXti/src/files_test/Accounts.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        
        
        
//        Creating the accounts  
        accounts.add(new Account("Wellington", 12500));
        accounts.add(new Account("Kamochanok", 34000));
        accounts.add(new Account("Kelly", 10000));
        accounts.add(new Account("Leandro", 32000));
        
        
//        Creating a range of clients to be add to the file.
//        for(int i =0; i <150000; i++){
//        
//            accounts.add(new Account("User"+i, i+ 23 +i + 40));
//        }
        
//        Method to write new lines on the file and print on hte ocnsole.
//        try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
//            
//          for(Account ac : accounts){
//              w.write("Client Name: " + ac.getClient() + " \t balance: $AU" + ac.getBalance() + "\n");
//          }
//            
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Creating a new object to get access to the method
        Serializing2 ch = new Serializing2();
        
        try{
        
            ch.storeAccouts(accounts);
        
        } catch (IOException e){
            e.printStackTrace();
        }
        
        
        
        
        
//        The calling method will only works if the column balance contains only number or doubles. 
// Otherwie it will return an error Exception in thread "main" java.lang.NumberFormatException: For input string: "Balance: 12500.0"
// the accounts must be stored as name;balance. There is not need to store labels.
        try {
//            ch.readAccounts(accounts);
            ArrayList<Account> account2 = ch.readAccounts();
            for(Account acd : account2){
                System.out.println(acd.getClient() + " "+ acd.getBalance());
                
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            
//        Method to read each line of the file and print on hte ocnsole.
//        try (BufferedReader r = Files.newBufferedReader(path, utf8)){
//            String line = null;
//            while((line = r.readLine()) != null){
//                System.out.println(line);
//            }
//            
//        } catch(IOException e){
//            e.printStackTrace();
//        }
        
    }
    
}
