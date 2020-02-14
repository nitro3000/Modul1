package com.go2it.homework2;

public class conditionalSwitchOperator {
    public static void main(String[] args) {

        String letter = "b";
        switch (letter) {

            case "a": {
                System.out.println("The letter A " + " is on position 1");
                break;
            }
            case "b": {
                System.out.println("The letter B " + " is on position 2");
                break;
            }
            case "c": {
                System.out.println("The letter C " + " is on position 3");
                break;
            }
            case "d": {
                System.out.println("The letter D " + " is on position 4");
                break;
            }
            case "x": {
                System.out.println("The letter X " + " is on position 24");
                break;
            }
            case "y": {
                System.out.println("The letter Y " + " is on position 25");
                break;
            }
            case "z": {
                System.out.println("The letter Z " + " is on position 26");
                break;
            }
            default: {
                System.out.println(" The letter is somewhere in the middle of alphabet");
            }
        }
    }
}
