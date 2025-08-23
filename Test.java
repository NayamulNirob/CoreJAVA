
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(5, 6, 9);

        num.forEach(x -> System.err.println(x));

        int x = 0;

        while (x < 3) {    
            x++;
            System.out.println(x);
        }

        System.out.println(5/2+5);

        List<? super Number> list=new ArrayList<>();

        list.add(10);
        list.add(15.5);
        Object obj= list.get(1);
        System.err.println("Super Number: "+obj);



        int[] arr= {2,4,6,8};
        int result=0;

        for (int a: arr){
            if(a<5){
                result++;
            }
            else{
                break;
            }
             System.err.println(result);
        }
    }
}
