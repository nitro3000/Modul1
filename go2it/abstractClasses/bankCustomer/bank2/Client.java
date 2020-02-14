package com.go2it.abstractClasses.bankCustomer.bank2;

import java.time.LocalDate;

public abstract class Client extends Person {
    private boolean isCanadianResident;
    private double monthlyIncome;
    private double monthlySpends;
    private LocalDate dateOfOpenAccount;

    public Client() {

    }

    public Client(String firstName, String lastName, LocalDate dOB, GENDER gender,boolean isCanadianResident,double monthlyIncome,double monthlySpends,LocalDate dateOfOpenAccount) {
        super (firstName, lastName, dOB, gender);
        this.isCanadianResident=isCanadianResident;
        this.monthlyIncome=monthlyIncome;
        this.monthlySpends=monthlySpends;
        this.dateOfOpenAccount=dateOfOpenAccount;
    }



    public boolean isCanadianResident() {
        return isCanadianResident;
    }
    public void setCanadianResident(boolean canadianResident) {
        isCanadianResident = canadianResident;
    }
    public double getMonthlyIncome() {
        return monthlyIncome;
    }
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
    public double getMonthlySpends() {
        return monthlySpends;
    }
    public void setMonthlySpends(double monthlySpends) {
        this.monthlySpends = monthlySpends;
    }
    public LocalDate getDateOfOpenAccount() {
        return dateOfOpenAccount;
    }
    public void setDateOfOpenAccount(LocalDate dateOfOpenAccount) {
        this.dateOfOpenAccount = dateOfOpenAccount;
    }

    @Override
    public String toString() {
        return super.toString ( );
    }




}

