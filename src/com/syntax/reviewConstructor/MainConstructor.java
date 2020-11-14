package com.syntax.reviewConstructor;

public class MainConstructor {

    public static void main(String[] args) {
        //At this point we create the shirt...Shirt matches the classes
        Shirt s=new Shirt("white",'M');


        System.out.println(s.color);
        System.out.println(s.size);
    }
}
