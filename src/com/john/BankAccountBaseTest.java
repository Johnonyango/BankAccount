package com.john;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountBaseTest {
    @Test
    public void displayAccountInfo(){
        String accountNumber = "00075J";
        accountNumber.length();

        assertEquals(6, accountNumber.length());

    }

}