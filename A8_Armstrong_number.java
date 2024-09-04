package programming_challenge;

public class A8_Armstrong_number {
	public static void main(String[] args) {
		int n=154;
		int temp=n;
		int r;
		int sum=0;
		
		while(n>0) {
			r= n %10;
			n= n /10;
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("its an armstrong number");
		}else {
			System.out.println("not armstrong number");
		}
	}

}
