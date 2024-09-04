package placement_code;

public class A6_panagram {
	public static void main(String[] args) {
		boolean flag=false;
		String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
		
//		remove the space
		str=str.replace(" ","");
//		convert in uppercase.
		str=str.toUpperCase();
//		convert a String in character or store ch cointainner.
		char []ch=str.toCharArray();
		
//		create a dynamic memory in length in 26.
		int ar[]=new int[26];
		
		
		for(int i=0;i<ch.length;i++) {

			ar[ch[i]-65]++;
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				System.out.println("this is not a palidrom");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("its palidrom");
		}
		
		
		
		}

}
