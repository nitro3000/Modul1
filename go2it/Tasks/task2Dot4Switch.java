package com.go2it.Tasks;

public class task2Dot4Switch {
    public static void main(String[] args) {

        //String username = "Alex";        // program arguments?
        String username = args[0];
        String Password = args[1];
        String Administrator = args[2];

        switch (username) {

            case "Alex": {
                System.out.println("Welcome, "+ args[0]);
            //break;

            }
            case "qwertY1": {
                System.out.println("your password is correct");

            }
            case "Administrator": {
                System.out.println("your group is: " +  "Administrator" + " and you have " + "all permissions !");

            }
            default:{System.out.println("Incorrect Password or username ");
            }






        }

    }
}