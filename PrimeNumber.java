import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check Is prime or not");
            number = sc.nextInt();
        }
        catch(InputMismatchException e){

            System.err.println(e.getMessage()+"\"Invalid input. Please enter an integer.\"");
            return;
        }

        if (isPrime(number)){
            System.err.println(number+" Prime");
        }
        else{
            System.err.println(number+ " Not prime");
        }
    }

    public static boolean isPrime (int num){

        if (num <= 1) {
            return false;
        }

       for(int i=2; i<=num/2; i++){

        if(num%i==0){
            return false;
        }

       }
        return true;
    }
}
