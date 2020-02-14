package com.go2it.edu;

public class ArraysMultidimensional {
    public static void main (String[]args) {

        String[][] Names = {{"Mr. ", "Mrs. ", "Ms. "}, {"Smith ", "Jones "}};

        System.out.println(Names[0][0] + Names[1][0]);
        System.out.println(Names[0][2] + Names[1][1]);
    }
}
