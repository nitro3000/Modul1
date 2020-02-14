package com.go2it.oopAndClassHierarchy.Animal;

public class WildFish extends Fish {
    private int yearsOfLive;

    public WildFish(String type, int howDeepUnderwater,int yearsOfLive, int numberOfEyes, int numberOfPods, int numberOfTeeth, boolean sex) {
        super (type, howDeepUnderwater, numberOfEyes, numberOfPods, numberOfTeeth, sex);
        this.yearsOfLive= yearsOfLive;
    }

    public int getYearsOfLive() {
        return yearsOfLive;
    }

    public void setYearsOfLive(int yearsOfLive) {
        this.yearsOfLive = yearsOfLive;
    }

    @Override
    public String toString() {
        return  ( "The name of this subclass of Fish is: " + getType ()+ ". This species can live up to  "+getYearsOfLive ()+
                " years  and it can reach deep up to "+getHowDeepUnderwater ()+ " m.");
    }
}
