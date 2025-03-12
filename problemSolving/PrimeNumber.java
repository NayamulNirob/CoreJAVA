
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter a number");

            int num = sc.nextInt();

            if(isPrime(num)){
                System.err.println(num+" Is a Prime number");
            }
            else{
                System.err.println(num+" Is not  a prime number");
            }
        }


        // if (num == 1 && num < 2) {
        //     System.err.println(num + " Is not a prime number");
        // } else if (num == 2) {
        //     System.err.println(num + " IS  A prime number");
        // } else if (num % 2 == 0) {
        //     System.err.println(num + "Is not a prime number");

        // } else {
        //     System.err.println(num + "IS  A prime number");
        // }
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }

        return true;

    }
}
