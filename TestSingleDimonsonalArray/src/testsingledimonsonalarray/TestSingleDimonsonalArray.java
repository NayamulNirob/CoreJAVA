package testsingledimonsonalarray;

import java.util.Arrays;
import java.util.Random;

public class TestSingleDimonsonalArray {

    public static void main(String[] args) {

        int[] myList = new int[100];
        String[] myList1 = new String[15];
        double[] myList2 = new double[15];
        float[] myList3 = new float[15];
        boolean[] myList4 = new boolean[15];
        char[] myList5 = new char[5];
        long[] myList6 = new long[15];
        short[] myList7 = new short[15];
        byte[] myList8 = new byte[15];

//        myList[0] = 10;
//        myList[1] = 20;

        for( int i=0;i<myList.length;i++){
        
        Random random = new Random();
        int number = random.nextInt(100)+1;
        myList[i]=number;
        
        }
        int sum=0;
        int avg=0;
        int max =0;
        int min =999;
     
        int max1 =myList[0];
        int min1 =0;
     
        
        for(int val:myList){
        sum+=val;
            
        }
        avg=sum/myList.length;
      
        int[]newList= new int [myList.length];
        int count=0;
        int index=0;
        
        for(int val:myList){
          if(val>avg){
          count++;
          newList[index]=val;
          index++;
          
          }
            
        
        }
        for(int val:myList){
        
        if(max<val){
        max=val;
        }
        if(min>val){
            min=val;
        }
        }
        
        for(int i =0; i<myList.length-1;i++){
        
        if(max1<myList[i]){
        
        max1=myList[i];
        }
            
        }
        
        
        
        
        
        
        System.out.println("New list"+count);
        System.out.println("Max number is: "+max);
        System.out.println("Max1 number is: "+max1);
        System.out.println("Min number is: "+min);
        System.out.println(Arrays.toString(newList));
        
        System.out.println("Total sum of the numbers: "+sum);
        System.out.println("Total avg of the numbers: "+avg);
        System.out.println(Arrays.toString(myList));
        System.out.println(Arrays.toString(myList1));
        System.out.println(Arrays.toString(myList2));
        System.out.println(Arrays.toString(myList3));
        System.out.println(Arrays.toString(myList4));
        System.out.println(Arrays.toString(myList5));
        System.out.println(Arrays.toString(myList6));
        System.out.println(Arrays.toString(myList7));
        System.out.println(Arrays.toString(myList8));
        System.out.println( Arrays.toString(myList));
    }

}
