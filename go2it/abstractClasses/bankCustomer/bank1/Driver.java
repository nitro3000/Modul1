package com.go2it.abstractClasses.bankCustomer.bank1;

// Develop a system for bank. Describe the Customer of the bank using the abstract classes and interfaces.
// Customer: can be a Canadian/non-Canadian resident
// can apply for credit line because she has a good credit score/cannot apply for a credit line,
// can get some special promotion since she spent $5000 last month/cannot get the promo
// can have several bank products (credit card, credit line, mortgage, business account, investment account, retirement account etc.)
// we can store information about customer family members who are not customers of our bank (if she provides us with this data)
//You should try to generalize the properties of the customer and separate some of them into the properties/interfaces/abstract classes.

public class Driver {

    public static void main(String[] args) {

//BankAccount bankAccount1234 = new BankAccount("name",1000001,50);
//        System.out.println (bankAccount1234.getBalance () );
//        System.out.println (bankAccount1234.deposit (250.55f));
//        System.out.println (bankAccount1234.deposit (250.55f));
//        System.out.println (bankAccount1234.withdraw (500.00f));
//        bankAccount1234.setBalance (200.00f);
//        System.out.println (bankAccount1234.getBalance ());

//SavingAccount savingAccount = new SavingAccount ("Mojo-jojo",030025,10,0);
//        System.out.println (savingAccount.getBalance () );
//        System.out.println (savingAccount.deposit (55.00f));
//        //savingAccount.deposit (100);  to check why when i use this method without SOUT it works but give me "deposit" statement twice?
//        savingAccount.withdraw (20);
        //       System.out.println (savingAccount.deposit (500) );

        BusinessSavingAccount account1 = new BusinessSavingAccount ("mojo-jojo", 90003, 3000, 900031, 45809);
        BusinessChequingAccount account2 = new BusinessChequingAccount ("John Travolta", 90004, 2000, 50000);
        PersonalSavingAccount account3 = new PersonalSavingAccount ("Vasiliy Chapaev", 90005, 100, 80005);
        PersonalChequingAccount account4 = new PersonalChequingAccount ("Hulk Green", 90006, 900, 2000);

        account1.deposit (123);
        account1.getBalance ();





    }

}
