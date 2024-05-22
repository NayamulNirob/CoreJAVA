package maltidaymonshonalarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MaltiDaymonshonalArray {

    public static void main(String[] args) {

        int[][] twoD = new int[6][6];
        Random r = new Random();
//        twoD[0][0]=1;
//        System.out.println(Arrays.deepToString(twoD));
        for (int row = 0; row < twoD.length; row++) {
            for (int col = 0; col < twoD[row].length; col++) {
                twoD[row][col] = r.nextInt(100) + 1;
            }

        }
        System.out.println(Arrays.deepToString(twoD));
    }

}
