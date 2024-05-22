
package rangofprimenumber2;

import java.util.Arrays;

public class RangOfPrimeNumber2 {

    public static void main(String[] args) {
        int []number = new int[100];
        
        for(int i=0;i<number.length;i++){
        number[i]=i+1;
        }
        int []result = primeNumber(number);
        System.out.println(Arrays.toString(result));
    }
    public static int[]primeNumber(int []myArray){
       
       int index=0;
       int [] newArray = new int[25];
       for(int item:myArray){
       int count=0;
       for(int i=1; i<=item; i++){
       
           if(item%i==0){
           count++;
           }
           
       }
       if(count==2){
       newArray[index]=item;
       index++;
       }
       
       }
        return newArray;
    
    
    }
}
