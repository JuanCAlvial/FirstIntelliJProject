package com.syntax.SuperTelusko;

class A{
    public A(){     //Class A constructor
        System.out.println("in A Parent Class");
    }
    public A(int i){  //Having two constructors in the same class is constructor Overloading
        System.out.println("in A int Parent");
    }
}
class B extends A{
    public B(){    //Class B constructor
        super(5);//every constructor in sub class will have a super by default, even if you did not type it in
                   //passing a parameter in the super will call default B and parameter of A
        System.out.println("In B Sub-class");
    }
    public B(int i){
        super(i); //Super means it will call the constructor of the superclass
                  //will call constructor of parent then call constructor of sub class
        System.out.println("in B int sub");
    }
}

public class SuperDemo {

    public static void main(String[] args) {
        //A obj1 = new A(); //Creating new object of A-- will call constructor of A
        //B obj2 = new B();
                            /*Creating new object of Sub class B--
                            will call default Parent Class of A and constructor of default subclass B
                            */
        B obj3 = new B(5);/* Will call constructor B with parameter AND default of constructor A--
                                When creating object of sub-class by specifying parameter it will call the specified
                                constructor of subclass but will also also call the default constructor of superclass
                             */


    }
}
