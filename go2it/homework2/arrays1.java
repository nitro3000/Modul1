package com.go2it.homework2;
public class arrays1 {
    public static void main (String[]args) {
        String[] ArrayOfStrings = {"arg1, ", "arg2, ", "arg3, ", "arg4, ", "arg5, "};
        boolean[] arrayOfBooleans = new boolean[]{(5 > 2), (10 > 5), (8 < 10), (11 < 10), (200 > 100), (5 > 2), (10 > 5), (8 < 10), (11 > 10), (200 > 100)};
        double[] ArrayOfDouble = new double[3]; // how to setup elements manually after initialisation?
        ArrayOfDouble[0]= 1.5;

        System.out.println(ArrayOfStrings.length);
        System.out.println(arrayOfBooleans.length);
        System.out.println(ArrayOfDouble.length);

        System.out.println(ArrayOfStrings[1]);
        System.out.println(arrayOfBooleans[0]);
        System.out.println(arrayOfBooleans[3]);
        System.out.println(ArrayOfDouble[0]);
    }
}