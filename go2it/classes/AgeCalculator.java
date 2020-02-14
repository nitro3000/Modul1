package com.go2it.classes;

import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now ();
        LocalDate dob = LocalDate.of (1980,10,24);
        int age = (today.getYear ())-(dob.getYear ());
        //System.out.println ( "Today Date is: "+today);
        //System.out.println ( dob);
        System.out.println (" I'm "+ age+ " years old");




    }
}
