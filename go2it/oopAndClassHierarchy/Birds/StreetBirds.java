package com.go2it.oopAndClassHierarchy.Birds;

import com.go2it.oopAndClassHierarchy.Birds.Birds;

public class StreetBirds extends Birds {

    public int numberOfLegs;

//    public StreetBirds(int numberOfWings, String color, String name, int numberOfLegs) {
//        super (numberOfWings, color, name);
//        this.numberOfLegs = numberOfLegs;
//    }


    public StreetBirds(int numberOfWings, String color,int numberOfLegs, String name) {
        super (numberOfWings, color, name);
        this.numberOfLegs = numberOfLegs;


    }



}
