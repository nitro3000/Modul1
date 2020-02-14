package com.go2it.Tasks;

public class
Task3Dot2Loops {
    public static void main(String[] args) {
        //Create a loop that will show only odd
        // (can be divided by 3 without leftover) elements from the array
        int i;
        int[] array = {1, 2, 33, 4, 24, 6, 23, 8, 9, 10, 11, 12, 27, 144, 9, 16, 122, 18, 81, 20};
        for (i = 0; i<array.length; i++ ) {
            if ((array[i] % 3 == 0) && (array[i] % 2 != 0)) {
                System.out.println (array[i] + " - This is odd value at index #" + i ); // how to return index of i ?
            }

           // System.out.println("This is a length of this array - " + array.length);
            //System.out.println(i + " - This is odd value at index #" + array[i]);
        }
    }

}

//class Task3Dot2Loops2 {
//    public static void main(String[] args) {
//        //Create a loop that will show only odd
//        // (can be divided by 2 without leftover) elements from the array
//        int[] array = {1, 2, 31, 4, 24, 6, 23, 8, 9, 10, 11, 12, 13, 144, 9, 16, 122, 18, 9, 20};
//        System.out.println("This is a length of this array - " + array.length);
//        for (int i : array) {
//            if (i % 2 != 0) {
//                System.out.println(i + " - This is odd value at index #"); // how to return index of i ?
//            }
//        }
//    }
//}