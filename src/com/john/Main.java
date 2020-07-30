package com.john;

public class Main {

    public static void main(String[] args) throws InsufficientBalanceException, NegativeBalanceExeption {
        BankAccountBase bankAccount = new BankAccountBase();
        SavingsAccount savings = new SavingsAccount();
        bankAccount.displayAccountInfo();
        bankAccount.getBalance();
        bankAccount.withdraw(0.0); //Test amount 0;
//        savings.withdraw();
        savings.calculateInterest();
        savings.deposit(0.0);
    }
}
