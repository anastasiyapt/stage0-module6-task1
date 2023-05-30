package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getColor(){
        return color;
    }

    public int getNumberOfPaws(){
        return numberOfPaws;
    }

    public boolean getHasFur(){
        return hasFur;
    }

    public Animal(String color, int numberOfPaws,boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    /*Add a methods getDescription(),
    witch would use class fields and return a string with such pattern
    "This animal is mostly (color). It has (numberOfPaws) paws
     and ('a'/'no' -> depends on value of hasFur) fur."
     */
     public String getDescription() {
        if (hasFur == false) {
             return "This animal is mostly " + color + ". " + "It has " + numberOfPaws + " paws and no fur.";
        } else {
            return "This animal is mostly " + color + ". " + "It has " + numberOfPaws + " paws and a fur.";
        }

    }



   /* public static void main(String[] args){
         Animal animal1 = new Animal("red", 2, true);
        animal1.getDescription();

    }

    */

}
