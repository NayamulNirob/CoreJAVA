
package exerciseforloop;

import java.util.Scanner;

public class ExerciseForLoop {

    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please in a value");
        int factValue = input.nextInt();
        int factorial =1;
        
        
        for (int i =factValue; i>=1; i--){
        
        factorial *=i;
        
        
        
        }
        System.out.println("Factorial "+factorial);
        
        
        
        int facValue = 5;
        int factorieal = 1;
        for(int i=1; i<=facValue; i++){
        factorieal *=i;        //factorial=factValue*i;
        }
         System.out.println("Factorial is: "+factorieal);
        
    }
    
}
