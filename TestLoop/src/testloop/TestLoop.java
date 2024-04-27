package testloop;

import java.util.Scanner;

public class TestLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter start point");
        int startPoint = input.nextInt();
        System.out.println("Enter end point");
        int endPoint = input.nextInt();
//        while (startPoint<=endPoint) {            
//            System.out.println(startPoint+"Hello java");
//            startPoint++;
//        }

        while (startPoint <= endPoint) {
            if (startPoint % 3 != 0 || startPoint % 5 != 0) {
                System.out.println(startPoint + "Hello java");
            }
            
            startPoint++;
        }

    }

}
