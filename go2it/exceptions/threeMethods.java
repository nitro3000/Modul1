package com.go2it.exceptions;

import com.go2it.classes.Dog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Create three methods: that will throw checked and unchecked exceptions.
// for each method handle a thrown exception and use different approach to show the exception details
public class threeMethods {


    public static int division(int i, int j) {
        return i / j;
    }

    //************** Runtime unchecked exception*******************************
    public static void main(String[] args) throws ArithmeticException {
        try {
            division (5, 0);
        } catch (ArithmeticException e) {
            System.out.println ("illegal operation : 'division by zero'");
        }
//************** IO checked exception*******************************
        try (Scanner file = new Scanner (new File ("fileName"))) {

        } catch (FileNotFoundException e) {
            System.out.println ("Logging, etc");
        }
//************** unchecked exception*******************************
       //try{
        Dog dog5 = new Dog ();
        dog5.setName ("bob");

       //}catch (Exception e){
           System.out.println ("fignya kakaeto vihodit" );

       //}

    }
}
