package mathfactionwithstring;

import java.util.Scanner;

public class MathFactionWithString {

    public static void main(String[] args) {

        System.out.println(Math.abs(-2.50));
        System.out.println((int) Math.rint(Math.random() * 10));
        System.out.println((int) Math.round(Math.random() * 10));
        System.out.println(Math.max(6061, 6056));
        System.out.println(Math.min(6061, 6056));
        System.out.println(Math.round(5.54));
        System.out.println((int) Math.ceil(5.54));
        System.out.println((int) Math.floor(5.54));
        System.out.println((int) Math.log10(10));
        System.out.println((int) Math.pow(5, 3));
        System.out.println((int) Math.sqrt(64));
        System.out.println("He said \"Java is fun\"");
        System.out.println("He said  \bJava is fun");
        System.out.println("He said \tJava is fun\"");
        System.out.println("He said \nJava is fun\"");
        System.out.println("He said \fJava is fun\"");
        System.out.println("He said \rJava is fun\"");
        System.out.println("He said \\Java is fun\"");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your charectar");
        
        char ch =(char) (input.next().charAt(0));
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric character");
        }
    }

}
