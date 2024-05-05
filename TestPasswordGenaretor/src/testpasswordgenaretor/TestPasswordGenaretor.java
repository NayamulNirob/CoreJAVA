
package testpasswordgenaretor;

import java.util.Random;
import java.util.Scanner;

public class TestPasswordGenaretor {

    public static void main(String[] args) {
           Scanner s= new Scanner(System.in);
        System.out.println("Enter your password Length");
        int passLength =s.nextInt();
        Random random = new Random();
        
        String pass="";
       
        
        for(int i=0; i<passLength;i++){
        
            int password =random.nextInt(4)+1;
            switch (password) {
                case 1:
                    pass+=(char)(random.nextInt(26)+65);
                    break;
               case 2:
                    pass+=(char)(random.nextInt(26)+97);
                    break;
               case 3:
                    pass+=(char)(random.nextInt(10)+48);
                    break;   
               case 4:
                    pass+=(char)(random.nextInt(15)+33);
                    break;        
            }
        
        
        }
        System.out.println(pass);
    }
    
}
