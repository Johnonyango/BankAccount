package com.john;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class BankAccountBase {
    //    Properties/Attributes
    private String accountNumber;
    private String name;
    private static double balance;
    private Date dateCreated;

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
        System.out.println(this.getBalance());
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

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    static double deposit(double amount){
        return amount + balance;
    }
    static double withdraw(Float amount){
        if(balance>amount)
            try {
                return balance-amount;
            }catch (Exception e){
                System.out.println("Invalid operation. Your balance is less");
            }
        return 0;
    }
    static double calculateInterest(){
        return 0.0f;
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
