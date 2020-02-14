package com.go2it.homework2;

import javax.swing.*;

public class precedenceConditional {
    public static void main(String[] args) {
        // int var = (12 > 9) ? 0 : 1;
        // System.out.println(var);

        if (12 > 9) {
            System.out.println(0);
        } else  {
            System.out.println(1);
        }
        int x =5,y=19;
        int awk = y-x>x-y?y-x:x-y;
        System.out.println(awk);

        int a=5,b=10,c=15;
        int choice = a>b&&a>c?a:(b>c?b:c);
        System.out.println(choice);

        double sum = 10.0, price = 100;   //   ??????
        sum+=price>=100 ? price*1.1 : price ;
        System.out.println(sum);

        double j=10;
        j+=5;
        System.out.println(j);



    }


}

