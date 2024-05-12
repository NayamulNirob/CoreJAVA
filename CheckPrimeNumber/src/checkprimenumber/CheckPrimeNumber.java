
package checkprimenumber;

import java.util.Scanner;


public class CheckPrimeNumber {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int count =0;
        
        for(int i=1; i<=number; i++){
        
        if(number%i==0 ){
        
        count++;
        }
        
        
        }
        if (count==2){
        
            System.out.println("Its a prime number");
        }
        else{
            System.out.println("Its not a prime number");
        }        
        
    }
    
}
