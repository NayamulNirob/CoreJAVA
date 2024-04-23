
package maxnumber;

import java.util.Scanner;


public class MaxNumber {

   
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int maxNumber =0;
        
        System.out.println("Please enter First number");
        
        int firstNum = scanner.nextInt();
        
        System.out.println("Please enter Second number");
        
        int secondNum = scanner.nextInt();
        
        System.out.println("Please enter Third number");
        
        int thirdNum = scanner.nextInt();
        
        
        
        if(firstNum>secondNum && firstNum>thirdNum){
            maxNumber = firstNum;
        } 
        else if (secondNum>firstNum && secondNum>thirdNum){
            
            maxNumber =secondNum;
            
        }
        
        else{
            
            maxNumber = thirdNum;
        }
        
        System.out.println("The max number is :"+maxNumber);
    }
    
}
