package com.go2it.oopAndClassHierarchy.Animal;

public class Fish extends Animal {
    private int howDeepUnderwater;

    public Fish (String type, int howDeepUnderwater,int numberOfEyes, int numberOfPods, int numberOfTeeth, boolean sex){
        super(type, numberOfEyes, numberOfPods, numberOfTeeth, sex);
        this.howDeepUnderwater= howDeepUnderwater;

    }

    public int getHowDeepUnderwater() {
        return howDeepUnderwater;
    }

    public void setHowDeepUnderwater(int howDeepUnderwater) {
        this.howDeepUnderwater = howDeepUnderwater;
    }

    @Override
    public String toString(){
        return ("The name of this class is: " + getType ()+ ". This class divided to 3 subclasses Wild, Pet and Livestock. This species has "+getNumberOfPods ()+
                " pods  and "+getNumberOfTeeth ()+" teeth. It can reach deep up to "+getHowDeepUnderwater ()+ " m.");
    }
    //########################  only for all Fish method "run"######################################
    public String run(){return ("The " +getType () + " running away using all "+ getNumberOfPods ()+" fins to get deep underwater up to "+ getHowDeepUnderwater ()+" m");
    }

}
