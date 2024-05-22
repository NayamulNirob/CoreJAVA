import java.util.Scanner;

public class RangOfPrimeNum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a starting number");
        int start = s.nextInt();
        System.out.println("Enter an ending number");
        int end = s.nextInt();
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}