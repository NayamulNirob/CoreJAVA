
package matthodscheckusernameandpassword;

import java.util.Scanner;

public class TestMethodsInPrimeNumber {
    
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        primeNumber(num);
      
        
        
    }
    public static int primeNumber(int number ){
        int count=0;
        for(int i=1;i<=number;i++){
       
        
        if(number%i==0){
             count++;
        }
        }
        if(count==2){
            System.out.println("Its a prime "+number);
        }
        else{
        System.out.println("Its not a prime "+number);
        }
        
        
    return count;
    }
    
}
