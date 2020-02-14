package com.go2it.classes;

public class ClassesExample {
    public static void main(String[] args) {

        // creating of object "Boat"  by using  "new" from "ClassesExample" class:
        Boat smallYacht = new Boat();
        smallYacht.setTitle ("Victory");
        smallYacht.setHasSail (true);
        //              Boat smallYacht = new Boat ("Victory");
        //              smallYacht.title = "Victory";              -  do not use it
        System.out.println ("Small yacht = " + smallYacht.getTitle ()+ ", does it have sail - "+smallYacht.isHasSail ());

        Boat cruiseLiner = new Boat();
        smallYacht.setTitle ("Grand Elizabet");
        smallYacht.setHasSail (false);
        System.out.println ("Cruise liner = " + smallYacht.getTitle ()+ ", does it have sail - "+smallYacht.isHasSail ());





    }


}


