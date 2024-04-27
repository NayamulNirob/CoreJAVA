
package primenumberforloop;

import java.util.Scanner;

public class PrimeNumberForLoop {

    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        System.out.println("Please in a value");
        int factValue = input.nextInt();
        
        int count =0;
        
        
        for (int i =1; i<=factValue; i++){
        
         if(factValue%i==0){
         
         count+=1;
         }
        
        
        
        }
        if(count==2){
            System.out.println(factValue+" Is a prime number");
            
        }
        else{
         System.out.println(factValue+" is not a prime number " );
        }
       
        
        
    }
    
}
