package bubbleshort02;

import java.util.Arrays;

public class BubbleShort02 {

    public static void main(String[] args) {

        int numbers[] = {5, 45, 54, 23, 56, 32, 53, 98, 55, 58};
        int temp = 0;
        System.out.println("Before Shorting");
        for (int num : numbers) {

            System.out.print(num + " ");
        }

        System.out.println(" ");
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                 if (numbers[j] > numbers[j + 1]) {
                temp =numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j+1]=temp;
                
            }
                
            }
        }
        
         for (int num : numbers) {

            System.out.print(num + " ");
        }

      
    }

}
