package com.go2it.exceptions;
import java.io.FileNotFoundException;

public class ExceptionExample {

    public static void main(String[] args) throws CustomException, FileNotFoundException {
        try {
            ClassToThrowException testClass = new ClassToThrowException ("Test title",1);
            testClass.setTitle (null);
            testClass.setNumber (1);

            System.out.println ("It will not be executed");
        } catch (IllegalArgumentException e) {
            System.out.println ("It was IllegalArgumentException or It was FileNotFoundException");

        } finally {
            System.out.println ("This line will be executed ");
        }
        System.out.println ("After try-catch-finally");

    }
}
