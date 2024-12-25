
package startagian;

import java.util.Scanner;

public class StartAgian {

   public static Reversal reversed = new Reversal();

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("SOUT"); 
        
        for (int i = 1; i <5; i++) {
            System.out.println("*".repeat(i));
        }
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Number 1");
        int n=sc.nextInt();
        System.out.println("enter 2nd number ");
        int m=sc.nextInt();
       
        if(n==m){
            System.out.println(n+" equal "+m);
        }
        else if(n>m){
            System.out.println(n+" n is gretter m "+m);
        }
        else if(n<m){
            System.out.println(n+" n is lesser m "+m);
        }
        else{
            System.out.println(n+"  "+m);
        }
        
        String input = "hello";
        String reversed = new StringBuilder(input).reverse().toString();
        
        System.out.println("Reversed string: " + reversed);
    }
       
    
}
