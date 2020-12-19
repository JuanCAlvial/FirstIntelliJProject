package com.syntax.javaclass20;

public class ParentChildTester {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printSomething();

        Child child= new Child();
        child.printSomething();
        child.differentPrintMethod();

    }

}
