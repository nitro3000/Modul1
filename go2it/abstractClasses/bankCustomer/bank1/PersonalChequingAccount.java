package com.go2it.abstractClasses.bankCustomer.bank1;

import com.go2it.abstractClasses.bankCustomer.bank1.ChequingAccount;
import com.go2it.abstractClasses.bankCustomer.bank1.canadian;
import com.go2it.abstractClasses.bankCustomer.bank1.creditLineApplicable;

public class PersonalChequingAccount extends ChequingAccount implements creditLineApplicable, canadian {
    public PersonalChequingAccount(String ownerName, int accountNumber, float balance, float salary) {
        super (ownerName, accountNumber, balance, salary);
    }

//    @Override
//    public float getBalance() {
//        System.out.print ("The current balance on Personal chequing account number: "+ getAccountNumber ()+" is: $");
//        System.out.println (getBalance () );
//        return 0;
//    }
    @Override
    public int personalInfo() {
        return 0;
    }

    /* interface method to implement in one of the classes: */
    @Override
    public float creditBalance() {
        System.out.println ("interface method Implemented, check new balance of this account");
        //getBalance ()
       return 5000;
    }


    @Override
    public boolean isCanadian() {
        return false;
    }


}
