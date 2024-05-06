
package testsimplecalculatioin;

import docalculate.Calculator;
import java.util.Scanner;

public class TestSimpleCalculatioin {

    public TestSimpleCalculatioin() {
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculator c = new Calculator(10,20,30);
       
        System.out.println(c);
    }



   
    
}
