package com.go2it.oopAndClassHierarchy.Animal;

public class FoodFish extends Fish {
    private int numberOfParasites;
    private String color;

    public FoodFish(String type, int howDeepUnderwater, String color,int numberOfEyes, int numberOfPods, int numberOfTeeth,int numberOfParasites, boolean sex) {
        super (type, howDeepUnderwater, numberOfEyes, numberOfPods, numberOfTeeth, sex);
        this.numberOfParasites = numberOfParasites;
        this.color=color;

    }

    public int getNumberOfParasites() {
        return numberOfParasites;
    }

    public void setNumberOfParasites(int numberOfParasites) {
        this.numberOfParasites = numberOfParasites;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  ( "The name of this subclass of Fish is: " + getType ()+ ". This species can contain up to "+getNumberOfParasites ()+
                " parasites and it can reach deep up to "+getHowDeepUnderwater ()+ " m.");
    }
    //########################  only for FoodFish method "poop"######################################
    public String poop(){return ("The " +" "+ getType () + "  pooping  " +getColor () +" color poop");
    }


}
