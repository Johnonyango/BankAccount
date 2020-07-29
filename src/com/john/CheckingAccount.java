package com.john;

public class CheckingAccount extends BankAccountBase {

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    void calculateInterest() {
        super.calculateInterest();
        final double rate = 0.75 / 100;
        final int time = 1; // Year
        double interest = (rate * getBalance() * time);
        this.setBalance(getBalance() + interest);
        this.showBalance();
        System.out.println("added interest and updated balance");
    }
    void withdraw() throws InsufficientBalanceException {
        if (getBalance() < 500) {
            throw new InsufficientBalanceException();
        } else {
            super.withdraw(null);
        }
    }
}
