package com.syntax.Javaclass29;

public class Employee implements PrintInfo{
    @Override
    public void printName() {
        System.out.println("Ali");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("123546789");
    }

    @Override
    public void printAddress() {
        System.out.println("blah blah blah USA");
    }
}
