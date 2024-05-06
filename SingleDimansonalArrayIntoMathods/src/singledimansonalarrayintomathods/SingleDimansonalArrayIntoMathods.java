package singledimansonalarrayintomathods;

import java.util.Arrays;
import java.util.Random;

public class SingleDimansonalArrayIntoMathods {

    public static void main(String[] args) {

        int[] myList = new int[100];

        for (int i = 0; i < myList.length; i++) {

            Random random = new Random();
            int number = random.nextInt(100) + 1;
            myList[i] = number;

        }
        int max= maxNumber(myList);
        int avg =avgNumber(myList);
        System.out.println(Arrays.toString(myList));
        minNumber(myList);
        System.out.println("Max number is "+max);
        System.out.println("Avartage number is :"+avg);
    }

    public static int maxNumber(int[] myArray) {

        int max = myArray[0];
        for (int val : myArray) {

            if (max < val) {
                max = val;
            }

        }

        return max;
    }

    public static void minNumber(int[] myList) {

        int min = myList[0];
        for (int val : myList) {

            if (min > val) {
                min = val;
            }
        }
        System.out.println("Min number is:"+min);

    }

    public static int avgNumber(int[] myList) {

        int[] newList = new int[myList.length];
        int count = 0;
        int index = 0;
        int avg = 0;
        int sum = 0;

        for (int val : myList) {
            sum += val;

        }
        avg = sum / myList.length;

        for (int val : myList) {
            if (val > avg) {
                count++;
                newList[index] = val;
                index++;

            }

        }
     return avg;   
    }
}