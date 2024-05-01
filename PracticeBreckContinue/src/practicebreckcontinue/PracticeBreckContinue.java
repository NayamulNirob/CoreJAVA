/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */ 
package practicebreckcontinue;

import java.util.Scanner;

/**
 *
 * @author nayam
 */
public class PracticeBreckContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int sum =0;
        
        while (true) {   
              System.out.println("Enter a value");
        int num = input.nextInt();
            
            sum+=num;
            
            
            if(sum>=100){
            
                System.out.println("sum"+sum);
                break;
            }
            
            num++;
        }
    }
    
}
