
package array2d;

import java.util.Arrays;


public class Array2D {
    
    public static void main(String[] args) {
     
//        int [][]number = new int[2][3];
        
//        number [0][0]=10;
//        number [0][1]=20;
//        number [0][2]=30;
//        number [1][0]=40;
//        number [1][1]=50;
//        number [1][2]=60;
        
        int [] [][]number={{{5,6,7},{8,9,10}},{{86,59,25},{55,59,58}},
            {{89,56,36},{33,44,55}}};

//        System.out.println(number[0][1]);


        for (int[][] number1 : number) {
            for (int[] number11 : number1) {
                System.out.println(" " + Arrays.toString(number11));
            }
            System.out.println(" ");
        }
        
//        int[][][] threeDArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
////
//        for (int i = 0; i < threeDArray.length; i++) {
//            for (int j = 0; j < threeDArray[i].length; j++) {
//                for (int k = 0; k < threeDArray[i][j].length; k++) {
//                    System.out.print(threeDArray[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
        int sum=doArraySum(number);
        
        System.out.println(sum);
    }
     public static int doArraySum(int[][][] myArray){
     int sum=0;
    for(int row=0; row<myArray.length; row++){
    
        for(int col=0; col<myArray[row].length;col++){
        
        sum+=myArray[row][col][col];
        
        }
    
    
    }
        return sum;
    
    
    }
    
    
    
    
 
}
