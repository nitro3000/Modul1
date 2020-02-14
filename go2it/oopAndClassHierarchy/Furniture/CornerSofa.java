package com.go2it.oopAndClassHierarchy.Furniture;

public class CornerSofa extends Sofa {
    boolean leather;

    public CornerSofa(String madeIn, int serialNumber, int numberOfSeats, int numberOfLegs, double price, boolean brandNew, boolean legRest,boolean leather) {
        super (madeIn, serialNumber, numberOfSeats, numberOfLegs, price, brandNew, legRest);
        this.leather=leather;
    }

    public boolean isLeather() {
        return leather;
    }

    public void setLeather(boolean leather) {
        this.leather = leather;
    }

    @Override
    public String toString() {
        return ("This Corner sofa made in : "+ getMadeIn ()+", is this sofa with legrest -" + isLegRest ()+". The price is: $"
                + getPrice ()+". It has "+ getNumberOfLegs ()+ " legs. The serial #"+getSerialNumber ()+"."+" Is this Brand new item -"+isBrandNew () );
    }


}
