package com.go2it.classes;

import java.util.Scanner;

public class DogTest2 {
    public static void main(String[] args) {
        String name;
        double age;
        String type;
        String color;
        //****************Methods????****************

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Enter the dog's name : ");  // if i put scan int or double before string it doesnt work
        name = scanner.nextLine ( );

        System.out.println ("Enter what type the dog : ");
        type = scanner.nextLine ( );

        System.out.println ("Enter the dog's age : ");
        age = scanner.nextDouble ( );
        //scanner.nextLine ();

        System.out.println ("Enter color of the dog : ");
        color = scanner.nextLine ( );



        scanner.close ( );

        // *****************creating the object dog3 ******************

        Dog dog3 = new Dog (name, age, type, color);

        // *****************creating the another object dog4 ******************

        Dog dog4 = new Dog ("pedro", 3, "husky", "white");

        System.out.println (dog3);
        System.out.println (dog4);


    }


}
