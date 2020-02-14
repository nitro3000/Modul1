package com.go2it.oopAndClassHierarchy.Animal;

public class Animal {
    //############################## PROPERTIES #########################################
    private String type;
    private int numberOfEyes;
    private  int numberOfPods;
    private int numberOfTeeth;
    private boolean sex;


    //############################## CONSTRUCTORS #########################################
    public Animal (String type, int numberOfEyes, int numberOfPods, int numberOfTeeth, boolean sex){
        this.type = type;
        this.numberOfEyes= numberOfEyes;
        this.numberOfPods= numberOfPods;
        this.numberOfTeeth=numberOfTeeth;
        this.sex=sex;
    }
    public Animal(){
    }

    //public Animal(String name, int numberOfEyes, int numberOfPods, int numberOfTeeth, boolean sex) {
   // }

    public String getType(){return type;}
    public void setType(String type) {this.type = type;}

    public int getNumberOfEyes() {return numberOfEyes;}
    public void setNumberOfEyes(int numberOfEyes) {this.numberOfEyes = numberOfEyes;}

    public int getNumberOfPods() {return numberOfPods;}
    public void setNumberOfPods(int numberOfPods) {this.numberOfPods = numberOfPods;}

    public int getNumberOfTeeth() {return numberOfTeeth;}
    public void setNumberOfTeeth(int numberOfTeeth) {this.numberOfTeeth = numberOfTeeth;}

    public boolean isSex() {return sex;}
    public void setSex(boolean sex) {this.sex = sex;}

    //#################################### METHODS ##########################################


    @Override
    public String toString() {
        return ("The name of this superclass is: " + getType ()+ ". " +
                "This superclass divided to 3 classes: Mammal,Fish and Bird." +
                " This species has "+getNumberOfPods ()+" pods  and in average : "+getNumberOfTeeth ()+" teeth" );
    }
    //######################## common all method "eat"######################################
    public String eat(){return ("The " + getType () + " while hunting using all his " +getNumberOfTeeth () +" teeth to catch the pray");
    }

}
