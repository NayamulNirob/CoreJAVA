import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = (int) (Math.random() * 100);
        System.out.println("Enter a number");
        
        int attempt = 0;
        int maxAttempt = 4;
        
        do {
            System.out.println("Enter your number");
            int guess = input.nextInt();

            if (number == guess) {
                System.out.println("You guessed the right number");
                break;
            } else if (number < guess) {
                System.out.println("Your guess is bigger than the number");
            } else if (number > guess) {
                System.out.println("Your guess is less than the number");
            }
            attempt++;
        } while (attempt < maxAttempt);
        
        if (attempt == maxAttempt) {
            System.out.println("Sorry, the right number was " + number);
        }
    }
}
