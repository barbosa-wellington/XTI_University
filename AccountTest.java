/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.xti.oop;

/**
 *
 * @author wellington
 */
public class AccountTest {
    
    public static void main (String [] args){
    
        
        Account ac = new Account();
        Account dc = new Account();
        
        ac.client = "Wellington";
        ac.balance = 11_000.00;
        ac.showBalance();
        
        
        dc.client = "Kamochanok";
        dc.balance = 8_000.00;
        dc.showBalance();
        
        
        ac.transferFor(dc, 400.00);
        
        // this command will print the new account balance of Wellington
        ac.showBalance();
        
        // this command will print the new account balance of Kamochanok
        dc.showBalance();
        
        Bank Bank_of_Australia = new Bank();
        Bank_of_Australia.showBankBalance();
        
        
        Bank_of_Australia.bankLoan(dc, 20.000);
        Bank_of_Australia.showBankBalance();
        
        dc.showBalance();
       
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
