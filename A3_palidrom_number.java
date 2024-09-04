package programming_challenge;

public class A3_palidrom_number {
	public static void main(String[] args) {
		int num=121;
		int org_num=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 +num%10;
			num=num /10;
			
		}
//		System.out.println(rev);
		
		if(org_num==rev) {
			System.out.println(org_num +" palidrome number ");
		}
		else {
			System.out.println(org_num +" Not palidrome number ");
		}
	}

}
