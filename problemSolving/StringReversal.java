import java.util.Scanner;  

public class StringReversal {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        // Prompt the user for input  
        System.out.print("Enter a string to reverse: ");  
        String inputString = scanner.nextLine();  

        // Reverse the string using a for loop  
        String reversedString = reverseString(inputString);  

        // Output the result  
        System.out.println("Reversed string: " + reversedString);  

        scanner.close();  
    }  

    // Method to reverse a string using a for loop  
    private static String reverseString(String str) {  
        StringBuilder reversed = new StringBuilder();  

        // Iterate over the string in reverse order  
        for (int i = str.length() - 1; i >= 0; i--) {  
            reversed.append(str.charAt(i)); // Append each character to the StringBuilder  
        }  

        return reversed.toString(); // Convert StringBuilder to String and return it  
    }  
}  