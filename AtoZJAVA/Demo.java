
import java.util.Scanner;



class Demo {
    public static void main(String[] args) {
        // double a=5.5;
        // double b=5.6;

        // boolean result= a==b;

        // System.out.println("Result is: "+result);

      Scanner sc= new Scanner(System.in);
        System.err.println("Enter a value for Swich Between 1 To 7");
      int n= sc.nextInt();

        switch(n){

            case 1 -> System.out.println("Sunday");
            case 2 -> System.err.println("Monday");
            case 3 -> System.err.println("Tuesday");
            case 4 -> System.err.println("Wednesday");
            case 5 -> System.err.println("Thusday");
            case 6 -> System.err.println("Friday");
            case 7 -> System.err.println("Saturday");    

        }

    }
}