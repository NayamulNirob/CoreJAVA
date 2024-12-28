
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

    String day = switch (n) {

            case 1 -> ("Sunday"); 
            case 2 -> ("Monday");
            case 3 -> ("Tuesday");
            case 4 -> ("Wednesday");
            case 5 -> ("Thusday");
            case 6 -> ("Friday");
            case 7 -> ("Saturday");  
            default -> ("Invalid Day");  

        };
        System.out.println("Day is: "+day);

    }
}