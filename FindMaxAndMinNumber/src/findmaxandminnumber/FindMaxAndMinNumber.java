
package findmaxandminnumber;

import java.util.Scanner;

public class FindMaxAndMinNumber {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int number1 = scanner.nextInt();
        System.out.println("Enter 2nd Number");
        int number2 = scanner.nextInt();
        System.out.println("Enter 3rd Number");
        int number3 = scanner.nextInt();
        
        int max=0;
        if(number1>number2 && number1>number3){
        max = number1;
        }
        else if(number2>number1 && number2>number3) {
        max =number2;
        }
        else{
        max =number3;
        }
        System.out.println("Max number is :"+max);
        
        int min=0;
        if(number1<number2 && number1<number3){
        min = number1;
        }
        else if(number2<number1 && number2<number3) {
        min =number2;
        }
        else{
        min =number3;
        }
        System.out.println("Min number is :"+min);
    }
    
}
