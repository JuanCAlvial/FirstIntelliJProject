package com.syntax.javaclass21;

public class Parent extends GrandParents {
    Parent(){
        System.out.println("Constructor from Parent");

    }

    Parent(int money){
        super(money);
    }

}