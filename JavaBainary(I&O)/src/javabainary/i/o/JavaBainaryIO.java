package javabainary.i.o;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class JavaBainaryIO {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student("Sara", 23);
        Student student2 = new Student("Jhon", 27);
        Student student3 = new Student("Kobir", 29);
        
        writeStudentsToFile(student1,student2,student3);
        readAndDisplayStudentsFromfile();
    }

    public static void writeStudentsToFile(Student... students) {

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\nayam\\OneDrive\\Desktop\\1281745(Java)\\JavaBainary(I&O)\\student.dat"));

            for (Student student : students) {

                outputStream.writeObject(student);
            }
        } catch (IOException iOException) {
        }

    }

    private static void readAndDisplayStudentsFromfile() throws IOException, ClassNotFoundException {
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\nayam\\OneDrive\\Desktop\\1281745(Java)\\JavaBainary(I&O)\\student.dat"))) {
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
                } catch (EOFException e) {
                    break;
                }
            }
        }
    }
}
