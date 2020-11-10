package javaclass15;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {

        /*
           1. Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */
        String sentence = "This is too easy!";
        System.out.println(sentence);

        String newString=sentence.replaceAll(" ", "");
        System.out.println(newString);

        System.out.println(sentence);

        /*
            2. Create a String that should be combination of letters, numbers and special characters.
        Find out how many alpha characters are there in the String
         */
        String a1 = "a 1 b 2 c 3 d & * ! @";
        System.out.println(a1);

        System.out.println(a1.replaceAll("[^0-9]", ""));

        System.out.println(a1.replaceAll("[^0-9]", "").length());

        /*
             3. You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?
                " How would you find out how many sentences are in that String
         */

        String sen = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(sen);
        System.out.println(sen.replaceAll("[\\sA-Za-z0-9]", ""));
        System.out.println(sen.replaceAll("[\\sA-Za-z0-9]", "").length());

    }

}

