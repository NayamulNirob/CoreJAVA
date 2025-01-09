
package newjavaexcersize;

public class NewJavaExcersize {

    public static void main(String[] args) {
        
       int myArray[]={1,2,3,4,5};
       
       for(int i=0;i<5;i++){
           System.out.print(myArray[i]+" ");
       }
       
       int numbers[][]= new int[3][4];
       
       for(int i=0;i<3;i++){
           for(int j=0;j<4;j++){
               System.out.print(numbers[i][j]+" ");
           }
       }
    }
    
}
