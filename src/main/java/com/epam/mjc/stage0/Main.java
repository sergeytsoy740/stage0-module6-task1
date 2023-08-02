package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        /*(Optional) Create an object of each class and call getDescription() method for both of them.
        Try to explain the output results.*/
        Animal animal = new Animal("red", 1, true);
        System.out.println(animal.getDescription());

        Dog dog = new Dog();
        System.out.println(dog.getDescription());

        Bird bird = new Bird();
        System.out.println(bird.getDescription());
    }
}
