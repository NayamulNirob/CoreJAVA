package testforloopfactorial;

import java.util.Scanner;

public class TestForLoopFactorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for factorial");
        long number = input.nextInt();
        long factorial = 1;

        for (int i = 1; i <= number; i++) {

            factorial *= i;

        }
        System.out.println(factorial);

//        for (long i = number; i > 1; i--) {
//
//            factorial *= i;
//
//        }
//        System.out.println("The factorial is :" + factorial);

    }

}
