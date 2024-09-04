package placement_code;

public class A9_Assignment_unique_character {
	 public static boolean hasAllUniqueCharacters(String str) {
	        // If the string length is greater than 256, there must be a repeated character
	        if (str.length() > 256) {
	            return false;
	        }

	        // Boolean array to keep track of characters
	        boolean[] charSet = new boolean[256];

	        // Traverse the string
	        for (int i = 0; i < str.length(); i++) {
	            int val = str.charAt(i);
	            if (charSet[val]) { // Character already found in string
	                return false;
	            }
	            charSet[val] = true;
	        }

	        // All characters are unique
	        return true;
	    }

	public static void main(String[] args) {
		String testString = "programming";

        if (hasAllUniqueCharacters(testString)) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }

}
}
