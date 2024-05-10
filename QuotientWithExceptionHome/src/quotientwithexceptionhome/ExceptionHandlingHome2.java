
package quotientwithexceptionhome;

import java.util.Scanner;

public class ExceptionHandlingHome2 {

 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number ");
       int num1= s.nextInt();
        System.out.println("Enter 2nd number");
       int num2= s.nextInt();
        
    QuotientWithExceptionHome exception = new QuotientWithExceptionHome();
    
        System.out.println(exception.quotient(num1, num2));
    
    }
    
}
        