package com.go2it.oopAndClassHierarchy.Furniture;

//Create a class hierarchy for furniture o At least 5 classes on different levels of hierarchy,
// At least 10 properties for all the classes in this hierarchy).
// Override toString() and equals() methods and use them with several instances

public class FurnitureTest {
    public static void main(String[] args) {



Chair  chair_a = new Chair ("USSR",1112, 1, 3, 22.00, false, false);
Chair  chair_b = new Chair ("USA",2356,1,4, 32, true, true);
Table   table_a = new Table ("Poland", 1116, 6, 4, 129, true, "wood");
Sofa     sofa_a = new Sofa ("Slovakia", 1119, 4, 8, 120, true, true);
CornerSofa sofa_b = new CornerSofa ("USA", 22258, 8, 18, 33, true, true, true);

        System.out.println (chair_a );
        System.out.println (chair_b);

//++++++++++++++ METHOD 1 TO CHECK IF PRICES OF ITEMS IS THE EQUAL  ++++++++++++++++++++++++++++++++++++++++++++++
        boolean isEqual = chair_b.getPrice ()== (sofa_b.getPrice ());
        if (isEqual){System.out.println ("Those items have an equal price");
        }else {System.out.println ("Those items are NOT in the same price");}
//++++++++++++++ METHOD 2 TO CHECK IF PRICES OF ITEMS IS THE EQUAL (with setter use)++++++++++++++++++++++++++++++
        sofa_b.setPrice (32);
        boolean isEqual2 = chair_b.getPrice ()== (sofa_b.getPrice ());
        if (isEqual2)
            System.out.println ("Those items have an equal price");
        else {System.out.println ("Those items are NOT in the same price");}
//++++++++++++++ METHOD TO CHECK IF PRICES OF ITEMS IS THE EQUAL ++++++++++++++++++++++++++++++++++++++++++++++
        boolean isEqual3 = chair_b.getMadeIn ().equals (sofa_b.getMadeIn ());
        if (isEqual3)
            System.out.println ("Those items made in same  country .");
        else {System.out.println ("Those items are made in different countries" );}

    }

}
