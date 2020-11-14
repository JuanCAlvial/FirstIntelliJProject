package com.syntax.reviewSuper;
//SUPER CLASS
//Create a class...creating a blueprint
/*..this. and super. work exactly the same, except super refers to
the PARENT class but .this refers to class its in.
 */

class Vehicle {
    //everything in here are just variables and methods

    int maxSpeed=120;

    Vehicle(){

        System.out.println("Vehicle Constructor");
    }
    Vehicle(int maxSpeed) {

        System.out.println("Vehicle Constructor with Speed");
        this.maxSpeed= maxSpeed;
    }
}

