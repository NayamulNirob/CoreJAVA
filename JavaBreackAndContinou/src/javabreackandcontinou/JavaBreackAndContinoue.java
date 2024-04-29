
package javabreackandcontinou;

import java.util.Scanner;


public class JavaBreackAndContinoue {

  
    public static void main(String[] args) {
        
        
            Scanner input = new Scanner(System.in);
            
            System.out.println("Start point value");
            int startValue = input.nextInt();
            
               System.out.println("Start end value");
            int endValue = input.nextInt();
        
        while (startValue<=endValue) {

        if(startValue%3==0 && startValue%5==0){
        
            startValue++;
            continue;
        }
            System.out.println("number "+startValue);
            startValue++;
        }
      
    }
    
}
