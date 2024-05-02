
package matthodscheckusernameandpassword;

import java.util.Scanner;


public class MatthodsCheckUserNameAndPassword {

   
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your UserName");
        String userName = s.nextLine();
        System.out.println("Enter your password");
        String pass = s.nextLine();
        
        boolean resault=doLogin(userName, pass);
        
        if(resault){
            System.out.println("Wlcome to java");
            
        }
        else{
            System.out.println("incorrect username or password");
        }
    }
    
    public static boolean doLogin(String userName, String Password ){
        
    if(userName.equalsIgnoreCase("Java") && Password.equals("java1234")){
    
    return true;
    }
    else{
    return false;
    }    
    
    }
    
}
