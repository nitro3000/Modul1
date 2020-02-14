package com.go2it.homework2;

public class dataTypes {
    public static void main(String[] args) {
        String slovo1 = "slovo1 ,";
        System.out.print(slovo1);
        String slovo2 = "slovo2 ,";
        System.out.println(slovo2);
        byte small = 8;
        System.out.println(small);
        short medium = 1000;
        System.out.println(medium);
        short medium2 = 2000;
        System.out.println(medium2);
        int big = 1000000;
        System.out.println(big);
        long huge = 999000000l;
        System.out.println(huge);
        float desyatki = 32.50f;
        System.out.println(desyatki);
        double sotki = 33.9999d;
        System.out.println(sotki);
        char znak1 = '\u1000';
        System.out.println(znak1);
        char znak2 = '\u2000';
        System.out.println(znak2);
        boolean da = true;
        System.out.println(0 == 2);
        boolean net = false;
        System.out.println(0 == 1);


        System.out.println(znak1 + medium); // don't get it, Is unicode code has math. value?
        System.out.println(znak2 + medium);
        System.out.println(znak2 + medium2);

        System.out.println(small * medium);

        System.out.println(big + sotki);

        System.out.println(desyatki / small);

        System.out.println(slovo1 + sotki);
        System.out.println("slovo1 " + "sotki");

        System.out.println(sotki + slovo1);
        System.out.println("sotki " + "slovo1");

        System.out.println("slovo1 " + "da");

        System.out.println(small + 5 + "slovo1" + big);

        String s = 50 + 30 + "slovo" + 40 + 40;  //
        System.out.println(s);

        String x = 5 + 5 + "4" + 5 + 5;
        System.out.println(x);
        System.out.println((char)(222));



    }
}