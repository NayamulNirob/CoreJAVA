
package testinheritencejava;

import java.awt.Window;
import pc.Computer;
import pc.MacBook;
import pc.Windows;


public class TestInheritenceJava {

    public static void main(String[] args) {
      pc.Computer computer = new Computer("Keybord: YES"+" MotherBodr: ", true, "YES"+" Speaker: ", "Yes"+" Prossesor :", true, true);
      
//        computer.printDetails();
        
        
         pc.Windows windows = new Windows("MicroSoftStore: Yes"+" FileExplorar: ", true, "Yes"+" OUTLOOK: ", true);
        
//        windows.printDetails();
        
     pc.MacBook mac = new MacBook(true, "48MPX", true, "YES");
     
//    mac.printDetails(); 
     System.out.println(computer+"\n");
     System.out.println(windows+"\n");
     System.out.println(mac+"\n");
    }
    
}
