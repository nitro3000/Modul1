package com.go2it.abstractClasses.bankCustomer.bank1;

public class PersonalSavingAccount extends SavingAccount {
    public PersonalSavingAccount(String ownerName, int accountNumber, float balance, int savingAccountNumber) {
        super (ownerName, accountNumber, balance, savingAccountNumber);
    }

    @Override
    public int personalInfo() {
        return 0;
    }
}
