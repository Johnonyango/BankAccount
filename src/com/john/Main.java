package com.john;

public class Main {

    public static void main(String[] args) throws InsufficientBalanceException {
        BankAccountBase bankAccount = new BankAccountBase();
        bankAccount.displayAccountInfo();
        bankAccount.getBalance();
        bankAccount.withdraw(0); //Test amount 0;
    }
}
