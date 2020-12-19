package com.syntax.Class29GroupProject;

public abstract class Car {
    /*
         3. Create a Class Car that would have the following fields:
            carPrice and color and method calculateSalePrice() which should be returning a price of the car.
            Create 2 sub classes: Sedan and Truck.
            The Truck class has field as weight and has its own implementation of calculateSalePrice() method
            in which returned price calculated as following:
            if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
            The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
            if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
    double carPrice;
    String color;
    Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;

    }
    abstract void calculateSalePrice();

}
class Sedan extends Car{
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    void calculateSalePrice() {

        if(length>20){
            System.out.println("This "+color +" sedan ($"+carPrice+") is more than 20ft so it has a 5% discount($"+carPrice*.05+")! The new price is $"+ carPrice*.95);
        }else{
            System.out.println("This "+color +" sedan ($"+carPrice+") is less than 20ft so it has a 10% discount($"+carPrice*.1+")! The new price is $"+ carPrice*.90);
        }


    }
}class Truck extends Car {
    double weight;
    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }


    @Override
    void calculateSalePrice() {

        if (weight > 2000) {
            System.out.println("This "+color +" truck ($"+carPrice+") weights more than 200lb therefore it has a 10% discount($"+carPrice*.1+")! The new price is $" + carPrice * .9);
        } else {
            System.out.println("This "+color +" truck ($"+carPrice+") weights less than 200lb therefore it has a 20% discount($"+carPrice*.2+")! The new price is $" + carPrice * .8);


        }
    }
}class Price {


    public static void main(String[] args) {
        Car sedan=new Sedan(25000,"Red",15);
        sedan.calculateSalePrice();
        Car truck=new Truck(45000,"Blue",1900);
        truck.calculateSalePrice();
    }
}
