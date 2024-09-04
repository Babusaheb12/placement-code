package programming_challenge;
/*
 6 => 1+2+3 = 6
 28 => 1+2+4+7+14 =28
  
 */

public class A5_perfact_number {
	
	public static boolean isperfect(int n) {
		
		int sum=0;
		
		for(int i=1; i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			if(n==sum) {
				return true;
			}
		}
		
		return false;
		
		
	}
	public static void main(String[] args) {
		
		int n=28;
		
		boolean b= isperfect(n);
		if(b) {
			System.out.println("perfact number");
		}
		else {
			System.out.println("not perfact number");
		}
		
	}

}
