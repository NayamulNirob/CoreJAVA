
package testthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreads {

    
    public static void main(String[] args) {
        
        Runnable printA = new PrintChar('A', 100);
        Runnable printB = new PrintChar('B', 100);
        Runnable print100 = new PrintNumber(100);
        
        
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        
        ExecutorService es=Executors.newFixedThreadPool(3);
        
        es.execute(new PrintChar('a', 100));
        es.execute(new PrintChar('b', 100));
        es.execute(new PrintNumber(100));
        
        es.shutdown();
    }
    
}
