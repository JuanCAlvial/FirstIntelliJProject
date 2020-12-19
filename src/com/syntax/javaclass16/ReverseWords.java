package com.syntax.javaclass16;
import java.util.Arrays;
public class ReverseWords {
    public static void main(String[] args) {
        String sentence="What did u use the most?";
        String[] stringArray=sentence.split("");
        System.out.println(Arrays.toString(stringArray));

        for (int i=0; i<stringArray.length; i++){

            StringBuilder stringBuilder= new StringBuilder(stringArray[i]);
            System.out.println(stringBuilder);
            stringArray[i]=stringBuilder.reverse().toString();
            System.out.println(stringArray[i]);
        }
        System.out.println(Arrays.toString(stringArray));
    }
}
