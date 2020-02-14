package com.go2it.lection8Collections;

import java.util.ArrayList;
import java.util.List;

public class ClassMainForAandB {

    public static void main(String[] args) {
        ClassA myA = new ClassA ();
        ClassB myB =new ClassB ();

        myA.populateRank ();
        myA.populateSuit ();
        myB.populateTable2 ();
        myA.moveSuitToRank ();
        myA.represent ();
        myA.rank.size ();


    }
}
