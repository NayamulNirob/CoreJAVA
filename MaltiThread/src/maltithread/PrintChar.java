
package maltithread;


public class PrintChar implements Runnable{

    private char charToprint;
    private  int times;
    
   
    public PrintChar(char charToprint, int times) {
        this.charToprint = charToprint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToprint);
        }
    }
    
}
class PrintNum implements Runnable {

    private int lastNum;

        public PrintNum(int lastNum) {
            this.lastNum = lastNum;
        }

        @Override
        public void run() {
            for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
        }
    
    


}
