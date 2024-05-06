
package Testmath;
import java.math.*;
public class Hijibiji {    


public class LargeFactorial {
    public static void main(String[] args) {
        BigInteger factorial = factorial(5);
        System.out.println("50! is \n" + factorial);

        if (factorial.isProbablePrime(1)) {
            System.out.println("50! is a prime number.");
        } else {
            System.out.println("50! is not a prime number.");
        }
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
    
}
