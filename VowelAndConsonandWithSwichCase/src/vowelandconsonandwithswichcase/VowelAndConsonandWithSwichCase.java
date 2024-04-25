
package vowelandconsonandwithswichcase;

import java.util.Scanner;

public class VowelAndConsonandWithSwichCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Enter a Character : ");
        char ch = input.next().toUpperCase().charAt(0);

        if (ch >= 'A' && ch <= 'Z' ) {
            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':               
                  System.out.println("This is a Vowel");
                    break;

                default:
                    System.out.println("This is a Consonant");
                    break;
            }
        } else {
            System.out.println("This is Not an alphabet");
        }

    }

}


