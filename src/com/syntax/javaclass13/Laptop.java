package com.syntax.javaclass13;

public class Laptop {

    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies(){
        System.out.println("Playing Movies");
    }
    void browserInternet(){
        System.out.println("browsing the Internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }
    public String getModel(){
        return model;
    }
    int upgradeRam(int newRAMunit){
        return newRAMunit*RAMCapacity;
    }


}
