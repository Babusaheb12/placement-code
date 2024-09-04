package programming_challenge;

public class A2_factorial_number {
	public static void main(String[] args) {
		
		int num=3;
		long factorial=1;
		
		for(int i=1; i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of a number is: " +factorial);
	}

}
