
package aggregation;

import java.util.List;

public class College {
   List<Student> students;  // Aggregation

    College(List<Student> students) {
        this.students = students;
    }

    void listStudents() {
        for (Student s : students) {
            System.out.println(s.name);
        }
    } 
}
