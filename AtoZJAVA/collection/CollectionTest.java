
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CollectionTest{

public static void main(String[] args) {
    
    // Collection<Integer> num = new ArrayList<>();

    List<Integer> num = new ArrayList<>();

    // Set <Integer> num = new HashSet<>();

    //  Collection<Integer> num = new TreeSet<>();

    // ArrayList num = new ArrayList();

    num.add(6);
    num.add(8);
    num.add(10);
    num.add(12);
    num.add(14);
    num.add(16);
    num.add(8);

    // System.out.println(num.indexOf(8));
    // System.out.println(num.get(4));
    // System.out.println(num.getFirst());
    // System.out.println(num.getLast());
   
   Iterator<Integer> values= num.iterator();

   while(values.hasNext()){
    System.out.println(values.next());
   }

    // for (int n : num) {
        
    //     System.out.print(n+" ");
    // }

    // System.out.println(num);
}

}