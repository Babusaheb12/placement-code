package programming_challenge;
import java.util.*;

public class A9_strong_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Strong number");
		int n= sc.nextInt();		
//		int n=145;
		int num=n;
		int d=0;
		int sum=0;
		
		
		while(n>0) {
			int f=1;
			d=n %10;
			for(int i=1; i<=d;i++) {
				f=f*i;
			}
			sum=sum+f;
			n=n/10;
			
		}
		
		if(num==sum) {
			System.out.println("strong number");
		}else {
			System.out.println("Not  strong number");
		}
	}

}
