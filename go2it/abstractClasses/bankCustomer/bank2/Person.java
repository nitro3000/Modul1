package com.go2it.abstractClasses.bankCustomer.bank2;

import java.time.LocalDate;

public abstract class Person {

    private String firstName;
    private String lastName;
    private LocalDate dOB;
    private GENDER gender;

    public Person(){

    }

    public Person (String firstName,String lastName,LocalDate dOB,GENDER gender){
        this.firstName= firstName;
        this.lastName=lastName;
        this.dOB=dOB;
        this.gender=gender;
    }



    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getdOB() {
        return dOB;
    }
    public void setdOB(LocalDate dOB) {
        this.dOB = dOB;
    }
    public GENDER getGender() {
        return gender;
    }
    public void setGender(GENDER gender) {
        this.gender = gender;
    }


    public String toString() {
        return "First name: "+firstName + " Last name: "+lastName+" DOB: "+dOB;
    }
}
