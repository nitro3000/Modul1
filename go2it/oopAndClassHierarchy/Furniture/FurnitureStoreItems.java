package com.go2it.oopAndClassHierarchy.Furniture;

public class FurnitureStoreItems {

    private String madeIn;
    private int serialNumber;
    private int numberOfSeats;
    private int numberOfLegs;
    private double price;
    private boolean brandNew;


    public FurnitureStoreItems(String madeIn, int serialNumber, int numberOfSeats, int numberOfLegs, double price, boolean brandNew) {

        this.madeIn = madeIn;
        this.serialNumber = serialNumber;
        this.numberOfSeats = numberOfSeats;
        this.numberOfLegs = numberOfLegs;
        this.brandNew = brandNew;
        this.price = price;
        this.brandNew = brandNew;
    }


    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public boolean isBrandNew() {
        return brandNew;
    }

    public void setBrandNew(boolean brandNew) {
        this.brandNew = brandNew;
    }


    @Override
    public String toString() {
        return ("This furniture made in: " + getMadeIn ( ) + "." + " The price is: $" + getPrice ( ) + " and it has " + getNumberOfSeats ( ) +
                " seats and " + getNumberOfLegs ( ) + " Legs .The serial #" + getSerialNumber ( ) + ". Is this Brand new item -" + isBrandNew ( ));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals (obj);
    }



}




