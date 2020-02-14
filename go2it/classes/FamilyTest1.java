package com.go2it.classes;

import java.time.LocalDate;

public class FamilyTest1 {
    public static void main(String[] args) {

        Person father = new Person ("John", LocalDate.of (1980,10,24),1,"beef");
        Person mother = new Person ("Maria",LocalDate.of (1990,4,1) , 2, "cheese");
        Person daughter = new Person ("Jane",LocalDate.of (2000,1,24) , 3, "apple");
        Person dog = new Person ("Barsik",LocalDate.of (2016,5,3) , 4, "kolbasa");

        System.out.println (father );
//        System.out.println (mother );
//        System.out.println (daughter );
//        System.out.println (dog );
//
       System.out.println (father.eat ("kolbasa") );
//        System.out.println (father.eat ("beef") );
//        System.out.println (dog.eat ("kolbasa") );
//
//        System.out.println (dog.goAsleep ( ) );
//        System.out.println (mother.goAsleep ( ) );
//
       // System.out.println (daughter.getAge () );
       // System.out.println (father.getAge ());
   }

}