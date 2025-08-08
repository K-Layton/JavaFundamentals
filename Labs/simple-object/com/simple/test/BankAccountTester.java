package com.simple.test;

import com.simple.account.BankAccount;
import com.simple.account.SavingsAccount;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, "Jeff Lebowski", 100f);
        System.out.println("A Bank Account");
        System.out.println("ID: " + account.getAccountID());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Owner: " + account.getOwnerName());

        BankAccount account2 = new BankAccount(2, "Bunny Lebowski", 5000f);
        BankAccount account3 = new BankAccount(3, "Walter Sobcheck", 1000000f);

        System.out.println("account2 is owned by " + account2.getOwnerName());
        BankAccount.setInterestRate(5.5f);

        System.out.println("account3 is owned by " + account3.getOwnerName());
        account2.deposit(100f);
        account3.deposit(900f);
        System.out.println("account2's balance is " + account2.getBalance());
        System.out.println("account3's balance is " + account3.getBalance());
        System.out.println("account2's interestRate is " + BankAccount.getInterestRate());
        System.out.println("account3's interestRate is " + BankAccount.getInterestRate());

           
        SavingsAccount sAccount = new SavingsAccount(3, "Donny K", 6000f);
        System.out.println("The SavingAccount's balance is " + sAccount.getBalance());

    }

    

}