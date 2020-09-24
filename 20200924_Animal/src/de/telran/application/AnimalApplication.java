package de.telran.application;

import de.telran.data.Animal;
import de.telran.data.Cat;
import de.telran.data.Dog;
import de.telran.data.Pet;

public class AnimalApplication {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog", "black", "Sharik", "Ivan Demidov");
        System.out.println();
        Animal dog2 = new Dog("Dog", "black", "Bobik", "Konstantin");
        Animal animal = new Animal("Bear", "brown");
        System.out.println();
        dog1.eat();
        dog1.sleep();
        dog1.bark();

        System.out.println();
        dog2.eat();
        System.out.println();
        ((Dog)dog2).bark();

        dog1.displayInfo("black");
        ((Dog) dog2).displayInfo("silver");

        Pet cat = new Cat("Cat", "white", "Bardsik", "Alex");
        Pet dog3 = new Dog("Dog", "Black-white", "Panas", "Julia");
        cat.voice();
        dog3.voice();
        System.out.println(".......");
        Pet.displayVois(cat);
        Pet.displayVois(dog3);


       System.out.println(dog1);
       System.out.println(dog1.toString());
       System.out.println(dog2);
       System.out.println();

       System.out.println(dog1 instanceof Object);
       System.out.println(dog1 instanceof Animal);
       System.out.println(dog1 instanceof Dog);
       System.out.println();
       System.out.println(animal instanceof Animal);
       System.out.println(animal instanceof Object);
       System.out.println(animal instanceof Dog);




    }
}
