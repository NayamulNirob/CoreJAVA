package celciustofarenhite;

import java.util.Scanner;

public class CelciusToFarenhite {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the value of Celsius:");

        float celTemp = input.nextFloat();
        
        float result = (celTemp*9/5)+32;
        
        System.out.println("Converted value of Celsius to Fahrenheit is :"+result);
        

    }

}
