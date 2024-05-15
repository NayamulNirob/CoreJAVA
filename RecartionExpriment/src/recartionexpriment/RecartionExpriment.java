package recartionexpriment;

public class RecartionExpriment {

    public static void main(String[] args) {

       num(10);
    }

    public static void num(int n) {
        if (n > 0) {
            num(n - 1);
            System.out.println(n);

        }
       
    }
}
