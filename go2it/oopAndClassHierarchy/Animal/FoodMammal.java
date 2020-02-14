package com.go2it.oopAndClassHierarchy.Animal;

public class FoodMammal extends Mammal {

    private int weight;
    public FoodMammal(String type,int numberOfEyes, int numberOfPods, int numberOfTeeth, int speed, int weight, boolean sex){
        super(type, numberOfEyes, numberOfPods, numberOfTeeth, speed, sex);
        this.weight=weight;
    }

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}

    @Override
    public String toString() {
        return ("The name of this subclass of Mammal is: " + getType ()+ ".  This species can weight up to  "+ getWeight ()+ " KG and usually has up to "+getNumberOfTeeth ()+" teeth. It can reach speed up to "+getSpeed ()+ " km/h." );
    }
}
