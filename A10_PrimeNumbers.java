package programming_challenge;

public class A10_PrimeNumbers {
	 public static void main(String[] args) {
		 
	        System.out.println("Prime numbers between 1 and 100 are:");

	        for (int i = 1; i <= 100; i++) {
	        	
	            if (isPrime(i)) {
	            	
	                System.out.print(i + " ");
	            }
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	        // 1 is not a prime number
	        if (number <= 1) {
	            return false;
	        }

	        // Check from 2 to number - 1
	        for (int i = 2; i < number; i++) {
	            if (number % i == 0) {
	                return false; // If divisible by any number, it's not prime
	            }
	        }

	        return true; // If no divisors found, it's prime
	    }
}
