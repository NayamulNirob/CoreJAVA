
import java.util.Scanner;

public class SwipWithoutVariable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        scanner.close();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b; // Step 1: a now holds the sum of both numbers
        b = a - b; // Step 2: b now holds the original value of a
        a = a - b; // Step 3: a now holds the original value of b
        System.out.println("After swapping: a = " + a + ", b = " + b);
    
    }

}