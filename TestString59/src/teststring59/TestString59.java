package teststring59;

import java.util.Scanner;

public class TestString59 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your email id");
        String userEmail = s.next();
        String massage = String.format("Welcome %s to google", userEmail);

        if (userEmail.equalsIgnoreCase("java")) {

            System.out.println("Enter your password");
            String password = s.next();

            if (password.equals("java1234")) {
                System.out.println(massage);
            } else {
                System.out.println("incorrect password");
            }
        } else {
            System.out.println("Couldn't find your google account");
        }
    }
}