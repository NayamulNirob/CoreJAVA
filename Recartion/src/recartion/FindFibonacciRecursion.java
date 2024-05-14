
package recartion;


public class FindFibonacciRecursion {
    
    public static void main(String[] args) {
        
        
        System.out.println(fibonacci(11));  
    }
    public static int fibonacci(int n){
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fibonacci(n-1)+fibonacci(n-2);
        };
    }
}
