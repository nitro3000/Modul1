package com.go2it.Tasks;

public class Task_3_4_2_Methods {

    static int arg1 =100;
    static int arg2 = 10;

    public static double divisionOfArguments(double arg1,int arg2) {

        return arg1 /arg2;

    }

    public static double divisionOfArgumentsInt(int arg1,int arg2) {
        // double s = arg1/arg2;
        //System.out.println(s);
        return arg1/arg2;

    }

    public static void main(String[]args) {
        int arg1 = 1;
        Task_3_4_2_Methods i =new Task_3_4_2_Methods();
//       System.out.println(i.divisionOfArguments(arg1,arg2));
       System.out.println(i.divisionOfArguments(arg1,arg2));
    }


}
