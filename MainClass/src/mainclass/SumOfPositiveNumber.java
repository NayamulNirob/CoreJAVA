
package mainclass;

import java.util.Scanner;

public class SumOfPositiveNumber extends MainClass{

    public SumOfPositiveNumber() {
    }
    
    public void positive(){
     Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Enter a sequence of integers (negative to stop:");
        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of positive integers: " + sum);
        scanner.close();
    
    }
    
}
