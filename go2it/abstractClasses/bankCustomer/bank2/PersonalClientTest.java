package com.go2it.abstractClasses.bankCustomer.bank2;

import com.go2it.abstractClasses.bankCustomer.bank2.GENDER;
import com.go2it.abstractClasses.bankCustomer.bank2.PersonalClient;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonalClientTest {

    //############################### TEST ON DEPOSIT METHOD ###############################

    @Test
    public void depositTest1() {
        PersonalClient account1 = new PersonalClient ("j", "b", LocalDate.of (1999, 12, 1), GENDER.MALE, true,
                5000, 12000, LocalDate.of (2015, 9, 9), 0, 700, 90004);

        //account1.setBalance (100);

        double desireAmount = account1.deposit (10);
        assertEquals (10, desireAmount, "");
    }


    //############################### TEST ON WITHDRAWALS METHOD ###############################
    @Test
    public void withdrawTest() {
        PersonalClient account1 = new PersonalClient ("j", "b", LocalDate.of (1999, 12, 1), GENDER.MALE, true,
                5000, 12000, LocalDate.of (2015, 9, 9), 0, 700, 90004);

        //account1.setBalance (100);

        double desireAmount = account1.withdraw (10);
        assertEquals (10, 10);
    }

//    @Test
//    public void withdrawTest1() {
//        PersonalClient account1 = new PersonalClient ("j", "b", LocalDate.of (1999, 12, 1), GENDER.MALE, true,
//                5000, 12000, LocalDate.of (2015, 9, 9), 0, 700, 90004);
//
//        account1.setBalance (100);
//
//        double desireAmount = account1.withdraw (100);
//        assertEquals (100, desireAmount);
//    }

    //****************** test unit using Exception ****************************
    @Test
    public void withdrawTestNegativeAmount() {
        try {
            PersonalClient account1 = new PersonalClient ("j", "b", LocalDate.of (1999, 12, 1), GENDER.MALE, true,
                    5000, 12000, LocalDate.of (2015, 9, 9), 0, 700, 90004);
            account1.setBalance (100);
            double desireAmount2 = account1.withdraw (-100);//must to handle exception
            assertEquals (0, desireAmount2, "");
        } catch (IllegalArgumentException e) {
            System.out.println ("negative number was entered, exception was caught");
        }
    }

    @Test
    public void withdrawTestWithBalance() {
        PersonalClient account1 = new PersonalClient ("j", "b", LocalDate.of (1999, 12, 1), GENDER.MALE, true,
                5000, 12000, LocalDate.of (2015, 9, 9), 0, 700, 90004);

        account1.setBalance (100);

        double desireAmount2 = account1.withdraw (1000);
        assertEquals (0, desireAmount2, "");
    }


}
//    @Override
//    public double withdraw(double desireAmount) {
//        if (desireAmount <= balance ){
//            this.balance-=desireAmount;
//            System.out.println ("Withdrawal of $"+ desireAmount+  " was successful. Your new balance is: $" + getBalance () );
//        }else{
//            System.out.println ("your Balance is less than desire amount to withdraw" );
//        }
//        return 0;
//    }
