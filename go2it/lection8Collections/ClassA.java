package com.go2it.lection8Collections;
//Create a class for Person that can have the collection of family members (husband\wife, children etc).
// Create an instance method that will add new family member (mother-in-law).
// When a new family member X is added to Person A, person X should also have Person A added to her family members.

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassA {



    public static ArrayList <String> suit = new ArrayList<> ( );
    public static ArrayList <String> rank = new ArrayList<> ( );

    public void populateSuit() {
        suit.add ("CLUBS");
        suit.add ("DIAMONDS");
        suit.add ("HEARTS");
        suit.add ("SPADES");
    }

    public void populateRank(){
        rank.add ("6");
        rank.add ("7");
        rank.add ("8");
        rank.add ("9");
        rank.add ("10");
        rank.add ("JACK");
        rank.add ("QUEEN");
        rank.add ("KING");
        rank.add ("ACE");
    }
//+++++++++++++++++++++++++++++++++++++++++++ MOVE elements between separated ArrayList in same Class +++++++++++++++++
    public void moveSuitToRank(){
        for(int i=0; i<=1 ;i++){
        rank.add(suit.remove (i));}
    }

    public void moveRankToSuit(){
        for(int i=0; i<=1 ;i++){
            suit.add(rank.remove (i));}
    }
//+++++++++++++++++++++++++++++++++++++++  MOVE elements between separated ArrayList in NOT same Class  ++++++++++++++++++++++++



    public static void moveABCtoRank() {
        for (int i = 0; i <= 1; i++) {
            ClassA.rank.add (ClassB.table2.remove (i));
        }
    }

    public void moveRanktoABC() {
        for (int i = 0; i <= 1; i++) {
            ClassB.table2.add (ClassA.rank.remove (i));
        }
    }

    public void moveSuittoABC() {
        for (int i = 0; i <= 1; i++) {
            ClassB.table2.add (ClassA.suit.remove (i));
        }
    }

    public void represent(){
        for(int i=0; i<rank.size ();i++)
        System.out.println ("this is rank<> :"+rank.get (i));
        System.out.println ("*************************" );
        for(int i=0; i<suit.size ();i++)
            System.out.println ("this is suit<> :"+suit.get (i));
        System.out.println ("*************************" );
        for(int i=0; i<ClassB.table2.size ();i++)
            System.out.println ("this is ABC<> :"+ClassB.table2.get (i));

    }




}