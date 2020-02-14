package com.go2it.abstractClasses.bankCustomer.bank1;

public class BusinessChequingAccount extends ChequingAccount {
    public BusinessChequingAccount(String ownerName, int accountNumber, float balance, float salary) {
        super (ownerName, accountNumber, balance, salary);
    }

    public int personalInfo() {
        return 0;
    }
}
