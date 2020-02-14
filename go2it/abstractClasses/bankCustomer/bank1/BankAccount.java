package com.go2it.abstractClasses.bankCustomer.bank1;

//############################## Properties #########################################
public abstract class BankAccount {
    private String owner;
    private int accountNumber;
    private float balance;

    //############################## CONSTRUCTORS #########################################
//    public BankAccount() {
//        System.out.println ("creating bank account");
//    }
    public BankAccount(String ownerName, int accountNumber, float balance) {
       // System.out.println ("creating bank account with parameters");
        this.owner = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        //System.out.print ("The current balance is: $");
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    //*****************Deposit money into the account************************
//    public void deposit(float amount) {
//        this.balance += amount;
//    }

    public float deposit(float amount) {
        System.out.print ("Amount of $" + amount + " was successfully  deposited. ");
        this.balance += amount;
        //this.balance = this.balance + amount;
        return this.balance;
    }

    //*****************Withdraw money into the account************************
//    public void withdraw(float amount){
//        if(this.balance>=amount)
//            this.balance-=amount;
//    }
    public float withdraw(float amount) {
        System.out.print ("Amount of $" + amount + " was successfully withdrawn. ");
        return this.balance = getBalance ( ) - amount;
    }
    //****************get personal info************************


    public abstract int personalInfo();
//        System.out.println ("Name of account holder: "+getOwner () );
//        System.out.println ("Account Number: "+getAccountNumber () );
//        System.out.println (getBalance () );


}
