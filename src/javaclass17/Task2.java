package javaclass17;

public class Task2 {
    /*Write a method to return whether given number
    is prime or not?
     */

    boolean isPrime(int number){

        if(number<=1){
            return  false;
        }
        boolean isPrime=true;
        for(int i=2; i<number/2; i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }

        return isPrime;
    }
}
