package javaclass16;

public class Task {
    public static void main(String[] args) {
        /*Create a program to reverse the contents of a String
         */

        String str1 = "Anna";//setting value
        String reverse="";//empty string
        for(int i =str1.length()-1;i>=0;i--){// starts loops
            reverse+=str1.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("Is "+str1+" palindrome? "+reverse.equalsIgnoreCase(str1));
        System.out.println("----------------------------------------------------------");
        StringBuilder stringBuilder=new StringBuilder("Anna");
        System.out.println(stringBuilder.reverse());
    }
}
