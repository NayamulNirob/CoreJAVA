
package mainclass;

import java.util.Scanner;


public class CheckPrimeNumber {
    
    public void  primeNumber(){
    
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check its prime or not ");
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
