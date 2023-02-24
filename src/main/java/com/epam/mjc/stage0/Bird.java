package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird(){
        super("blue", 2,false );
    }

    @Override
    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        return "This animal is mostly " + color + "." + " It has " + numberOfPaws + " paws and no fur. Moreover, it has 2 wings and can fly";
    }
}
