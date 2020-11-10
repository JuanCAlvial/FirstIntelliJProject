package javaclass15;

public class SubString {
    public static void main(String[] args) {
        String name="Can u write the second m too";
        System.out.println(name.substring(5));//code will ignore everything up until including spaces(5)-write the second m too
        System.out.println(name.substring(10));//first 10 characters will be ignored
        System.out.println(name.substring(0));//will have no effect and will print everything
        System.out.println(name.substring(5,10));//will start after 5 and then stop after 10-writ
        System.out.println(name.substring(6,11)+name.substring(16,22));

    }
}
