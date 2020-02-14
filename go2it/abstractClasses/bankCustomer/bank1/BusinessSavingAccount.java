package com.go2it.abstractClasses.bankCustomer.bank1;

public class BusinessSavingAccount extends SavingAccount {
    //############################## Properties #########################################
    private int businessNumber;


//############################## CONSTRUCTORS #########################################

    public BusinessSavingAccount(String ownerName, int accountNumber, float balance, int savingAccountNumber, int businessNumber) {
        super (ownerName, accountNumber, balance, savingAccountNumber);
        //System.out.println ("Creating Business Saving Account" );
        this.businessNumber = businessNumber;
    }

    public int getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(int businessNumber) {
        this.businessNumber = businessNumber;
    }

    // payable withdraw method
    @Override
    public float withdraw(float amount) {
       // System.out.println ("Amount of $" + amount + " was successfully withdrawn . Withdrawal Fee included");
        System.out.println ( );
        float withdrawalFee = 1.25f;
        return getBalance ( ) - amount - withdrawalFee;
    }

    @Override
    public int personalInfo() {
        System.out.println ("Name of account holder: " + getOwner ( ));
        System.out.println ("Account Number: " + getAccountNumber ( ));
        System.out.println (getBalance ( ));
        return 0;
    }


    // bonus $1  for each $100 deposited on saving account
    @Override
    public float deposit(float amount) {
        int wholeDollars = (int) (amount / 100);
        float businessSavingBonus = wholeDollars * 1f;
        //System.out.print ("Amount of $" + amount + " was successfully  deposited on saving account number: " + getSavingAccountNumber ( ) + ".");
        return (getBalance ( ) + amount + businessSavingBonus);
    }


}
