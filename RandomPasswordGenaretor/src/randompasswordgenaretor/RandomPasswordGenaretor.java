
package randompasswordgenaretor;

import java.util.Random;


public class RandomPasswordGenaretor {

    public static void main(String[] args) {
        
        Random rand = new Random();
        int range = rand.nextInt(3)+1;
        System.out.println(range);
    }
    
}
