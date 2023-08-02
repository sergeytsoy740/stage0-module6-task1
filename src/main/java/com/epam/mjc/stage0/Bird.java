package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    /*Override getDescription() method for class Bird: add one more sentence to the description.
    The result must be:
    "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly." */

    @Override
    String getDescription() {
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() +
                " " + (getNumberOfPaws() == 1 ? "paw" : "paws") + " and " + (isHasFur() ? "a" : "no") + " fur. " +
                "Moreover, it has 2 wings and can fly.";
    }
}
