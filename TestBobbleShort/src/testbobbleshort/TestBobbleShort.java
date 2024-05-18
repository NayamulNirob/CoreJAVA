package testbobbleshort;

import java.util.Arrays;
import java.util.Random;
import static java.util.Random.from;

public class TestBobbleShort {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = random.nextInt(100)+1;
        }
        System.out.println("Before" + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }

            }
            System.out.println("Shorting Prossess : " + Arrays.toString(numbers));
        }
        System.out.println("After " + Arrays.toString(numbers));



    }

}
