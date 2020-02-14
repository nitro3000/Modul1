package com.go2it.oopAndClassHierarchy.Furniture;

public class Chair extends FurnitureStoreItems {

    private boolean hasChairBack;

    public Chair(String madeIn, int serialNumber, int numberOfSeats, int numberOfLegs, double price, boolean brandNew,boolean hasChairBack) {
        super (madeIn, serialNumber, numberOfSeats, numberOfLegs, price, brandNew);
        this.hasChairBack=hasChairBack;
    }

    public boolean isHasChairBack() {
        return hasChairBack;
    }

    public void setHasChairBack(boolean hasChairBack) {
        this.hasChairBack = hasChairBack;
    }


    @Override
    public String toString() {
        return ("This chair made in : "+ getMadeIn ()+", is this chair with chairback -" + isHasChairBack ()+". The price is: $"
                + getPrice ()+". It has "+ getNumberOfLegs ()+ " legs. The serial #"+getSerialNumber ()+"."+" Is this Brand new item -"+isBrandNew () );
    }


}
