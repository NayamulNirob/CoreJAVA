
package testtreeset;

import java.util.HashMap;
import java.util.Map;


public class TestTreeSet {

    
    public static void main(String[] args) {
        
        Map<String,Integer> li = new HashMap<>();
        
        li.put("Hasan", 23);
        li.put("Rakib", 22);
        li.put("Hasib", 21);
        li.put("Nokib", 20);
        System.out.println(li);
        
         Map<String,Information> info = new HashMap<>();
         
         info.put("Hasan",new Information(128, 26, "Male"));
         System.out.println(info.get("Hasan"));
    }
    
}
