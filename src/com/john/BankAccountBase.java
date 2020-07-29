package com.john;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class BankAccountBase {
    //    Properties
    @NotNull
    private String accountNumber;

    @NotNull
    private String name;

    @NotNull
    private static Float balance;

    @NotNull
    private Date dateCreated;

    //    Constructor without parameters
    public BankAccountBase() {
        this.dateCreated = new Date();
    }

    //    Constructor with parameters
    BankAccountBase(String accountNumber, String name, Float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.dateCreated = new Date();
    }

//    Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

//    ******Methods********
    public static void displayAccountInfo(){
        BankAccountBase bankDetails = new BankAccountBase();
        bankDetails.getAccountNumber();
        bankDetails.getName();
        bankDetails.getBalance();

        bankDetails.setAccountNumber("0000175J");
        bankDetails.setName("John");
        bankDetails.setBalance(788.41f);
    }
    static float deposit(Float amount){
        return amount + balance;
    }
    static float withdraw(Float amount){
        if(balance>amount)
            try {
                return balance-amount;
            }catch (Exception e){
                System.out.println("Invalid operation. Your balance is less");
            }
        return 0;
    }
    static Float calculateInterest(){
        return 0.0f;
    }
}
