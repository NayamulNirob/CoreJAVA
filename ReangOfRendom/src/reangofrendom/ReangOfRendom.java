
package reangofrendom;
import java.util.Arrays;
public class ReangOfRendom {

 
    public static void main(String[] args) {
      
        int []numberArray =new int[100];
        
        for(int i =0;i<numberArray.length;i++){
        numberArray[i]=i+1;
        }
        int[] result=rangOfPrimeNumber(numberArray);
        System.out.println(Arrays.toString(result));
         
    }
    public static int[] rangOfPrimeNumber(int[] myArray) {
        
        int[] newArray =new int[25];
        int index=0;
        for(int item:myArray){
            int count=0;
            for( int i =1; i<=item;i++){
                if(item%i==0){
                count++;
                }
            }  
            if(count ==2 ){
                newArray[index]=item;
                index++;
            }
           
        }
     return newArray;
    }
}
