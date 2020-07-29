package com.john;

public class Main {

    public static void main(String[] args) {
        BankAccountBase bankAccount = new BankAccountBase();
        bankAccount.displayAccountInfo();
        bankAccount.getBalance();
    }
}
