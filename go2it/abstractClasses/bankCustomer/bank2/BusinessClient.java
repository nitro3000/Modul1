package com.go2it.abstractClasses.bankCustomer.bank2;

import java.time.LocalDate;

public class BusinessClient extends Client {

    public BusinessClient(String firstName, String lastName, LocalDate dOB, GENDER gender, boolean isCanadianResident, double monthlyIncome, double monthlySpends, LocalDate dateOfOpenAccount) {
        super (firstName, lastName, dOB, gender, isCanadianResident, monthlyIncome, monthlySpends, dateOfOpenAccount);
    }
}
