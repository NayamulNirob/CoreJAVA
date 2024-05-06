
package Testmath;

import java.math.BigInteger;


public class TestFactorial {
    int number =2;

    public TestFactorial() {
    }
    public TestFactorial(int number) {
        this.number=number;
    }
    
    
    
    public BigInteger getFactorial(){
    
    BigInteger factorial = BigInteger.valueOf(1);
    
    for(int i=1;i<=number;i++){
    factorial = factorial.multiply(new BigInteger(i+""));
    
    }
    return factorial;
    }
}
