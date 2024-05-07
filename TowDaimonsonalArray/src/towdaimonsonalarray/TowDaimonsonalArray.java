
package towdaimonsonalarray;

import java.util.Arrays;


public class TowDaimonsonalArray {

    public static void main(String[] args) {
      
//        int [][][] number = new int[3][3][3];
       
        
        
        
//        number[0][0][0]=5;
//        number[0][1][0]=6;
//        number[0][2][0]=7;
//        number[0][3][0]=40;
//        number[1][0][0]=50;
//        number[1][1][0]=60;
//        number[1][2][0]=70;
//        number[1][3][0]=80;
//        number[2][0][0]=90;
//        number[2][1][0]=100;
//        number[2][2][0]=110;
//        number[2][3][0]=120;
//        
//        
//        number[3][0][0]=130;
//        number[3][0][1]=130;
//        number[3][0][2]=130;
//        number[3][0][3]=130;
        
         int [][][] number = {{{5,6,7,8},{8,9,10,11}},{{86,59,25,78},{55,59,58,56}},{{89,56,36,15},{22,33,44,55}},{{90,80,70,60},{66,77,88,99}}};
        
        for(int row=0;row<number.length; row++){
        
            for(int col=0; col<number[row].length;col++){
                
            System.out.println("  "+Arrays.toString(number[row][col]));
            }
           
            System.out.println("  ");
        }
        
        
//        number[][][]={10,20,30,40,50,60,70}
        
//        System.out.println(number[0][0][1]);
//        System.out.println(number[0][1][0]);
//        System.out.println(number[0][2][0]);

// 
    }
    
}
