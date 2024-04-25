
package oddevenwithswichcase;

import java.util.Scanner;


public class OddEvenWithSwichCase {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your number to check its odd or even");
        
        int number = input.nextInt();
        
         
        switch (number%2) {
            case 0:
                System.out.println("Its a Even number");
                break;
            default:
                System.out.println("Its a odd number");
        }
        
        
    }
    
}
