
package recartion2;

import java.util.Scanner;

public class Recartion2 {

    
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a starting Number");
        int start = s.nextInt();
        
        System.out.println("Enter a end Number");
        int end = s.nextInt();
       
        int result = sum(start,end);
        System.out.println(result);
        
    }

    private static int sum(int startPoint, int endPoint) {
        
        if(endPoint >startPoint){
        
        return endPoint+sum(startPoint, endPoint-1);
        }
        else {
            
        return endPoint;
        
        }
    }
    
}
