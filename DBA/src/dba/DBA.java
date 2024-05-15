
package dba;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.UnaryOperator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class DBA {


    public static void main(String[] args) {
     
        ArrayList <String> asianCountries = new ArrayList<>();
        asianCountries.add(0, "Bangladesh");
        asianCountries.add(1, "India");
        asianCountries.add(2, "Nepal");
        asianCountries.add(3, "Bhutan");
        asianCountries.add(4, "China");
        asianCountries.add(5, "Malasia");
        asianCountries.add(6, "Pakistan");
        
        LinkedList <Object> link = new LinkedList<>(asianCountries);
        link.add(2, "Mayanmar");
        link.add("South Koria");
      
        System.out.println(link);
        
        ArrayList <String> europeanCountries= new ArrayList<>();
        
        europeanCountries.add("Portugal");
        europeanCountries.add("Kongo");
        europeanCountries.add("Malta");
        europeanCountries.add("Crosia");
        europeanCountries.add("Purtugal");
        europeanCountries.add("Austria");
//        europeanCountries.remove(args);
        Iterator<String> it = europeanCountries.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.print(next+ " ");
            
        }
        Set <String> hashSet = new HashSet<>();
        Set <String> treeSet = new TreeSet<>();
        Set <String> linkHashSet = new LinkedHashSet<>();
        
        hashSet.add("najmul");
        hashSet.add("hasan");
        hashSet.add("raju");
        System.out.println(hashSet);
        
        linkHashSet.addAll(hashSet );
        System.out.println(linkHashSet);
//        ArrayList <String> clo= (ArrayList <String>) asianCountries.clone();
//        
//        System.out.println(europeanCountries);
    }
    
}
