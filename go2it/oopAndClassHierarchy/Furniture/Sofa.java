package com.go2it.oopAndClassHierarchy.Furniture;

public class Sofa extends FurnitureStoreItems {

    boolean legRest;

    public Sofa(String madeIn, int serialNumber, int numberOfSeats, int numberOfLegs, double price, boolean brandNew,boolean legRest) {
        super (madeIn, serialNumber, numberOfSeats, numberOfLegs, price, brandNew);
        this.legRest=legRest;

    }

    public boolean isLegRest() {
        return legRest;
    }

    public void setLegRest(boolean legRest) {
        this.legRest = legRest;
    }

    @Override
    public String toString() {
        return ("This sofa made in : "+ getMadeIn ()+", is this sofa with legrest -" + isLegRest ()+". The price is: $"
                + getPrice ()+". It has "+ getNumberOfLegs ()+ " legs and it has "+getNumberOfSeats ()+". The serial #"+getSerialNumber ()+"."+" Is this Brand new item -"+isBrandNew () );
    }

}
