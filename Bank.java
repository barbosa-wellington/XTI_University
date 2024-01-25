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
    long bankLoan;
    long bankBalance;

    public Bank() {
        this.bankBalance = 900_000000;
        this.bankName = "Bank of Australia";
    }
    
    void showBankBalance(){
    
        System.out.println("The " + bankName + " has account balance of $ " + (double) bankBalance);
    
    }
    
    void bankLoan(Account receiver, long bankLoan){
        
        bankBalance = bankBalance - bankLoan;
        receiver.deposit(bankLoan);
        System.out.println(bankName + " has approved a loan for " + receiver + " of " + bankLoan);
    }
    
    
    
    
    
    
    
    
}
