package com.syntax.ReviewStringBufferBuilder;

public class stringBuilder {
    //Strings are immutable--> They cant be changed after creating.
    //StringBuilder are mutable--> can be modified after creation.
    //StringBuilders are useful when you have a part of a program that changes String a lot
    // such as "concatenating" strings inside loop.

    public static void main(String[] args) {
        // non-synchronized(not thread safe)
        StringBuilder sb = new StringBuilder();
        long startTime=System.currentTimeMillis();

        //code
        for(int i=0; i<1000000; i++){
            sb.append("hello");
        }

        long endTime=System.currentTimeMillis();
        long duration= endTime-startTime;
        System.out.println(duration);



        //synchronized (thread safe)
        StringBuffer sbuff= new StringBuffer();
        long startTime2=System.currentTimeMillis();

        //code
        for(int j=0; j<1000000; j++){
            sbuff.append("hello");

        }
        long endTime2=System.currentTimeMillis();
        System.out.println(endTime2-startTime2);



    }

}
