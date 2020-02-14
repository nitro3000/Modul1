package com.go2it.classes;
import java.time.LocalDate;
import java.time.Period;
//************************* Properties of the instant class Family  ****************************



public class Person {
    private String name;
    private LocalDate dob;
    private int roomNumber;
    private String favoriteDish;
    private int age;


    public Person(String name, LocalDate dob, int roomNumber, String favoriteDish) {
        this.name = name;
        this.dob = dob;
        this.roomNumber = roomNumber;
        this.favoriteDish = favoriteDish;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getFavoriteDish() {
        return favoriteDish;
    }
    public void setFavoriteDish(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }
//************************************ THE METHODS *********************************************************

    @Override
    public String toString() {
        return "The " + getName () + " is member  of a family that like " + getFavoriteDish ()+ " and live in room # "
                + getRoomNumber () +(" ")+ "this family member is "+ getAge () + " years old";
    }

     //######################## method "eat"######################################
    public String eat(String inMeal){
        if (inMeal.equalsIgnoreCase (getFavoriteDish ())){
            return (name +" is eating favorite "+ inMeal);
        } else{
            return(name+" is eating " + inMeal);
        }
    }
   //########################## method "goAsleep" ###################################################
   public String goAsleep(){
           return (name +" is going to room # "+ getRoomNumber ());
   }
    //########################## method "goAsleep2" ###################################################
    public String goAsleep2(String tired){
        return (name +" is going to room # "+ getRoomNumber ());
    }
    //########################## method "age" ###################################################

    public int  getAge() {
        return (LocalDate.now ().getYear ())-(dob.getYear ());
    }
}



