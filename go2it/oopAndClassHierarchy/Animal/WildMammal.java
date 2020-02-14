package com.go2it.oopAndClassHierarchy.Animal;

public class WildMammal extends Mammal {

    //############################## PROPERTIES #########################################
    private int numberOfTails;

    //############################## super CONSTRUCTORS #########################################
    public WildMammal(String type, int numberOfEyes, int numberOfPods, int numberOfTeeth, int speed, int numberOfTails, boolean sex) {
        super (type, numberOfEyes, numberOfPods, numberOfTeeth, speed, sex);
        //############################## CONSTRUCTORS #########################################
        this.numberOfTails = numberOfTails;
    }
//    public WildMammal() {
//        super ( );
//    }

    public int getNumberOfTails() {return numberOfTails;}
    public void setNumberOfTails(int numberOfTails) {this.numberOfTails = numberOfTails;}

    @Override
    public String toString() {
        return ("The name of this subclass of Mammal is:  " + getType ()+ ".  This species has "+getNumberOfTails ()+
                " tail  and "+getNumberOfTeeth ()+" teeth. It can reach speed up to "+getSpeed ()+ " km/h." );
    }

}
