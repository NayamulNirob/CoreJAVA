package testloopprimenumber;

import java.util.Scanner;

public class TestLoopPrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numer for Check Its Prime or not");
        int number = input.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                count += 1;
            }

        }
        
         if(count==2){
            
                System.out.println("IT is a prime number "+number);
            } 
            else{
                System.out.println("Its not a prime number "+number);
            }

    }

}
