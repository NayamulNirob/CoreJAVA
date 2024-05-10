package testfortest;

import java.util.Scanner;

public class TestForTest {

    public static void main(String[] args) {

//            Scanner scanner = new Scanner(System.in);
//            int sum=0;
//
//            System.out.println("Enter numbers :");
//            while (scanner.hasNextInt()) {
//                int num = scanner.nextInt();
////                System.out.println("You entered: " + num);
//                sum+=num;
//               if(num<0){
//                   System.out.println("you entered a nqagitive number"+sum);
//                   break;
//               } 
//               else{
//               continue;
//               }
//            }
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            sum += num;
            count++;
        }

        System.out.println("Total sum of positive numbers: " + sum);
        System.out.println("Total count of positive numbers: " + count);

        scanner.close();

    }
}
