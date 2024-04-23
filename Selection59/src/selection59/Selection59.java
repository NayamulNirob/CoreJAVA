/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection59;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Selection59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(10>=10);
        
        
        
        Scanner scanner = new Scanner(System.in) ;   
        int maxNumber =0;
        
         System.out.println("Enter first Number");
        int firstNumber = scanner.nextInt();
    
        System.out.println("Enter secend Number");
        int secendNumber = scanner.nextInt();
    
        System.out.println("Enter third Number");
        int thirdNumber = scanner.nextInt();
        
        if(firstNumber>secendNumber && firstNumber>thirdNumber
               )
        {maxNumber =firstNumber;}
        
          else if(secendNumber>firstNumber && secendNumber >thirdNumber
               )
        {maxNumber =secendNumber;}
        
          else 
        {maxNumber =thirdNumber;}
        
        System.out.println("Max number is :"+maxNumber);
    }
       
    
    
    
}
