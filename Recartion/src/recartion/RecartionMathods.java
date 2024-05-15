package recartion;

public class RecartionMathods {

    public static void main(String[] args) {

         number(10);
    }

    public static void number(int k) {

        if (k > 0) {
        number(k-1);
            System.out.println(k);
        }
       

        
    }
}
