package com.john;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {
        super("Value should not be negative");
    }
}
