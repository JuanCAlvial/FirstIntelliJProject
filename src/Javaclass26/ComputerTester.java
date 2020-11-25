package Javaclass26;

import Javaclass26.Computer;

public class ComputerTester {

    public static void main(String[] args) {
        Computer[] allComputersInSingleVar={new Apple("Apple"), new Lenovo("Lenovo"),new HP("Brand")};
        for(Computer computer:allComputersInSingleVar){
            computer.run();
            computer.storage();
            computer.transfer();
        }

        Lenovo lenovo=new Lenovo("Lenovo");
        lenovo.tabletMode();
    }

}
