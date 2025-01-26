
import java.util.LinkedList;
import java.util.Queue;

class LinkListQuee{

    public static void main(String[] args) {
        Queue <Integer> queue =new LinkedList<>();
        
        queue.offer(8);
        queue.offer(10);
        queue.offer(12);
        queue.offer(14);
        queue.offer(18);
        queue.offer(20);

        System.out.println(queue);

        for (int n : queue) {
            
            System.out.println(n);
        }


    }
}