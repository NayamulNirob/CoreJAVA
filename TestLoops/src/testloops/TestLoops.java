package testloops;

import java.util.Scanner;

public class TestLoops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a starting value");
        int startPoint = input.nextInt();

        System.out.println("enter a ending value");
        int endPoint = input.nextInt();

//        while (startPoint<endPoint) {            
//             System.out.println("\n"+startPoint+" Hope everything will be fine ");
//             startPoint+=1;
//        }
//        
//          while (startPoint<endPoint) {  
//              
//              if(startPoint%3 !=0 || startPoint%5 !=0){
//              
//                  System.out.println(startPoint);
//              }
//             
//             startPoint+=1;
//        }
//        while (startPoint < endPoint) {
//
//            if (startPoint % 3 == 0 || startPoint % 5 == 0) {
//
//                System.out.println(startPoint);
//            }
//
//            startPoint += 1;
//        }
//        while (startPoint < endPoint) {
//
//            if (startPoint % 3 == 0 && startPoint % 5 == 0) {
//
//                System.out.println("\n"+startPoint);
//            }
//
//            startPoint += 1;
//        }
        while (startPoint < endPoint) {

            int count = 0;

            for (int i = 2; i < startPoint; i++) {
                if (startPoint % i == 0) {

                    count += 1;

                }

            }
            if (count == 0 && startPoint > 1) {

                System.out.println(startPoint + " Its  a  prime number");
            } else {

            }
            startPoint = startPoint + 1;
        }

    }

}
