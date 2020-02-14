package com.go2it.loops;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] strArr = {"Mon","Tue","Wed","Thu","Fri"};
        System.out.println(strArr.length);
        for(String i:strArr) {
            if (i.equals("Wed")) {
                System.out.println("This is Wednesday");
                //break;
                //continue;

            }
            System.out.println(i);



        }
    }
}

