/*
   case:1

          "pwJava" = o/p => "avajwp"
 */


package placement_code;
import java.util.*;

public class A1_Reverse_string_case1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str1=sc.nextLine();
		
//		String str1="";
		String str2="";
		
		for(int i=str1.length()-1; i>=0; i--) {
			str2=str2+str1.charAt(i);
			
		}
		System.out.println(str2);
	}

}





//
