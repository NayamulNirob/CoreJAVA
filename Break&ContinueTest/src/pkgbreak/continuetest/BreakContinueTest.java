
package pkgbreak.continuetest;

import java.util.Scanner;


public class BreakContinueTest {

   
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int sum =0; 
        
      
        while (true) {
            System.out.println("Enter a value");
          int num = input.nextInt();  
            sum+=num;
//             System.out.println("Sum  is"+sum);
             if(sum>=200){
               
                break;
            }
            
            
            else if(sum>=100){
                
                continue;
               
            }
            
            
           
           
            System.out.println("Sum  is"+sum);
        num++;    
        }
    }
    
}
