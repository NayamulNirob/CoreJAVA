
package vawelorconsonent;

import java.util.Scanner;


public class VawelOrConsonent {

    public static void main(String[] args) {
     
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your word");
        
        String word = scanner.nextLine().toUpperCase();
    
          char firstLetter = word.charAt(0);
        
        if(firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I' || firstLetter == 'O' || firstLetter == 'U'){
            System.out.println("The word starts with a vowel");
        } else {
            System.out.println("The word starts with a consonant");
        }
        
        
    }
    
}
