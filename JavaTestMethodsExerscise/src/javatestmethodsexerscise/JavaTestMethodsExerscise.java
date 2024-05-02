
package javatestmethodsexerscise;


public class JavaTestMethodsExerscise {
    
//1. Write a Java method to find the smallest number among four numbers.
//Test Data:
//Input the first number: 25
//Input the Second number:37
//Input the third number: 29
//Input the forth number: 45
//Expected Output:
//
//The smallest value is 25.0

    
    public static void main(String[] args) {
      
        
        System.out.println("the smallest value is "+ doMin( 25,37,29,45));
        System.out.println("The Avarage value is:"+doAvg(25, 45, 65));
        
    }
    
    public static double doMin(double num1,double num2,double num3,double num4){
    
    double result = Math.min(Math.min(num1,num2),Math.min(num3,num4));
    
    
    
        return (double) result;
        
    }
    
//2. Write a Java method to compute the average of three numbers.
//Test Data:
//Input the first number: 25
//Input the second number: 45
//Input the third number: 65
//Expected Output:
//
//The average value is 45.0
    
    public static double doAvg(int number1,int number2,int number3){
    
    double avarage = (double) (number1+number2+number3)/3;
        return avarage;
        
    
    }


}
