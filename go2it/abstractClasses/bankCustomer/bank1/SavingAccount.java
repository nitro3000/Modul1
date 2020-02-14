package com.go2it.abstractClasses.bankCustomer.bank1;

import com.go2it.abstractClasses.bankCustomer.bank1.BankAccount;

public abstract class SavingAccount extends BankAccount {
    //############################## Properties #########################################
    private int savingAccountNumber;


//############################## CONSTRUCTORS #########################################

    public SavingAccount(String ownerName, int accountNumber, float balance, int savingAccountNumber) {
        super (ownerName, accountNumber, balance);
        //System.out.println ("creating saving account");
        this.savingAccountNumber = savingAccountNumber;
    }


    public int getSavingAccountNumber() {
        return savingAccountNumber;
    }

    public void setSavingAccountNumber(int savingAccountNumber) {
        this.savingAccountNumber = savingAccountNumber;
    }

    //  disable withdraw method
    @Override
    public float withdraw(float amount) {
        System.out.println ("Can't withdraw from saving account, operation canceled.");
        System.out.println (getBalance ( ));
        return 0;
    }

    // bonus 50 cent for each $100 deposited on saving account
    @Override
    public float deposit(float amount) {
        System.out.print ("Amount of $" + amount + " was successfully  deposited on saving account number: " + getSavingAccountNumber ( ) + ".");
        int wholeDollars = (int) (amount / 100);
        float savingBonus = wholeDollars * 0.5f;
        return getBalance ( ) + amount + savingBonus;
    }


}

