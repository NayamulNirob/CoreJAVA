package testwhileloop;

import java.util.Scanner;

public class TestWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number =  (int) (Math.random()*100);
        System.out.println("Enter a number for guess game");
        

        int attemp = 0;
        int maxAttemp = 3;

        while (attemp < maxAttemp) {
            
            int guess = input.nextInt();

            if (number == guess) {
                
                System.out.println("You guess the correct number");
                
            }
            else if(number>guess){
                System.out.println("You Guess the small number ");
            }
            else if(number<guess){
                System.out.println("You guess the big number");
            }

            attemp++;
        }
        
            if(attemp==maxAttemp)
                    {
                System.out.println("\nyou lose the game The correct number was: "+number);
            }

    }

}
