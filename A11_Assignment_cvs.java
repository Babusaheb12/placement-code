package placement_code;
import java.util.Scanner;

public class A11_Assignment_cvs {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowels = 0, consonants = 0, specialCharacters = 0;
        
        // Convert the input string to lower case to handle case-insensitive comparisons
        String lowerCaseInput = input.toLowerCase();
        
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') 
            {  // Check if the character is a letter
            	
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                {
                	System.out.print(" "+ ch);
                	System.out.println();
                    vowels++;
                } else {
                	
                    consonants++;
                }
            } else if ((ch >= '0' && ch <= '9') || ch == ' ') 
            {
                // Do nothing for digits and spaces
            	
            } else {
                specialCharacters++;
            }
        }
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of special characters: " + specialCharacters);
    }

}
