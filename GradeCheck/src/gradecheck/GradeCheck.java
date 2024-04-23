
package gradecheck;

import java.util.Scanner;

public class GradeCheck {

    public static void main(String[] args) {
      
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your marks");
        int mark = input.nextInt();
        
       String grade ="";
       
       if(mark<0){
           
           grade ="Mark should be in a positive number ";
       }
       
       else if(mark<=32){
           
           grade = "F";
           
       }
       else if(mark<=39){
           
           grade = "D";
           
       }
       else if(mark<=49){
           
           grade = "C";
           
       }
       else if(mark<=59){
           
           grade = "B";
           
       }
       else if(mark<=69){
           
           grade = "A-";
           
       }
       else if(mark<=79){
           
           grade = "A";
           
       }
       else if(mark<=89){
           
           grade = "A+";
           
       }
       
          else if(mark<=100){
           
           grade = "GA+";
           
       }
       
          else if(mark>100){
           
           grade = "invalid mark";
           
       }
        
       
        System.out.println(grade);
    }
    
}
