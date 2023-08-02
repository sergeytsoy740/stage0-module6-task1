package com.epam.mjc.stage0;

public class Animal {

    public static void main(String[] args) {
        //Animal a = new Animal("green", 1, false);
        //System.out.println(a.getDescription());

        /*(Optional) Create an object of each class and call getDescription() method for both of them.
        Try to explain the output results.*/
        Dog dog = new Dog();
        System.out.println(dog.getDescription());

        Animal bird = new Bird();
        System.out.println(bird.getDescription());

    }

    //Provide it with 3 private fields - color(String), numberOfPaws(int), hasFur(boolean).
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    //Add constructor with full parameters. Save the parameter order and names as it is listed in a second paragraph.
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    //Add a methods getDescription(),
    //which would use class fields and return a string with such pattern "This animal is mostly (color).
    //It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."

    /*(Optional) In the method getDescription() change the word 'paw' depending on the numberOfPaws:
    number of paws is 1 -> 'paw', number of paws is different from 1 -> 'paws'.*/
    String getDescription() {
        String fur = isHasFur() ? "a" : "no";
        String paws = getNumberOfPaws() == 1 ? "paw" : "paws";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() +
                " " + paws + " and " + fur + " fur.";
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
