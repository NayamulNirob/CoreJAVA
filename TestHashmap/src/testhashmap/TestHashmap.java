
package testhashmap;


public class TestHashmap {

    
    public static void main(String[] args) {
        
        long bits = Double.doubleToLongBits(10.10);
        int hashcode = (int)(bits^(bits>>32));
        System.out.println(hashcode);
        
    }
    
}
