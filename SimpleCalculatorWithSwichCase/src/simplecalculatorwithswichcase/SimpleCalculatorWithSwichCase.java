package simplecalculatorwithswichcase;

import java.util.Scanner;

public class SimpleCalculatorWithSwichCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input your First number");

        float number1 = input.nextFloat();

        System.out.println("Please enter Secend Number");

        float number2 = input.nextFloat();

        System.out.println("Please enter your Choice: \n Addition press 1 \n Substraction Press 2 \n Maltipication Press 3 \n Divaidation press 4");
        int choice = input.nextInt();

        float result =0;

        switch (choice) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid Choice");

        }

        System.out.println("Resault is" + result);

    }

}
