
package classandobjecttestnet;

import geomatry.Circle;
import math.MaxMin;
import math.PrimeNumber;


public class ClassAndObjectTestNet {

    

    public static void main(String[] args) {
       
        Circle circle = new Circle(5);
        PrimeNumber prime = new PrimeNumber(11);
        MaxMin maxMin = new MaxMin(80, 450, 56);
        MaxMin minMax = new MaxMin();
        minMax.num1=140;
        minMax.num2=350;
        minMax.num3=405;
        System.out.println("MaxNumber = "+minMax.findmaxNumber());
        System.out.println("MinNumber = "+minMax.findminNumber());
        System.out.println("MaxNumber = "+maxMin.findmaxNumber());
        System.out.println("MinNumber = "+maxMin.findminNumber());
        String massage = prime.checkPrimenumber();
//        boolean massage = prime.checkPrimenumber();
        
//        if(massage){
//            System.out.println("Its prime number");
//        }
//        else{
//            System.out.println("Its not a prime number");
//        }
        
        circle.getArea();
        circle.getPerimetar();
        circle.setRedious(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimetar());
//        System.out.println(prime.checkPrimenumber());
        System.out.println(massage);
    }
    
}
