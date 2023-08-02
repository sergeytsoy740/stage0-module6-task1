package com.epam.mjc.stage0;

public class Bird extends Animal {
    private int wings = 2;
    private boolean isFlying = true;

    public Bird() {
        super("blue", 2, false);
    }

    /*Override getDescription() method for class Bird: add one more sentence to the description.
    The result must be:
    "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly." */

    @Override
    String getDescription() {
        String fur = isHasFur() ? "a" : "no";
        String paws = getNumberOfPaws() == 1 ? "paw" : "paws";
        String isFlying = isFlying() ? "can fly." : "cannot fly.";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() +
                " " + paws + " and " + fur + " fur. Moreover, it has " + getWings() + " wings and " + isFlying;
    }

    public int getWings() {
        return wings;
    }

    public boolean isFlying() {
        return isFlying;
    }
}
