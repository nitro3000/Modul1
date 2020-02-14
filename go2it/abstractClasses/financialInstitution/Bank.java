package com.go2it.abstractClasses.financialInstitution;


public class Bank extends FinancialInstitution {
    private String ownerName;
    private int numberOfBranches;
    private boolean isInternational;

public Bank(){
    System.out.println ("Creating new bank" );
}

public  Bank(String title,String bankAccNumber,String ownerName,boolean isInternational){
    super(title,bankAccNumber);
    System.out.println ("Creating new bank with parameters" );
    this.ownerName = ownerName;
    this.isInternational= isInternational;
}

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setNumberOfBranches(int numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public int getNumberOfBranches() {
        return numberOfBranches;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }






}

