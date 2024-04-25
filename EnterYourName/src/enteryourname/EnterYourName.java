/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enteryourname;

import java.util.Scanner;


public class EnterYourName {

 
    public static void main(String[] args) {
      
        
        Scanner name = new Scanner(System.in);
        
        System.out.println("Enter your name");
        
        String nam = name.nextLine();
        
     
        String massage = String.format("Welcome %s to our sestem", nam);
        
       System.out.println(massage);
        
        
    }
    
}
