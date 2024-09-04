package placement_code;
import java.util.*;

public class UppercaseConverter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a lowercase string: ");
        String lowerCaseString = scanner.nextLine();
        
        // Convert to uppercase without using inbuilt method
        
        StringBuilder upperCaseString = new StringBuilder();
        
        for (int i = 0; i < lowerCaseString.length(); i++) {
            char ch = lowerCaseString.charAt(i);
            // Check if the character is lowercase
            
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
            	
                ch = (char) (ch - 32);
            }
            upperCaseString.append(ch);
        }
        
        System.out.println("Uppercase string: " + upperCaseString.toString());
    }
}
