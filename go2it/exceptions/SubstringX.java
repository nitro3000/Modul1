package com.go2it.exceptions;
// Write method that will:  search for a letter “X” in a word “GoGoJava”
// and make a substring based on the index of “X” till the end of the word

public class SubstringX {
    public static void main(String[] args) {
        String str1 = "GoGoJava";
        int i = str1.indexOf ("X");
        //int j = str1.indexOf ("J");
        try {
            //System.out.println (j);
            //System.out.println (i );
            System.out.println (str1.substring (i));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println ("exception was captured and handled");
        }
        System.out.println ("this line is after try-catch block");
    }

}
