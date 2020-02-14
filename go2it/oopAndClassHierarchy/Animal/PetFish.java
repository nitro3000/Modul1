package com.go2it.oopAndClassHierarchy.Animal;

public class PetFish extends Fish {
    private String color;
    private int price;

    public PetFish(String type, String color,int howDeepUnderwater,int price, int numberOfEyes, int numberOfPods, int numberOfTeeth, boolean sex) {
        super (type, howDeepUnderwater, numberOfEyes, numberOfPods, numberOfTeeth, sex);
        this.color=color;
        this.price=price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  ( "The name of this subclass of Fish is: " + getType ()+ ". This species can cost up to  $"+getPrice ()+
                " USD  and it can reach deep up to "+getHowDeepUnderwater ()+ " m.");
    }
    //########################  only for PetFish method "poop"######################################
    public String poop(){return ("The $"+getPrice () +" "+ getType () + "  pooping  " +getColor () +" color poop");
    }

}
