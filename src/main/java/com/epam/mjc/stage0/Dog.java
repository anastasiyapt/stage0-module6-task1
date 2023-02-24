package com.epam.mjc.stage0;

public class Dog extends Animal{
    public Dog(){
        super("brown", 4, true);
    }

    @Override
    public void getDescription(String color, int numberOfPaws, boolean hasFur) {
        System.out.println( "This animal is mostly " + color + "." + " It has " + numberOfPaws + " paws and no fur. Moreover, it has no wings and cannot fly.");
    }

    public static void main(String args[]){
        Dog aDog = new Dog();
        aDog.getDescription("brown", 5, false);
    }
}
