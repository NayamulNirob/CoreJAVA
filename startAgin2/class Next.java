
import java.util.Scanner;

class Next {

    public static void main(String[] args) {
        System.out.println("Hello World");

        for (int i = 0; i < 10; i++) {
            System.out.println("*".repeat(i));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
