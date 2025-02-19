public class Demo6 {
    public static void main(String[] args) {
        int i=10;
        recursion(i);
    }

    public  static  int recursion(int i){

       System.err.println(i);
        if (i>0) {
        recursion(i-1);
        }
                return i;
    }
}
