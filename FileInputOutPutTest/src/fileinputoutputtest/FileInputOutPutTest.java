package fileinputoutputtest;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class FileInputOutPutTest {

    public static void main(String[] args) throws MalformedURLException, IOException {
  
            try (FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\1281745\\Java.txt")) {
            fw.write("New way to input");
            fw.write(" \n" + "New Methods of file input");
           

        }

        FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\1281745\\Java.txt");

        Scanner s1 = new Scanner(fr);
        
        
        while (s1.hasNext()) {            
            System.out.println(s1.nextLine());
        }

    }

}
