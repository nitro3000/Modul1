package com.go2it.abstractClasses.bankCustomer.bank2;
// Develop a system for bank. Describe the Customer of the bank using the abstract classes and interfaces.
// Customer: can be a Canadian/non-Canadian resident
// can apply for credit line because she has a good credit score/cannot apply for a credit line,
// can get some special promotion since she spent $5000 last month/cannot get the promo
// can have several bank products (credit card, credit line, mortgage, business account, investment account, retirement account etc.)
// we can store information about customer family members who are not customers of our bank (if she provides us with this data)
//You should try to generalize the properties of the customer and separate some of them into the properties/interfaces/abstract classes.

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PersonalClient account1 = new PersonalClient ("J", "B", LocalDate.of (1980, 10, 24), GENDER.MALE,
                true, 10000, 20000,
                LocalDate.of (2015, 9, 21), 0, 800, 900001);

        PersonalClient account2 = new PersonalClient ();

        account1.deposit (500);
        account1.withdraw (100);
        account1.withdraw (-100);








    }

}
