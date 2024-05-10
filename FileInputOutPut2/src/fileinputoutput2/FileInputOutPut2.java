
package fileinputoutput2;

import java.io.File;
import java.util.Date;


public class FileInputOutPut2 {

    public static void main(String[] args) {
      
        File file = new File("C:\\Users\\nayam\\OneDrive\\Desktop\\JAVA.txt");
         System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
        System.out.println(file.getAbsolutePath());
        System.out.println(new Date(file.lastModified()));
        
        
    }
    
}
