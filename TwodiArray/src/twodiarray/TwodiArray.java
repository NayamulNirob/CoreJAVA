
package twodiarray;

import java.util.Arrays;

public class TwodiArray {

   
    public static void main(String[] args) {
        
        int[][] numbers ={{1,2,3},{4,5,6},{7,8,9}};
        int sum =soSumOfArrays(numbers);
        System.out.println(sum);
        
    }
    public static int soSumOfArrays(int[][]myArray){
    int sum =0;
        for (int[] myArray1 : myArray) {
            for (int column = 0; column<myArray[0].length; column++) {
                sum += myArray1[column];
            }
        }
    return sum;
    }
}
