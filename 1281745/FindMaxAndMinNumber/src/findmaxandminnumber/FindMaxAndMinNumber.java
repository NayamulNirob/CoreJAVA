
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
        System.out.println("Enter 3rd Number");
        int number4 = scanner.nextInt();
        System.out.println("Enter 3rd Number");
        int number5 = scanner.nextInt();
   
        
        int max=0;
        if(number1>number2 && number1>number3 &&number1>number4 && number1>number5){
        max = number1;
        }
        else if(number2>number1 && number2>number3 && number2>number4 && number2>number5) {
        max =number2;
        }
        else if(number3>number1 && number3>number2 && number3>number4 && number3>number5) {
        max =number3;
        }
        else if(number4>number1 && number4>number2 && number4>number3 && number4>number5) {
        max =number4;
        }
        else{
        max =number5;
        }
        System.out.println("Max number is :"+max);
        
        int min=0;
        if(number1<number2 && number1<number3 &&number1<number4 && number1<number5){
        min = number1;
        }
        else if(number2<number1 && number2<number3 && number2<number4 && number2<number5) {
        min =number2;
        }
        else if(number3<number1 && number3<number2 && number3<number4 && number3<number5) {
        min =number3;
        }
        else if(number4<number1 && number4<number2 && number4<number3 && number4<number5) {
        min =number4;
        }
        else{
        min =number5;
        }
        System.out.println("Max number is :"+min);
        
        
    }
    
}
