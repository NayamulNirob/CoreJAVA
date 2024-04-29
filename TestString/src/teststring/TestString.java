package teststring;

import java.util.Scanner;

public class TestString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Pls enter user Name");
        String userName = s.nextLine();
        System.out.println("Pls enter Password");
        String pass = s.nextLine();

        boolean result = doLogin(userName, pass);

        if (result) {
            System.out.println("Welcome " + userName);
        } else {

            System.out.println("User name or password is incorrect");
        }

    }

    public static boolean doLogin(String userName, String password) {

        if (userName.equalsIgnoreCase("java") && password.equals("java1234")) {
            return true;
        } else {
            return false;
        }

    }
}
