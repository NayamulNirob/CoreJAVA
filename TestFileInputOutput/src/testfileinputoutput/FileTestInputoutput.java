
package testfileinputoutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTestInputoutput {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        
      
        try 
           (FileWriter fw = new FileWriter("C:\\Users\\nayam\\Desktop\\Java1.txt")){
           fw.write("New way to input");
            fw.write(" \n" + "New Methods of file input");
            fw.write(" \n" + "New Methods of file input");
            fw.write(" \n" + "New Methods of file input");
            fw.write(" \n" + "New Methods of file input");
            fw.write(" \n" + "New Methods of file input");
        }
           
       
            
        
    

        FileReader fr = new FileReader("C:\\Users\\nayam\\Desktop\\Java1.txt");

        Scanner s1 = new Scanner(fr);
        
        
        while (s1.hasNext()) {            
            System.out.println(s1.nextLine());
        }
    }
}
