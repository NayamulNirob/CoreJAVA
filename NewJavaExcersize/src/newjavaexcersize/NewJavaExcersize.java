
package newjavaexcersize;

import java.util.Scanner;

public class NewJavaExcersize {

    public static void main(String[] args) {
        
//       int myArray[]={1,2,3,4,5};
//       
//       for(int i=0;i<5;i++){
//           System.out.print(myArray[i]+" ");
//       }
//       
//       int numbers[][]= new int[3][4];
//       
//       for(int i=0;i<3;i++){
//           for(int j=0;j<4;j++){
//               System.out.print(numbers[i][j]+" ");
//           }
//       }

        Scanner sc= new Scanner(System.in);
        
        int number= sc.nextInt();
        
        int factorial=1;
        
        for(int i=number; i>0;i--){
            
           factorial*=i; 
        }
        System.out.println(factorial);
        
        sc.close();
    }
    
}
