
package fahrenheittocelsious;

import java.util.Scanner;


public class FahrenheitToCelsious {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter The temperature value of Fahrenheit: ");
        
        float fartemp = input.nextFloat();
         
        float result = ((fartemp-32)/9)*5;
        
        System.out.println("Converted  Fahrenheit to Celsius value is:"+result);
        
    }
       
    
}
