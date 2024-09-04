package placement_code;

public class AAA_check {
    // This function returns the value of a Roman symbol
    int value(char r) {
        switch (r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    // Finds the decimal value of a given Roman numeral
    int romanToDecimal(String str) {
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));

            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                if (s1 >= s2) {
                    res += s1;
                } else {
                    res += s2 - s1;
                    i++;
                }
            } else {
                res += s1;
            }
        }

        return res;
    }

    // Driver Code
    public static void main(String args[]) {
        AAA_check ob = new AAA_check();

        // Considering inputs given are valid
        String str = "MCMIV";
        System.out.println("Integer form of Roman Numeral " + str + " is " + ob.romanToDecimal(str));
    }
}
