package com.epam.mjc.stage0;

public class Dog extends Animal{
    public Dog(){
        super("brown", 4, true);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly " + getColor() + "." + " It has " + getNumberOfPaws() + " paws and no fur. Moreover, it has no wings and cannot fly.";
    }


}
