package computearea59;

import java.util.Scanner;

public class ComputeArea59 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter a number");
        int redious;
        redious = input.nextInt();
        double PI = 3.1416;

        double area = redious * redious * PI;
        System.out.println(area);

    }

}
