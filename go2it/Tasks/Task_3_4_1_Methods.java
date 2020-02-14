package com.go2it.Tasks;
//Create a method that will sum two arguments passed in and will return the result

public class Task_3_4_1_Methods {


   // int arg1 = 1;
    //int arg2 = 99;

    public static int sumOfArguments (int arg1,int arg2) {
       int sumAnswer = arg1 + arg2;
        return sumAnswer;
    }

    public static void main(String[] args) {
        Task_3_4_1_Methods sumMethod = new Task_3_4_1_Methods ();
        System.out.println(sumMethod.sumOfArguments(2,99));


    }

}

