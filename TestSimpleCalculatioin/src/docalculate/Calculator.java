
package docalculate;

public class Calculator {

    private float par;
    private float par1;
    private int par2;

    public Calculator(int par, int par1, int par2) {
    }
    
    public  float doCalculation(int calculator){
        
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        int choice = input.nextInt();
        
      this.par=number1;
       this.par1= number2;
       this.par2 =choice;

        float result =0;

        switch (choice) {
            case 1 -> result = number1 + number2;
            case 2 -> result = number1 - number2;
            case 3 -> result = number1 * number2;
            case 4 -> result = number1 / number2;
            default -> System.out.println("Invalid Choice");

        }

        System.out.println("Resault is" + result);

    
    
    
    return result;
    }
}
