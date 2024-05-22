
package singledimonsonalarraytest;

import java.util.Arrays;
import java.util.Random;

public class ArraysToMathods  {
    public static void main(String[] args) {
        
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            array[i] = r.nextInt(100) + 1;

        }
        System.out.println(Arrays.toString(array));
       
       int sumNum =sumNumber(array);
        System.out.println(sumNum);
    }
    public static int sumNumber(int [] array){
    
    int sum = 0;

        for (int val : array) {
            sum += val;
        }
    
        return sum;
    
    
    
    }
    
    
}
