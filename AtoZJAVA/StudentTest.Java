public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "John";
        s1.rollNo = 2;
        s1.marks = 90.5;

       Student s2 = new Student();
        s2.name = "Doe";
        s2.rollNo = 3;
        s2.marks = 80.5;

        Student s3 = new Student();
        s3.name = "Smith";
        s3.rollNo = 4;
        s3.marks = 70.5;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i <students.length; i++) {
        //     System.out.println(" Roll No: "+students[i].rollNo+" Name: "+students[i].name+" Marks: "+students[i].marks);
        // }

        for(Student student:students){
            System.out.println(" Roll No: "+student.rollNo+" Name: "+student.name+" Marks: "+student.marks);
        }
    }
}

class Student {

    String name;
    int rollNo;
    double marks;

}


