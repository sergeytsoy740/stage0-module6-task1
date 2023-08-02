package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        /*(Optional) Create an object of each class and call getDescription() method for both of them.
        Try to explain the output results.*/

        Dog dog = new Dog();
        System.out.println(dog.getDescription());

        Bird bird = new Bird();
        System.out.println(bird.getDescription());
    }
}
