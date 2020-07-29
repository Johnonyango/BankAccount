package com.john;

import org.jetbrains.annotations.NotNull;

public class SavingsAccount extends BankAccountBase {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String accountNumber, String name, double balance) throws NegativeBalanceExeption {
        super(accountNumber, name, balance);
    }

    @Override
    void calculateInterest() {
        super.calculateInterest();
        final double rate = 5 / 100;
        final int time = 1; // Year
        double interest = (rate * getBalance() * time);
        this.setBalance(getBalance() + interest);
        this.showBalance();
        System.out.println("added interest and updated balance");
    }

    void withdraw() throws InsufficientBalanceException {
        if (getBalance() < 2500) {
            super.withdraw(null);
        } else {
            throw new InsufficientBalanceException();
        }
    }
}