package placement_code;
import java.lang.reflect.Array;
import java.util.*;

public class A5_Anagram_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str1=sc.nextLine();
		System.out.println("enter a second String");
		String str2=sc.nextLine();
		
//		remove space
		
		str1=str1.replace(" ", "");
		str2=str2.replace(" ", "");
		
//		convert uppercase to lowercase
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
//		store an array
		
		char []ar1=str1.toCharArray();
		char []ar2=str2.toCharArray();
		

//		 array sort.
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1, ar2)) {
			System.out.println("this is an anagram");
		}else {
			System.out.println("not a anagram");
		}
	}

}
