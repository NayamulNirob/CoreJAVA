package testarraylist1;

import java.util.ArrayList;


public class TestArrayList1 {

    public static void main(String[] args) {

        testarraylist1.Student1 raju = new Student1("Raju", "raju@gmail.com", "0178596525");
        Student1 raju1 = new Student1("Raju", "raju@gmail.com", "0178596525");
        Student1 raju2 = new Student1("Raju", "raju@gmail.com", "0178596525");
        Student1 raju3 = new Student1("Raju", "raju@gmail.com", "0178596525");
        Student1 raju4 = new Student1("Raju", "raju@gmail.com", "0178596525");

        ArrayList<Student1> stuentList = new ArrayList<>();
        
      
        stuentList.add(raju1);
        stuentList.add(raju2);
        stuentList.add(raju3);
        stuentList.add(raju4);
        stuentList.add(raju);
        

        

        for (Student1 s : stuentList) {
            System.out.println(s);
        }
    }

}
