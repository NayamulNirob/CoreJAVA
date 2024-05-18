package testavidence;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class TestAvidence {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = s.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = s.nextInt();
        int result = num1 / num2;
        
        try {

            if (num1 == 0 || num2 == 0) {
                System.out.println("Wrong number");
            } else {
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
