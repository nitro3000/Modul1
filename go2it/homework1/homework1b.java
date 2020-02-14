package com.go2it.homework1;

public class homework1b {   // Pass four digits to the command line, calculate their sum and  show on the screen the result.

    public static void main (String[]args){
        System.out.println("The sum is - " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1]))); //Integer.parseInt convert string to int
        System.out.println("The sum is - " + args[0] + args[1]); // simple put all arguments together

    }

}
