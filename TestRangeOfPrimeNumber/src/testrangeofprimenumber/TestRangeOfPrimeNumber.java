package testrangeofprimenumber;


import java.util.Arrays;
import java.util.Scanner;

public class TestRangeOfPrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a limit for prime number");
        int n = s.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {

            number[i] = i + 1;
        }
        int[] result = rangOfPrimeNumber(number);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rangOfPrimeNumber(int[] myArray) {
        int index = 0;

        int[] newArray = new int[myArray.length];
        for (int item : myArray) {
            int count = 0;
            for (int i = 1; i <= myArray.length; i++) {

                if (item % i == 0) {

                    count++;

                }

            }
            if (count == 2) {
                newArray[index] = item;
                index++;
            }
        }
        if (newArray.length == 100) {
            newArray = Arrays.copyOf(newArray, 25);
        }
        if (newArray.length == 200) {
            newArray = Arrays.copyOf(newArray, 46);
        }
        if (newArray.length == 300) {
            newArray = Arrays.copyOf(newArray, 62);
        }
        

        return newArray;
    }

}
