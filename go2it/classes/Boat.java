package com.go2it.classes;

public class Boat {
 // properties:
    private double volume;
    private double speed;
    private boolean hasSail;
    private  boolean hasEngine;
    private int numberOfRoom;
    private String title;
    private String country;


    // make it available from outside of class "Boat"
    public String getTitle(){
        return this.title;
    }
    public  void setTitle(String title) {     //    public  void setTitle(String titleFromOutSide)
       this.title = title;                    //    { title = titleFromOutSide; }
    }
//    public Boat (String title) {             // constructor with parameters
//        this.title = title;
//    }
    public Boat(){                            // constructor without parameters
    }
    public boolean isHasSail() {
        return this.hasSail;
    }

    public void setHasSail(boolean hasSail){
        this.hasSail=hasSail;
    }



}
