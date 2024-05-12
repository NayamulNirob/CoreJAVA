
package arrayrendom;

import java.util.Arrays;
import java.util.Random;


public class ArrayWithRandomNumber {
    
    public static void main(String[] args) {
        int [][]number= new int[2][3];
        Random random = new Random();
        
        
        for(int row=0; row<number.length; row++ ){
            for(int col =0;col<number[row].length; col++ ){
            
            int  randomNumber = random.nextInt(10)+1;
            number[row][col]=randomNumber;
            
                System.out.println(" "+number[row][col]);
            }
        
        }
        int sum =doArraySum(number);
//         System.out.println(Arrays.deepToString(number));
                System.out.println(sum);
    }
    
    public static int doArraySum(int[][] myArray){
     int sum=0;
    for(int row=0; row<myArray.length; row++){
    
        for(int col=0; col<myArray[row].length;col++){
        
        sum+=myArray[row][col];
        
        }
    
    
    }
        return sum;
    
    
    }
    
}
