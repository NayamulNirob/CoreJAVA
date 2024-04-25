package teststringfacebook;

import java.util.Scanner;

public class TestStringFacebook {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Email address or phone Number");

        String userId = s.next();

        System.out.println("Enter your password");
        String password = s.next();

        String massage = String.format("Welcome %s to facebook", userId);

        if (userId.length() > 3 && userId.length() < 10) {

            System.out.println("Leanth is correct");

            if (userId.equalsIgnoreCase("java") && password.equalsIgnoreCase("java1234")) {

                System.out.println("Welcome to facebook");

            } else {
                System.out.println("invalid cordinator");
            }

        }
        
        else{
            System.out.println("User name must have 3 -10 charecter");
        
        }

    }

}
