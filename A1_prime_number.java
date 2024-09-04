package programming_challenge;

public class A1_prime_number {
	public static void main(String[] args) {
		
		int num = 4;
        int count = 0;
        
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("This is a prime number: " + num);
            } else {
                System.out.println("Not a prime number: " +num);
            }
        } else {
            System.out.println("Not a prime number");
        }
		
	}

}
