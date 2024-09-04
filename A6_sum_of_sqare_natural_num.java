package programming_challenge;

public class A6_sum_of_sqare_natural_num {
	public static void main(String[] args) {
		int num=5;
		int sum=0;
		int sqare=0;
		
		for(int i=1; i<=num; i++) {
			sqare=i*i;
			sum=sum + sqare;
		}
		System.out.println("Sqare of "+num +" is =>" +sqare);
		
		System.out.println("======================");
		
		System.out.println("Sum of Square is => " +sum);
	}

}
