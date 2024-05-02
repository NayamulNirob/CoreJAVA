package breakandcontinuetest;

import java.util.Scanner;

public class BreakAndContinueTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter  a starting value");
        int startPoint = s.nextInt();
        System.out.println("Enter  a ending value");
        int endPoint = s.nextInt();

        while (startPoint <= endPoint) {

            if (startPoint % 3 == 0 && startPoint % 5 == 0) {
                startPoint++;
               
                  System.out.println("Those are the numbers " + (startPoint-1));
                continue;
            }
            else if(startPoint>=1000){
            break;
            }
            else{
          
                
            }

            
            startPoint++;
        }

    }

}
