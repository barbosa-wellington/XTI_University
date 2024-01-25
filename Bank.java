/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author wellington
 */
public class Bank {
    
    
    String bankName;
    double bankLoan;
    double bankBalance;

    public Bank() {
        this.bankBalance = 90_000_000;
        this.bankName = "Bank of Australia";
    }
    
    void showBankBalance(){
    
        System.out.println("The " + bankName + " has account balance of $ " + (double) bankBalance);
    
    }
    
    void bankLoan(Account receiver, double bankLoan){
        
        bankBalance = bankBalance - bankLoan;
        receiver.deposit(bankLoan);
         
    }
    
    
    
    
    
    
    
    
}
