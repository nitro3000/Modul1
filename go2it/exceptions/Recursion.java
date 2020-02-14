package com.go2it.exceptions;

public class Recursion {
    public static void main(String[] args) {
        try{
            System.out.println (sum (0 ));

        } catch (StackOverflowError e) {
            System.out.println ( "StackOverflowError");
        }

    }

    private static int sum (int i){
        return sum(i);
    }
}
