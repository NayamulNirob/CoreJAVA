package gussnumberwhileloop;

import java.util.Scanner;

public class GussNumberWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        
        int attempCount =0;
        int maxAttemp =3;

        while (attempCount<maxAttemp) {

            System.out.println("Enter your number");
            int guess = input.nextInt();

            if (number == guess) {
                System.out.println("You guess the Write number");
                break;
            } 
            else if (number < guess) {

                System.out.println("Your Guess is Biger then the number");
            } else if (number > guess) {
                System.out.println("Your Guess is less then the number");
            }
         attempCount++;   
        }
        
        if(attempCount == maxAttemp){
            System.out.println("Write number was " +number);
        }
    }

}
