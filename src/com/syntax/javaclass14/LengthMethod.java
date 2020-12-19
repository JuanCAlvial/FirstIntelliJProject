package com.syntax.javaclass14;

public class LengthMethod {
    public static void main(String[] args) {
        String name="Qasim";
        System.out.println(name.length());
        name="";
        System.out.println(name.length());
        name="Ahmed Qasim";
        System.out.println(name.length());
        name="   Qasim     ";
        System.out.println(name.length());

        if(name.length()>10){
            System.out.println("You are great");
        }
    }
}
