package com.go2it.exceptions;

//  Write method that will get the 99th element from the console args (hope, you will not try to input 99 args ;)

public class Exception99arg {
    public static void main(String[] args) {

        try {
            System.out.println (args[99]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Hurray!!! I catch my first exception");
        }


    }

}
