/*
 * case 2:
 * java pwskill => pwskill java
 */

package placement_code;

import java.util.*;

public class A2_Reverse_String_case2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str1=sc.nextLine();
		String str2="";
		
		String arr[]=str1.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			str2=str2 + arr[i]+ " ";
		}
		System.out.println(str2);
	}
	
	

}
