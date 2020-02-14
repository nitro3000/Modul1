package com.go2it.abstractClasses.bankCustomer.bank2;

import java.time.LocalDate;

public class PersonalClient extends Client implements BankAccountServices, Promotionable, CreditLineApplyable {
    private int creditScore;
    private double balance;
    private int accountNumber;

    public PersonalClient() {
    }

    public PersonalClient(int b) {
    }

    public PersonalClient(String firstName, String lastName, LocalDate dOB, GENDER gender, boolean isCanadianResident,
                          double monthlyIncome, double monthlySpends, LocalDate dateOfOpenAccount, double balance, int creditScore, int accountNumber) {
        super (firstName, lastName, dOB, gender, isCanadianResident, monthlyIncome, monthlySpends, dateOfOpenAccount);
        this.creditScore = creditScore;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }


    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    public int openAccount(int accountNumber) {
        if (isCanadianResident ( ) == true) {
            System.out.println (accountNumber);
        } else {
            System.out.println ("Can not open account for non Canadian resident");
            System.exit (1);
        }
        return 0;
    }

    @Override
    public int closeAccount(int accountNumber) {
        return 0;
    }

    @Override
    public double fee() {

        return 0;
    }

    @Override
    public double deposit(double desireAmount) {
        try {
            if (desireAmount < 0) {
                throw new IllegalArgumentException ("Can not type in negative number");
            }
        } catch (IllegalArgumentException e) {
            System.out.println ("Can not type in negative number");
            return 0;     // what i should type-in under return: "zero" or "desire amount"? without return program will not stop after catching of exception. what the meaning of : if will be "0" and "desire amount"?
        }
        if (desireAmount >= 0)
            this.balance += desireAmount;
        System.out.println ("Deposit of $" + desireAmount + " was successful. Your new balance is: $" + getBalance ( ));
        return desireAmount;  // what i should type-in under return: "zero" or "desire amount"? and what the difference will be in each case?
    }

    @Override
    public double withdraw(double desireAmount) {
        try {
            if (desireAmount < 0) {
                throw new IllegalArgumentException ("Can not type in negative number");
            }
        } catch (IllegalArgumentException e) {
            System.out.println ("Can not type in negative number");
            return 0;  // what i should type-in under return: "zero" or "desire amount"? without return program will not stop after catching of exception. what the meaning of : if will be "0" and "desire amount"?
        }
        if (desireAmount <= balance) {
            this.balance -= desireAmount;
            System.out.println ("Withdrawal of $" + desireAmount + " was successful. Your new balance is: $" + getBalance ( ));
            return 0;  // what i should type-in under return: "zero" or "desire amount"?
        }
        System.out.println ("your Balance is less than desire amount to withdraw");
        return 0;
    }

    @Override
    public double cashBack() {
        double cashbackBonus1 = getMonthlySpends ( ) * .1;
        double cashbackBonus2 = getMonthlySpends ( ) * .15;
        if (getMonthlySpends ( ) > 5000) {
            this.balance += cashbackBonus1;
            System.out.println ("You received a cash-back bonus of : $" + cashbackBonus1 + ". Your new balance is: $" + getBalance ( ));
        } else if (getMonthlySpends ( ) > 10000) {
            this.balance += cashbackBonus2;
            System.out.println ("You received a cash-back bonus of : $" + cashbackBonus2 + ". Your new balance is: $" + getBalance ( ));
        }
        return 0;
    }
}
