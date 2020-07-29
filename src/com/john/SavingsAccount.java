package com.john;

public class SavingsAccount extends BankAccountBase{
    @Override
    public Float getBalance() {
        return super.getBalance();
    }

    public SavingsAccount() {
        BankAccountBase baseConstructor = new BankAccountBase();
    }

    @Override
    public void setBalance(Float balance) {
        super.setBalance(balance);
    }
}
