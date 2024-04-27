
package guessgamewithdowhileloop;

import java.util.Scanner;


public class GuessGameWithDoWhileLoop {

    
    public static void main(String[] args) {
      
        
        Scanner input = new Scanner(System.in);
        
        int number = (int) (Math.random()*100);
        
        int attemp =0;
        int maxAttemp=3;
        
        
        do{
            System.out.println("Enter a num");
        int guessn =input.nextInt();
            
        if(number == guessn){
        
            System.out.println("U guess the right number");
        }
        else if (number>guessn){
        
            System.out.println("U guess the small number");
        }
        else if(number<guessn){
            System.out.println("U guess big number");
        }
        
        attemp++;
        }
        
        while(attemp<maxAttemp);
        
         if(attemp ==maxAttemp){
             System.out.println("U lose the game right num is: "+number);
        }
    }
    
}
