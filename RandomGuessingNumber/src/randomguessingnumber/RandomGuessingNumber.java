package randomguessingnumber;

import java.util.Scanner;

public class RandomGuessingNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 100);

        int attemp = 0;
        int maxAttemp = 5;

        while (attemp < maxAttemp) {

            System.out.println("Enter a number for the game");
            int guess = input.nextInt();

            if (number == guess) {

                System.out.println("U guess the correct");
                break;
            } else if (number > guess) {

                System.out.println("The expectted number is beigger then ur guess");
            } else if (number < guess) {

                System.out.println("The expectted number is smaller then ur guess");
            }

            attemp++;
        }
        if (attemp == maxAttemp) {

            System.out.println("\n U lose the game better luck next time" + "\n" + "The number is:" + number);
        }

    }

}
