
package findfactorial;

import java.util.Scanner;


public class FindFactorial {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int number =scanner.nextInt();
        int factorial =1;
        
        for( int i=1; i<=number; i++){
        factorial= factorial*i;
        
        }
        System.out.println(factorial);
    }
    
}
