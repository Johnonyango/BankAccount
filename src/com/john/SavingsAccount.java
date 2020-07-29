package com.john;

import org.jetbrains.annotations.NotNull;

public class SavingsAccount extends BankAccountBase{
    @Override
    public @NotNull double getBalance() {
        return super.getBalance();
    }

    public SavingsAccount() {
        BankAccountBase baseConstructor = new BankAccountBase();
    }

    public void setBalance(Float balance) {
        super.setBalance(balance);
    }
}
