  
package addtennumberinarray;

import java.util.Scanner;

public class AddTenNumberInArray {

 
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length-1; i++) {
            System.out.print(i+" Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Numbers added to array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
    
}
