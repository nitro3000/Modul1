package com.go2it.oopAndClassHierarchy.Furniture;

public class Table extends FurnitureStoreItems {

    String madeOf;

    public Table(String madeIn, int serialNumber, int numberOfSeats, int numberOfLegs, double price, boolean brandNew,String madeOf) {
        super (madeIn, serialNumber, numberOfSeats, numberOfLegs, price, brandNew);
        this.madeOf=madeOf;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }


    @Override
    public String toString() {
        return ("This table made in : "+ getMadeIn ()+",  This table made of - " + getMadeOf ()+". The price is: $"
                + getPrice ()+". It has "+ getNumberOfLegs ()+ " legs. The serial #"+getSerialNumber ()+"."+" Is this Brand new item -"+isBrandNew () );
    }


}
