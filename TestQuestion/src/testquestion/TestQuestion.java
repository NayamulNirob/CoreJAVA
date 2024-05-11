package testquestion;

public class TestQuestion {

    public static void main(String[] args) {
//        25. What will be the output?

        int i = 1;
        do {
            i--;
        } while (i > 2);
        System.out.println(i);

//        41. What is the output?
        int j = 0;
        for (; j <= 4; j += 2) {
            System.out.print(j + "");

        }
//        43. Given:
        int k = 2, m = 11;
        do {
            if (k > m) {
                break;
            }
            m--;
        } while (++k < 6);
        System.out.println(" k =" + k + " and m = " + m);

//9.What are the values to be printed
        int val = 2;
        switch (val) {
            case 1:
                System.out.print("P");
                break;
            case 2:
                System.out.print("Q");
                break;
            case 3:
                System.out.print("R");
                break;
            case 4:
                System.out.print("S");
                break;
            default:
                System.out.print(val);
        }
//        34.	
                int p = 0;
        while (true) {
            if (p == 4) {
                break;
            }
            ++p;
        }
        System.out.println( "\np ="+p); 

    }
}
