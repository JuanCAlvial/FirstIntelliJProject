package com.syntax.Javaclass32;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> removeDuplicate = new LinkedHashSet<>(aList);


        aList=new ArrayList<>(removeDuplicate);

        System.out.println(aList);
    }
}

