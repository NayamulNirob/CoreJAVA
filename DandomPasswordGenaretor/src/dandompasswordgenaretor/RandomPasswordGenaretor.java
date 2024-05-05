
package dandompasswordgenaretor;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenaretor {

    public static void main(String[] args) {
   
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your password Length");
        int passLength =s.nextInt();
        
        String password = passGenarator(passLength);
        System.out.println("password is "+password);
    }
    
    public static String passGenarator(int passLength){
    
       Random random = new Random();
       String pass="";
       String fainalPass ="";
       
       for(int i=1; i<=passLength;i++){
           int range =random.nextInt(3)+1;
       
           switch (range) {
               case 1:
                   pass+=(char) (random.nextInt(26)+65);
                   break;
               case 2:
                   pass+=(char) (random.nextInt(26)+97);
                   break;
               case 3:
                   pass+=(char) (random.nextInt(10)+48);
                   break;    
             
           }
       
       
       
       }
       for(int i=0;i<pass.length();i++){
       
           if(i==pass.length()/2){
           fainalPass+="_"+pass.charAt(i);
           
           }
           else{
           fainalPass+=pass.charAt(i);
           }
       }
        return fainalPass;
    
    }
    
}
