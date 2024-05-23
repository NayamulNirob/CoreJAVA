
package testclassandobj;

import geometry021.Circle;
import math1.MaxMinNumber;
import math1.PrimeNumber_01;


public class TestClassAndObj {

   
    public static void main(String[] args) {
       
        Circle circle =new Circle(5);
        
        double area = circle.getArea();
        double perimeter = circle.getPerimetar();
        
        System.out.println(area);
        System.out.println(perimeter);
        
        
        PrimeNumber_01 pn = new PrimeNumber_01(11);
        String result= pn.prime();
        System.out.println(result);
        
        MaxMinNumber maxMinNumber = new MaxMinNumber(20, 40, 60);
        System.out.println( maxMinNumber.findMax());
        System.out.println(maxMinNumber.findMin());
        
    }
    
}
