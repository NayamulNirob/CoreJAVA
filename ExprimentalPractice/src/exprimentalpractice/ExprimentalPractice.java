package exprimentalpractice;

import java.lang.reflect.Array;
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
//        int factorail = input.nextInt();
//        int fact = 1;
//        for (int b = 1; b <= factorail; b++) {
//
//            fact *= b;
//
//        }
//        System.out.println(fact);
//        int ch = -10;
//
//        switch (ch) {
//            case 1:
//                ch++;
//                break;
//            case 2:
//                ch++;
//                break;
//            default:
//                ch++;
//            case 3:
//                ch++;
//                break;
//            case 4:
//                ch++;
//           
//        }
//        System.out.println(ch);
//        for (int i = 1; i < 4; i++) {
//
//            if (i < 2) {
//                continue;
//
//            }
//            System.out.println(i);
//        }
//        int i = 10;
//        do{
//
//            i--;
//
//        }
//        while (i > 10);
//            System.out.println(i);
//        int[] myArray = new int[]{1, 2, 3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(myArray));


////      1.Common attribute:
//        int[] numbers1;
////        System.out.println("1.Common attribute:"+Arrays.toString(numbers1));
//
////      2.Common object:
//        int[] numbers2 = new int[5];
//        System.out.println("2.Common object:"+Arrays.toString(numbers2));
//        
////      3. Common method:
//        int[] numbers3 = {1, 2, 3, 4, 5};
//        System.out.println("3.Common method:"+Arrays.toString(numbers3));
//        
////      4.Common name:
//        int arrayNumber4[] = new int[5];
//        System.out.println("4.Common name:"+Arrays.toString(arrayNumber4));


        int i =0;
        
        while (true) {            
            if(i==4){
            break;
            }
            i++;
        }
        System.out.println("i : "+i);
        
    }
}
