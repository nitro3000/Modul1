package com.go2it.Tasks;
//Create an array of 100 only even int;
// show all values;
// show only values that can be divided by 3 with no remainder

public class PDF_Task_3_Loops_1 {

    public static void main(String[] args) {
 //********Create an array of 100 only even int and show all values****************

//        int[] anArray1= new int[100];
//        System.out.println("anArray is: " + anArray1.length);
//
//        for (int i=1;i<anArray1.length;i++) {   // i - is only index
//                                                // anArray1[i] - item @ index i
//            anArray1[i]=i*2;
//            System.out.println(anArray1[i]);i
// *********show only values that can be divided by 3 with no remainder*******
        int[] anArray1 = new int[20];{

        for (int i=0;i<anArray1.length;i=i+2) {  //loop for this array
             anArray1[i] =i+1 ;                  // give values i+1 for each i+2 index
            System.out.println(anArray1[i] + " is a         value @ index number : " + i);
            System.out.println(anArray1[1]+ " is a default value @ index number: "+(i+1) );
            }
        } System.out.println("The Length of anArray1 is: " + anArray1.length);



    }
}
