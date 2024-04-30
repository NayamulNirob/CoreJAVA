package palindromproject;

import java.util.Scanner;

public class PalindromProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check it's palindrome or not ");
        String original = input.nextLine();
        original = original.replace(" ", "");

        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println("PALINDROME!");
        } else {
            System.out.println("Not a palindrome!");
        }

    }

}
