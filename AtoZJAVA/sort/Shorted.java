
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Shorted{

    public static void main(String[] args) {

        Comparator <Student> com = (i,j) -> i.age>j.age?1:-1;

        List <Student> nums= new ArrayList<>();


            nums.add(new Student(18,"Jhon"));
            nums.add(new Student (22,"Deck"));
            nums.add(new Student(20,"Hok"));
            nums.add(new Student(19,"Navin"));
            nums.add(new Student(23,"Raddy"));


            Collections.sort(nums,com);

            for (Student s : nums) {
                System.out.println(s);
            }

            // System.out.println("Shorted List: "+nums);



    }
}