
package breckandcontineuuse;

import java.util.Scanner;


public class BreckAndContineuUse {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        int sum =0;
        
        while(true){
            System.out.println("enter a number");
            int userinput = input.nextInt();                        
            sum +=userinput;
            
              if(sum>=350){
                System.out.println("reach out limite"+sum);
                break;
            }
            
            else if(sum>=200){
            
            }
            else if(sum>=100){
            continue;
            
            }
            
           
            System.out.println("sum is "+sum);
            
          
        }
        
        
    }
    
}
