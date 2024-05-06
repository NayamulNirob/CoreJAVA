
package javabigintiger;
import mathfactorialprime.PrimeNumberInFactorial;
import Testmath.TestFactorial;
import java.math.BigInteger;

public class JavaBigIntiger {

    private static String factorial;

    public JavaBigIntiger() {
    }

    public static void main(String[] args) {
        TestFactorial f  = new TestFactorial(45);
        BigInteger prime = f.getFactorial();
        System.out.println(prime);
        
   
        
}
    
}
