package com.john;

public class insufficientBalanceException extends Throwable {
    public insufficientBalanceException() {
        super("Insufficient Balance");
    }
}
