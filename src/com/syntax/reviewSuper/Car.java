package com.syntax.reviewSuper;
//SUB-CLASS
//Class is a "BluePrint" for objects, all it contains are variables and methods
//A Constructor is another method but it setups the other object
class Car extends Vehicle {


        Car(){
            super();//Super must always be above the sout
            System.out.println(super.maxSpeed+" Car Constructor");
        }


}
