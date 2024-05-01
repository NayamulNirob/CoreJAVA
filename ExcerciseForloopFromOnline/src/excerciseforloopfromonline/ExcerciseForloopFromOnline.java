package excerciseforloopfromonline;

import java.util.Scanner;

public class ExcerciseForloopFromOnline {

    public static void main(String[] args) {
        
        
    
        

//     Question 1
//     Write a program to print numbers from 1 to 10.
        int a = 0;
        for ( a = 1; a <= 10; a++) {

            System.out.println(a + "\n");
        }

//  Question 2
//  Write a program to calculate the sum of first 10 natural number.

        int sum = 0;
        for (int b = 1; b <= 10; b++) {
            sum += b;
            System.out.println(sum);
        }
        
        
        
//  Question 3:
//  Write a program that prompts the user to input a positive integer. 
//  It should then print the multiplication table of that number. 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int  userInput = input.nextInt();
        
        for(int c=1; c<=10; c++){
        
        int table=userInput*c; 
            
            System.out.println(userInput+"X"+c+"="+table);
        }
        
//    Question 4:
//    Write a program to find the factorial value of any number 
//    entered through the keyboard.     

      System.out.println("Enter a number for factorial");
        
      int facValue = input.nextInt();
        
      int factorial =1;
      
      for(int d=facValue; d>1; d--){
      
      factorial*=d;
      
          
      }
    System.out.println(factorial);
    
    
    
    System.out.println("Enter a number for factorial");
        
      int facValue1 = input.nextInt();
        
      int factorial1 =1;
      
      for(int d=1; d<=facValue1; d++){
      
      factorial1*=d;
      
          
      }
    System.out.println(factorial);

    
    
    }

}
