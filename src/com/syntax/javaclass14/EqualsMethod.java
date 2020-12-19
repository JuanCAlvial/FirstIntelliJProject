package com.syntax.javaclass14;

public class EqualsMethod {
    public static void main(String[] args) {
        String name="Sabeen";
        String name2="Sabeen";
        String name3="Edward";
        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name.equals(name3));

        System.out.println(name==name2);
        System.out.println(name2==name3);
        System.out.println(name==name3);


    }
}
