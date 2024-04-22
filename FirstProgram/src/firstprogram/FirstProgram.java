/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprogram;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        Scanner input = new Scanner(System.in);
        
//       System.out.println("Pls enter the value of Radius");
//        int radius = input.nextInt();
//        double area;
//        area = radius*radius*3.1416;
//        System.out.println(area);
        
//        System.out.println("Please enter height");
//        float height = input.nextFloat();
//        System.out.println("Please enter wedth");
//          float  wedht = input.nextFloat();
//        double area;
//        area = height*wedht;
//        System.out.println( "The area of the rectangular "+area);
        

        System.out.print("Please enter num1: ");
        float num1 = input.nextFloat();
        System.out.print("Please enter num2: ");
          float  num2 = input.nextFloat();
          
          System.out.print("Please enter num3: ");
        float num3 = input.nextFloat();
        System.out.print("Please enter num4: ");
          float  num4 = input.nextFloat();
          
        float sum;
        sum = num1+num2+num3+num4;
        System.out.println( "Total SUM of the Numbers : "+sum);
                
        
        

    }
    
}
