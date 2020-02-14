package com.go2it.classes;

//**************** parameters of the  all dogs*************************
//*** Properties of the all dogs*******

public class Dog {
    private String _name;
    private double _age;
    private String _type;
    private String _color;


    //*** Methods of the all dogs*******
    private String _bark;


    //*****************************constructor for properties***********************************
    public Dog(){

    }

    public Dog(String name, double age, String type, String color) {
        this._name = name;
        _age = age;
        _type = type;
        _color = color;

    }

    // *******************getters and setters************************

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public double getAge() {
        return _age;
    }

    public String getType() {
        return _type;
    }

    public String getColor() {
        return _color;
    }

    public double getHumanYears() {
        return getAge ( ) * 7;
    }




//@Override
//    public String toString() {
//        return "The " + getColor ( ) + " " + getType ( ) + " " + getName ( ) + " is : " + getAge ( ) + " years old." +
//                " It is equivalent to: " + getHumanYears ( ) + " Humans years.";
//    }

    public String toString() {
        return "The " + getColor ( ) + " " + getType ( ) + " " + getName ( ) + " is : " + getAge ( ) + " years old." +
                " It is like: " + getHumanYears ( ) + " Humans years.";
    }
    //*************************Methods*************************************


//    public void bark(String barkVolume) {
//        boolean danger = true;
//        switch (angerLevel.valueOf(barkVolume)){
//            case none:
//                break;
//            case minimal:
//                System.out.println ("Bark" );
//            case medium:
//                System.out.println ("Bark-rrr-Bark" );
//            case heavy:
//                System.out.println ("BARK-BARK-BARK!!!");
//                break;
//
//        }
  //  }







}
