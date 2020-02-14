package com.go2it.classes;

public class DogTest1 {

    public static void main(String[] args) {
        Dog dog = new Dog ("Figaro", 30, "streetdog", "Black");
        Dog dog2 = new Dog ("Artemon", 3, "Pudel", "White");
        Dog dog3 = new Dog ("Spike", 5.5, "Buldog", "Black&White");

        System.out.println (dog2);
        dog2.setName ("basckervill") ;
        System.out.println (dog2 );




    }

}
