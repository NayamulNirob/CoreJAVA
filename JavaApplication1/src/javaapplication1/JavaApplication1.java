/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello");
        
        int i=5,j=10;
        double a=6.5,b=7.5;
        
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(("I :")+(++i));
        System.out.println(++i);
        System.out.println(++i+" I");
        
       
        
        System.out.println(j--);
        System.out.println(j--);
        System.out.println(j--);
        System.out.println("J :"+--j);
        System.out.println(--j);
        System.out.println(--j);
        
        double result =i*j;
        System.out.println(result);
        
        double result2 =a*b;
        System.out.println(result2);
        
        int malti=(int)(a*b);
        
        System.out.println(malti);
    }
    
}
