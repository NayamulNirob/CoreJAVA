
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("ENTER A NUMBER FOR FACTORIAL");
            int num=sc.nextInt();

            System.err.println(num+" Fcatorial is :"+fact(num));
        }
    }

    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }

        return  n*fact(n-1);
    }
}
