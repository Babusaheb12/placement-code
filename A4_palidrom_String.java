package placement_code;

/*
 * abba => abba this is a palidrom.
 * 
 */
import java.util.*;

public class A4_palidrom_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.nextLine();
		String str2="";
		sc.close();
		
		for(int i=str1.length()-1; i>=0; i--) {
			str2=str2 + str1.charAt(i);
		}
		if(str1.equals(str2)) {
			System.out.println("this is a palidrom");
		} else {
			System.out.println("this is not a palidrom");
		}
	}

}
