package Javaclass28;

public class ChildClassTester {


    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
        childClass.printInfo();


        //MyInterface.name="something"; fields cannot be reassigned as they are always find
        MyInterface myInterface=new ChildClass();
        myInterface.printInfo();
    }
}
