package com.john;

public class NegativeBalanceExeption extends Exception {
    public NegativeBalanceExeption() {
        super("Insufficient Balance");
    }
}
