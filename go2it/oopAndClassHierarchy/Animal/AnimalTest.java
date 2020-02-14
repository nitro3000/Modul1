package com.go2it.oopAndClassHierarchy.Animal;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal = new Animal ("Animal",2,4,30,true);

        Mammal mammal = new Mammal ("Mammal",2,4,32,100,true);
        WildMammal wildMammal = new WildMammal ("WildMammal",2,4,33,110, 1, true);
        PetMammal petMammal = new PetMammal ("Pet", "Dog", 2,4 , 42, 35, true);
        FoodMammal foodMammal = new FoodMammal ("Livestock", 2, 4, 22, 12, 400, true);

        Fish fish = new Fish ("Fish",500,2,2,22,true);
        WildFish wildFish =new WildFish ("WildFish", 500, 20, 2, 2, 33, true);
        PetFish petFish =new PetFish ("PetFish", "Blue", 2, 399, 2, 2, 43, true);
        FoodFish livestockFish = new FoodFish ("LivestockFish",5,"Green",2, 3, 22, 3, true);

//        System.out.println (animal.eat () );
//        System.out.println (fish.eat () ); // used method from parent-class for child-class
//        System.out.println (petFish.eat() );//used method from parent-class for child-subclass

// "animal" is a parent-class to "fish". "numberOfTeeth" is parent-class property. the method is in parent-class
        animal.setType ("Shark");
        animal.setNumberOfTeeth (333); //if i change arguments by using setter of parent-class "Animal" it will not affect
        System.out.println (fish.eat ());

        fish.setType ("shark");
        fish.setNumberOfTeeth (333); //if i change arguments by using setter of "Animal" subclass 'Fish'  it will affect
        System.out.println (fish.eat ());

// sout
//The Fish while hunting using all his 22 teeth to catch the pray
//The Fish while hunting using all his 333 teeth to catch the pray
        System.out.println ( );










    }
}
