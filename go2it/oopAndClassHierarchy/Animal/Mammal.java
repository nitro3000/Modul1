package com.go2it.oopAndClassHierarchy.Animal;

public class Mammal extends Animal {
    //############################## PROPERTIES #########################################
    private int speed;
    //############################## CONSTRUCTORS #########################################
    public Mammal(String type, int numberOfEyes, int numberOfPods, int numberOfTeeth, int speed, boolean sex){
        super(type,numberOfEyes,numberOfPods,numberOfTeeth,sex);

        this.speed=speed;
    }

//    public Mammal() {
//
//    }

    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}


    @Override
    public String toString() {
        return ("The name of this class is: " + getType ()+ ". This class divided to 3 subclasses Wild, Pet and Livestock. This species has "+getNumberOfPods ()+
                " pods  and "+getNumberOfTeeth ()+" teeth. It can reach speed up to "+getSpeed ()+ " km/h." );
    }



}

