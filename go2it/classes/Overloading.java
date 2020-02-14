package com.go2it.classes;
//different methods  have the same name, but different signatures
public class Overloading {

    public int sum (int x,int y){                // first method
        return (x+y);
    }

    public int sum (int x,int y,int z){          // first OVERLOADED method (signature can differ by the number of input parameters)
        return (x+y+z);
    }

    public int sum (int x,int y,byte z){          // second OVERLOADED method  ( signature can differ by the type of input parameters)
        return (x+y*z);
    }

    public static void main(String[] args) {
        Overloading instantName = new Overloading ();

        System.out.println (instantName.sum (5, 10) );
        System.out.println (instantName.sum (5, 10, 20) );
        System.out.println (instantName.sum (5, 10, 2) );
    }






}
