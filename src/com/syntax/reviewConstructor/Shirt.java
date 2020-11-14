package com.syntax.reviewConstructor;

public class Shirt {
    //Properties of a shirt
    public static String color;
    public static char size;

    Shirt(){}

    Shirt(String newColor, char newSize){
        color= newColor;
        size= newSize;
    }

    //what we can do with the shirt...
    public static void putOn(){
        System.out.println("Shirt is on");
    }
    public static void takeOff(){
        System.out.println("Shirt is off");
    }

    public static void setColor(String newColor){
        color = newColor;
    }
    public static void setSize(char newSize){
        size = newSize;
    }


}
