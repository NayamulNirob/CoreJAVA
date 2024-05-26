package javaavidencetest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaAvidenceTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter index number:");
        int index = s.nextInt();
        int[] myArray = new int[100];
        Random r = new Random();

        try {
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = r.nextInt(100);

            }
            System.out.println(Arrays.toString(myArray));
            System.out.println(myArray[index]);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
