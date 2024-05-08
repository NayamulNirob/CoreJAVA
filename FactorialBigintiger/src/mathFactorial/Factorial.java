
package mathFactorial;

import java.math.BigInteger;


public class Factorial {
    int number =2;
    public Factorial() {
    }
    
    public Factorial(int number) {
        this.number =number;
    }
    
    
    
    public BigInteger getfactorial(){
        
        BigInteger factorial = new BigInteger("1");
        
        for(int i=1; i<=number;i++ ){
        factorial=factorial.multiply(new BigInteger(i+""));
        
        }
        return factorial;
    
    }
}
