
package guessnumberwithdowhile;

import java.util.Scanner;


public class GuessNumberWithDoWhile {


    public static void main(String[] args) {
        
        Scanner input = new  Scanner(System.in);
        
        int number = (int) Math.random()*100;
        
     
        
        int attempt =0;
        int maxattempt =4;
        
        
        do{ System.out.println("Enter your number");
            int guess = input.nextInt();

            if (number == guess) {
                System.out.println("You guess the Write number");
                break;
            } else if (number < guess) {

                System.out.println("Your Guess is Biger then the number");
            } else if (number > guess) {
                System.out.println("Your Guess is less then the number");
            }
            attempt++;
        }
        while(attempt < maxattempt);
        
        if (attempt == maxattempt) {
            System.out.println(" Sorry the Write number was " + number);
        }
    }
    
}
