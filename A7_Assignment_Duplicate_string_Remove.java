/*
 * 1). wap to remove Duplicates from a String.
 */


package placement_code;

public class A7_Assignment_Duplicate_string_Remove {


	public static void main(String[] args) {
		String str = "programming";
//		StringBuilder used
        StringBuilder str1 = new StringBuilder();
        
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            boolean repeated = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                str1.append(arr[i]);
            }
        }
        System.out.println(str1.toString());
    }
	}


