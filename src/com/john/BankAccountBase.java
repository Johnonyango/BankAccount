package com.john;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class BankAccountBase {
    //    Properties/Attributes
    private String accountNumber;
    private String name;
    protected double balance;
    Date dateCreated;

    //    Constructor without parameters
    public BankAccountBase() {
        this.setDateCreated(new Date());
    }

    //    Constructor with parameters
    BankAccountBase(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.setDateCreated(new Date());
    }

    //    ******Methods********
    public void displayAccountInfo(){
        System.out.println(this.toString());
    }
    void showBalance(){
        System.out.println(this.balance);
    }

    void deposit(double amount){
        this.setBalance(this.getBalance() + amount);
        this.showBalance();
    }
    void withdraw(Double amount){
            try {
                if(amount>balance)
                    this.setBalance(this.balance-amount); //********
                this.showBalance();
            }catch (NullPointerException n){
                System.out.println("This code is being corrected for null value pointer");
            }
    }
    void calculateInterest(){
        System.out.println("This method will return interest");
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

    public @NotNull double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "BankAccountBase{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
