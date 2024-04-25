
package vowelorconsonantcheck;

import java.util.Scanner;


public class VowelOrConsonantCheck {

   
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your letter");
        
        String letter = scanner.nextLine().toUpperCase();
    
          char firstLetter = letter.charAt(0);
        
        if(firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I' || firstLetter == 'O' || firstLetter == 'U'){
            System.out.println("The letter is a vowel");
        } else {
            System.out.println("The letter is a consonant");
        }
        
        
        
        
    }
    
}
