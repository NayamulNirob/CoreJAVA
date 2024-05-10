
package fileinputoutput2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFromWebUrl {
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        String url = "https://google.com/index.html";
        URL newUrl = new URL(url);
        Scanner input = new Scanner(newUrl.openStream());
        System.out.println(input.nextLine());
    }
    
}
