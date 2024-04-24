
package swichcase;

import java.util.Scanner;
import javax.print.DocFlavor;


public class SwichCase {

    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day number");
        int numberOfDay = scanner.nextInt();
        String dayName = "";
        
        
        switch (numberOfDay) {
            
            case 1:
                dayName = "Satarday";
                break;
            case 2:
                dayName = "Sunday";
                break;
            case 3:
                dayName = "Monday";
                break;
            case 4:
                dayName = "Tuesday";
                break;
            case 5:
                dayName = "Wednesday";
                break;
            case 6:
                dayName = "Thursday";
                break;
            case 7:
                dayName = "Friday";
                break;
            default:
                dayName = "Invalid day number";
        }
        
        System.out.println("Your desaire day is : "+dayName);
        
    }
    
}
