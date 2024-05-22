package singledimonsonalarraytest;

import java.util.Arrays;
import java.util.Random;

public class SingleDimonsonalArrayTest {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            array[i] = r.nextInt(100) + 1;

        }
        System.out.println(Arrays.toString(array));

        int sum = 0;

        for (int val : array) {
            sum += val;
        }
        System.out.println("sum :" + sum);

        double avg = 0.0;
        avg = (double) sum / array.length;

        System.out.println("avg :" + avg);
        int index = 0;
        int count = 0;
        int[] avg1 = new int[array.length];
        for (int val : array) {
            if (val > avg) {
                count += 1;
                avg1[index] = val;
                index++;
            }

        }

        System.out.println("More then avg are :" + count);
        System.out.println("The above avg numbers are:" + Arrays.toString(avg1) + "  ");

        int max = 0;

        for (int val : array) {
            if (val > max) {
                max = val;
            }
        }
        System.out.println("Max number is :" + max);

        int min = 9999;
        for (int val : array) {
            if (val < min) {
                min = val;
            }
        }
        System.out.println("Min number is :" + min);
        
        int max1 = array[0];
        for (int i = 0; i < array.length; i++) {

            if (max1 < array[i]) {
                max1 = array[i];
            }
        }
        System.out.println("Max1 is :" + max1);
        
        int min1 = array[0];
        for (int i = 0; i < array.length; i++) {

            if (min1 > array[i]) {
                min1 = array[i];
            }
        }
        System.out.println("Min1 is :" + min1);
    }

}
