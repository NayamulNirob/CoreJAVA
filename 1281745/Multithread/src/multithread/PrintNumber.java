
package multithread;

public class PrintNumber implements Runnable{
private int lastNumber;

    public PrintNumber(int lastNumber) {
        this.lastNumber = lastNumber;
    }



    @Override
    public void run() {
         for (int i = 1; i <= lastNumber; i++) {
            System.out.print(""+i);
        }
    }
    
}
