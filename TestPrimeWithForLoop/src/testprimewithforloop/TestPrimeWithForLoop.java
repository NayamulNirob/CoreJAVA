
package testprimewithforloop;

import java.util.Scanner;


public class TestPrimeWithForLoop {

   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter start point");
        int startPoint = input.nextInt();
        System.out.println("Enter end point");
        int endPoint = input.nextInt();

    
        for (int j = startPoint; j <= endPoint; j++) {
            int count = 0;
            for (int i = 1; i <= j; i++) {

                if (j % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(j);
            }
        }
        
        
    }
    
}
