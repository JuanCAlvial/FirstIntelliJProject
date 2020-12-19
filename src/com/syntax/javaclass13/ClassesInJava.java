package com.syntax.javaclass13;

public class ClassesInJava {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.make="Mac";
        laptop.model="pro 16";
        laptop.storage=1;
        laptop.RAMCapacity=16;
        laptop.color="pink";
        laptop.processor="core i7";
        laptop.GPU="Nvidia RTX 3090 12GB DDR6x";
        laptop.playMovies();
        laptop.browserInternet();
        laptop.makeVideoCall("Mike");
        String model = laptop.getModel();
        System.out.println(model);
        System.out.println(laptop.upgradeRam(2));


    }
}
