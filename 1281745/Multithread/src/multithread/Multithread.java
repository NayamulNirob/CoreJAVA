
package multithread;

public class Multithread {

    
    public static void main(String[] args) {
        
        Runnable printA = new PrintChar('A', 25);
        Runnable printB = new PrintChar('B', 25);
        Runnable printNum = new PrintNumber(25);
        
        
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printNum);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
    }
    
}
