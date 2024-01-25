/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author wellington
 */
public class Account {
    
    String client;
    long balance;
    
    
    void showBalance(){
    
        System.out.println("Mr. " + client + " has account balance of $ " + balance);
    
    }
    
    
    /**
     * This method must check the following conditions:
     * 
     * if the client has authorization.
     * if the amount of money is not more than he may has on its account.
     * if the amount x will be withdraw, it must reduce the current balance.
     * if the amount x withdraw, the new balance must be updated.
     *    
    *****/
    void withdraw(long withdrawValue){
        
        balance = balance - withdrawValue;
        //balance -= withdrawValue
        
    }
    
    void deposit(long deposit){
    
        balance = balance + deposit;
        // balance += deposit
    }
    
    void transferFor(Account receiver, long transferValue){
        
        this.withdraw(transferValue);
        receiver.deposit(transferValue);
    
    }
    
    
    
    
    
}
