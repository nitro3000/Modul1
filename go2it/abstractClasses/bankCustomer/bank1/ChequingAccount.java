package com.go2it.abstractClasses.bankCustomer.bank1;

import com.go2it.abstractClasses.bankCustomer.bank1.BankAccount;

public abstract class ChequingAccount extends BankAccount {
    //############################## Properties #########################################
    private float salary;


//############################## CONSTRUCTORS #########################################

    public ChequingAccount(String ownerName, int accountNumber, float balance, float salary) {
        super (ownerName, accountNumber, balance);
        //System.out.println ("creating chequing account");
        this.salary = salary;
    }


}
