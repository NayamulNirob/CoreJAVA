package firstprogram;

import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pls enter the value of Radius");
        int radius = input.nextInt();
        double area;
        area = radius * radius * 3.1416;
        System.out.println(area);

        System.out.println("Please enter height");
        float height = input.nextFloat();
        System.out.println("Please enter wedth");
        float wedht = input.nextFloat();
        double rectangul;
        rectangul = height * wedht;
        System.out.println("The area of the rectangular " + rectangul);

        System.out.print("Please enter num1: ");
        float num1 = input.nextFloat();
        System.out.print("Please enter num2: ");
        float num2 = input.nextFloat();

        System.out.print("Please enter num3: ");
        float num3 = input.nextFloat();
        System.out.print("Please enter num4: ");
        float num4 = input.nextFloat();

        float sum;
        sum = num1 + num2 + num3 + num4;
        System.out.println("Total SUM of the Numbers : " + sum);

    }

}
