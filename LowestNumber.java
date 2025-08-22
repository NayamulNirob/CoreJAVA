import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

class LowestNumber{

    public static void main(String[]agrs){

        List<Integer> stats=Arrays.asList(2,3,8,6,7,25,6);

        // 1st method to findout max number

        int numb= Collections.max(stats);

        System.out.println(numb);


        //2nd method to findout min number

        IntSummaryStatistics num = stats.stream().mapToInt(x->x).summaryStatistics();

        System.out.println(num.getMin());
    }

}