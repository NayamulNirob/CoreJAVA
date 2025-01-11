
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        String numbers="123456";

         System.err.println(numbers.replace(numbers,"654321"));


         Scanner sc=new Scanner(System.in);

        System.err.println("Enter a number for Factorial");
         int number=sc.nextInt();

         int factorial=1;

         for(int i=1;i<=number;i++){
            factorial*=i;
         }
         System.err.println(factorial);

 
    }
}