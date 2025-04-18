
package aggregation;

import java.util.Arrays;
import java.util.List;

public class Aggregation {
    public static void main(String[] args) {
   
        // Create independent Student objects
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // Add students to a list
        List<Student> students = Arrays.asList(s1, s2, s3);

        // Pass the student list to College (Aggregation)
        College col = new College(students);

        // List students from the College
        col.listStudents();
    }
    //Student can exist even without a College.

   //The College is linked to students, not owning them completely.


}
