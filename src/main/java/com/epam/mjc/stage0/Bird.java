package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird(){
        super("blue", 2,false );
    }

    @Override
    public void getDescription(String color, int numberOfPaws, boolean hasFur) {
        System.out.println( "This animal is mostly " + color + "." + " It has " + numberOfPaws + " paws and no fur. Moreover, it has 2 wings and can fly.");
    }

    public static void main(String args[]){
        Bird smallOne = new Bird();
        smallOne.getDescription("red", 2, false);
    }
}
