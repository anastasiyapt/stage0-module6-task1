package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

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
    public String getDescription(String color, int numberOfPaws, boolean hasFur){
        String result;
        if(hasFur){
            result = "This animal is mostly " + color + "." + " It has " + numberOfPaws +
                    " paws and a fur.";
        } else{
            result = "This animal is mostly " + color + "." + " It has " + numberOfPaws +
                    " paws and no fur.";
        }return result;

    }


}
