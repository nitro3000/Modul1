package com.go2it.homework2;

import java.util.Arrays;

public class arrays2 {
    public static void main (String[]args){

        int[]allArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        int[]evenArray = new int[8];               // how it is passable in only 8 indexes length array copy array of 11 indexes?
        int[]oddArray = new int [8];
        int[]XArray = {2,4,6,8,10,12,14,16,18,20,22};
        int[]YArray = {3,5,7,9,11,13,15,17,19,21};

        int n = 8;
        evenArray = Arrays.copyOf(XArray,11);   // how to copy not all length? // can i copy an infinity array to in small array?
        oddArray = Arrays.copyOf(YArray,YArray.length);
        System.out.println("A value of an index #10 is: " + evenArray[10]);
        System.out.println("A length of an array is: " + evenArray.length);
        System.out.println("this is even values of allArray: " + allArray[2*n+1]);
        System.out.println("this is odd values of allArray: " + allArray[2*n]);


    }
}
