package com.go2it.oopAndClassHierarchy.Birds;

public class BirdsDriverTes1 {

    public static void main(String[] args) {

        Birds pigeon = new Birds (2, " yellow","pigeon");
        Birds eagle = new StreetBirds (5, " white",1, "eagle");




        System.out.println (pigeon.poop () );
        System.out.println (eagle.sleep ());


    }





}
