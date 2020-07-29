package com.john;

public class InsufficientBalanceException extends Throwable {
    public InsufficientBalanceException() {
        super("Insufficient Balance");
    }
}
