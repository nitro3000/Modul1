package com.go2it.oopAndClassHierarchy.Birds;

public class Birds {

    private int numberOfWings;
    private String color;
    private String name;


    public Birds(int numberOfWings, String color, String name) {
        this.numberOfWings = numberOfWings;
        this.color = color;
        this.name = name;


    }

    public Birds() {                   //   no args constructor why i need it?

    }

    public int getNumberOfWings() {
        return numberOfWings;
    }
    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
                 //#################################### methods ##########################################

    public String poop() {
        return (getColor ( ) + " " + getName ( ) + " has " + getNumberOfWings ( ) + " wings " + "and it pooping on the people" + getColor ( ) + " colored poop");
    }


    public String sleep (){
        return ( name + " falling down");

    }






}




