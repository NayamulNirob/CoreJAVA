package exceptionhandiling;

import com.sun.source.tree.Tree;
import java.math.MathContext;
import java.util.Scanner;
import java.lang.ArithmeticException;
public class ExceptionHandiling {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int num1 = s.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = s.nextInt();


        try {
             if (num1 == 0) {
                 System.out.println("java.lang.ArithmeticException: / by zero");
            }
             else{
             System.out.println("The Dividation is :"+num1 / num2);
             }
        } catch (Exception e) {
           e.printStackTrace();

        }

    }

}
