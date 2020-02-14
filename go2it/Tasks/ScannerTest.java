package com.go2it.Tasks;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        System.out.println ("Enter text here: ");
        Scanner sc1 = new Scanner (System.in);  // invoke scanner and name it.

        String consoleInputString = sc1.nextLine ( ); // declaration of string + // read the string from console
        // String consoleInputString;
        //consoleInputString = sc1.nextLine ( );
        //while (consoleInputString.indexOf ("quit") == -1){  // indexOf will return -1 if is no "quit" in string
        while (!consoleInputString.equalsIgnoreCase ("quit")){

            System.out.println ("Your input was: " + consoleInputString);
            consoleInputString = sc1.nextLine ( );

        }

    }
}