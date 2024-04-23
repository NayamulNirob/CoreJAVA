
package farenhitetocelcius;

import java.util.Scanner;


public class FarenhiteToCelcius {

  
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("please enter tempreature in Farenheite :");
        float fertemp = input.nextFloat();
        
        float result = ((fertemp -32)/9)*5;
        System.out.println("temprature in celsisus "+ result);
        
    }
    
}
