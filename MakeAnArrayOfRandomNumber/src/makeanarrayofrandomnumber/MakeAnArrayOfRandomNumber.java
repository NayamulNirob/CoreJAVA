
package makeanarrayofrandomnumber;

import java.util.Random;

public class MakeAnArrayOfRandomNumber {

    public static void main(String[] args) {
     int [][]number= new int[2][3];
        Random random = new Random();
        
        
        for (int[] number1 : number) {
            for (int col = 0; col < number1.length; col++) {
                int  randomNumber = random.nextInt(10);
                number1[col] = randomNumber;
                System.out.println(" " + number1[col]);
            }
        }

        
    }
    
}
