
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ArrayListTest{
    public static void main(String[] args){
        
        //  int crr=3126;
        // int born=crr-8;
        
        // System.out.println(String.valueOf(born));



        // System.out.println(6+6+" G "+5+5);//12 G 55

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3, 6);


        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);


        for (int n : list2){

            System.out.println(" 2nd Array list  :"+n);
            
        }

        Iterator <Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // System.out.println(list);
    }
}