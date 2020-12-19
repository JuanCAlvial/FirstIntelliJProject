package com.syntax.Javaclass31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListOfNumbers = new ArrayList<>();
        int d = 50;
        for (int i = 2; i <= d; i += 2) {
            arrayListOfNumbers.add(i);
        }
        System.out.println("Even numbers from 1-50 " + arrayListOfNumbers);
        Iterator<Integer> iter = arrayListOfNumbers.iterator();
        while (iter.hasNext()) {
            int s = iter.next();
            if (s % 5 == 0) {
                iter.remove();
            } else {
                System.out.println(s);
            }

        }
    }
}