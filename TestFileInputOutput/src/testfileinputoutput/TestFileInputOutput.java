
package testfileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.io.PrintWriter;
import java.util.Scanner;



public class TestFileInputOutput {

   
    public static void main(String[] args) throws FileNotFoundException {

    File file = new File("C:\\Users\\nayam\\OneDrive\\Desktop\\JAVA.txt");
//        System.out.println(file.exists());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.isAbsolute());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        System.out.println(file.isHidden());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(new Date(file.lastModified()));
        
        PrintWriter output = new PrintWriter(file);
        output.append("Hello And Welcome To The Superior Power Of ");
        output.append("JAVA and lot More ");
        output.close();
        
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
        
    }
    
}
