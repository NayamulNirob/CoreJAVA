package fileinputoutputtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileInputOutPutTest {

    public static void main(String[] args) throws MalformedURLException, IOException {

                File file = new File("C:\\Users\\nayam\\Desktop\\Java.txt");
                
                       
                        System.out.println(new Date(file.lastModified()));
                        
                        try {
                            try (PrintWriter pw = new PrintWriter(file)) {
                                pw.append("Hello java");
                            }
                            Scanner s = new Scanner(file);
                            System.out.println(s.nextLine());
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(FileInputOutPutTest.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                
                
                        
                        URL url = new URL("https://google.com/index.html");
                        Scanner scanner = new Scanner(url.openStream());
                        System.out.println(scanner.nextLine() );
                        
                        try {
                            URI uri = new URI("https://google.com/index.html");
                       
                            System.out.println(uri.toString());
                        } catch (URISyntaxException ex) {
                            Logger.getLogger(FileInputOutPutTest.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\nayam\\Desktop\\Java1.txt"))) {
                            bw.write("Always Try To learn");
                            bw.write(" \n"+"Life is Called A expriment");
                           bw.close();
                            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\nayam\\Desktop\\Java1.txt"))) {
                                
                                String s;
                                
                                while ((s=br.readLine())!=null) {
                                    System.out.println(s);
                                }
                            }
                            
                        }
                
                
                
                
            try (FileWriter fw = new FileWriter("C:\\Users\\nayam\\Desktop\\Java1.txt")) {
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
