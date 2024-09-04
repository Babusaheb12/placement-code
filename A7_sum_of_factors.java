package programming_challenge;

import java.util.Scanner;

public class A7_sum_of_factors {
	public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of factors
        int sum = calculateSumOfFactors(number);

        // Display the result
        System.out.println("The sum of factors of " + number + " is: " + sum);
    }

    // Method to calculate the sum of factors
    public static int calculateSumOfFactors(int number) {
        int sum = 0;

        // Loop through all numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of number
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
	}
	}


