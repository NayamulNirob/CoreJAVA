
package totalexpriment;

import java.util.Arrays;
import java.util.Random;

public class TotalExpriment {

    
    public static void main(String[] args) {
        
      int [] hobena = new int[6];
      hobena[0]=5;
      hobena[1]=6;
      hobena[2]=7;
      hobena[3]=8;
      hobena[4]=9;
      hobena[5]=10;
        System.out.println(Arrays.toString(hobena));
     String [] kichuparina = {"Halk","Thor","Spider","Bat","Deadpool"};
        System.out.println(Arrays.toString(kichuparina));
        
        
        int [] kicchuhobena = new int[10];
        Random r = new Random();
        int sum =0;
        int avg = 0;
        int []newArray = new int[kicchuhobena.length];
        
        for(int i=0; i<kicchuhobena.length; i++){
            
            kicchuhobena[i]=r.nextInt(50);
        }
        for(int val:kicchuhobena){
            System.out.print(val+ " ");
        }
        for(int val:kicchuhobena){
        sum+=val;
        }
        int count=0;
        int index =0;
        for(int val:kicchuhobena){
            if(val>avg){
            count++;    
            newArray[index]=val;
             index++;
             
            }
           
        }
        avg = sum/kicchuhobena.length;
        System.out.println("\nArrays sum: "+sum);
        System.out.println("\nArrays avg :"+(sum/kicchuhobena.length));
        System.out.println("\nArrays avg :"+avg);
        System.out.println(count);
        System.out.println(Arrays.toString(newArray));
                
      
    }  
}
