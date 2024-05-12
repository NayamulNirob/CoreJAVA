
package exprimentalpractice;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExprimentalPractice {


    public static void main(String[] args) {
        
//      1. input 10 numbers in a array via scanner?

        Scanner input = new Scanner(System.in);
//        int []array = new int[10];
//        int i=0;
//        while (i<array.length) {
//            System.out.println("Enter the Numbers");  
//        array[i]=input.nextInt();
//        i++;
//        }
//        System.out.println(Arrays.toString(array));


//     2. input 10 numbers in a array via Random numbers?
        
//        Random random = new Random();
//        
//        int []array1 = new int[10];
//        int l=0;
//        
//        while (l<array1.length) {
//            
//         array1[l]= random.nextInt(100)+1;
//         l++;
//        }
//        System.out.println(Arrays.toString(array1));
        
//    3.prime number ?
//            System.out.println("Enter number");
//            int number = input.nextInt();
//            int count=0;
//        for(int a=1;a<=number;a++){
//          
//        if(number%a==0){
//        
//        count+=1;
//        }
//        
//        }
//        if(count==2){
//            System.out.println("Prime number");
//        }
//        else{
//            System.out.println("Not prime number");
//        4.factorai?        
            int factorail = input.nextInt();
            int fact =1;
            for(int b=1;b<=factorail;b++){
            
              fact*=b;
                
            }
            System.out.println(fact);
        }
    }
    

