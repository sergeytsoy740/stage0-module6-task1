package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly " + this.getColor() + ". It has " + this.getNumberOfPaws() +
                " " + (this.getNumberOfPaws() == 1 ? "paw" : "paws") + " and " + (this.isHasFur() ? "a" : "no") + " fur. " +
                "Moreover, it has 2 wings and can fly.";
    }
}
