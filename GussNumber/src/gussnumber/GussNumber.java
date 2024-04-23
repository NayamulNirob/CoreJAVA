
package gussnumber;

import java.util.Scanner;


public class GussNumber {

 
    public static void main(String[] args) {
        
        Scanner number =new Scanner(System.in);
        
         String grade = "";
        
        System.out.println("Enter the mark here");
        double num =number.nextDouble();
        
        if(num<0){
            grade ="enter a positive number ";
        }
        else if(num<=32 ){
            grade = "F";
        }
        else if(num<=39 ){
            grade = "D";
        }
        else if(num<=49 ){
            grade = "C";
        }
        else if(num<=59 ){
            grade = "B";
        }
        else if(num<=69 ){
            grade = "A-";
        }
        else if(num<=79 ){
            grade = "A";
        }
        else if(num<=100 ){
            grade = "A+";
        }
        
        else {
            grade ="Invalid Number";
        }
        
        System.out.println(grade);
    }
    
}
