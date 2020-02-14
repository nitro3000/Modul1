package com.go2it.oopAndClassHierarchy.Animal;

public class PetMammal extends Mammal {

    //############################## PROPERTIES #########################################
    private String homeName;

    //############################## super CONSTRUCTORS #########################################
    public PetMammal(String type, String homeName, int numberOfEyes, int numberOfPods, int numberOfTeeth, int speed, boolean sex) {
        super (type, numberOfEyes, numberOfPods, numberOfTeeth, speed, sex);
        //############################## CONSTRUCTORS #########################################
        this.homeName = homeName;

    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    @Override
    public String toString() {
        return ("The name of this subclass of Mammal is: " + getType ( ) + ".  This species has name : " + getHomeName ( ) +
                "   and " + getNumberOfTeeth ( ) + " teeth. It can reach speed up to " + getSpeed ( ) + " km/h.");
    }


}
