

package swichcasedayname;

import java.util.Scanner;



public class SwichCaseDayName {

  
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your day number");
        
        int dayNumber = input.nextInt();
        
        String day = "";
        
        switch (dayNumber) {
            case 1:
                day ="Saterday";
                break;
                
            case 2:
                day ="Sunday";
                break; 
                
            case 3:
                day ="Monday";
                break;
            case 4:
                day ="Tuesday";
                break;    
            case 5:
                day ="Wednesday";
                break;    
             case 6:
                day ="Trusday";
                break;
            case 7:
                day ="Friday";
                break;
                
            default:
                System.out.println("Invalid day number");
                
        }
        
        System.out.println(day);
    }
    
}
