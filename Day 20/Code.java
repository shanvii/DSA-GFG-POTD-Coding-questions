//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.isSumString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
// import java.math.BigInteger;
class Solution {
    public int isSumString(String S) {
        int n = S.length();

       
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int index = j;
                String s1 = S.substring(0, i);
                String s2 = S.substring(i, j);

           
                while (index < n) {
                    String sumStr = addStrings(s1, s2);

                    
                    if (!startsWith(S, sumStr, index)) {
                        break;
                    }

                    
                    index += sumStr.length();
                    s1 = s2;
                    s2 = sumStr;
                }

               
                if (index == n) {
                    return 1;
                }
            }
        }

       
        return 0;
    }

    private String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int maxLength = Math.max(num1.length(), num2.length());
        num1 = padZeros(num1, maxLength);
        num2 = padZeros(num2, maxLength);

        for (int i = maxLength - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = num2.charAt(i) - '0';

            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 10);
            carry = sum / 10;
        }

        while (carry > 0) {
            result.insert(0, carry % 10);
            carry /= 10;
        }

        return result.toString();
    }

    private String padZeros(String num, int length) {
        StringBuilder paddedNum = new StringBuilder(num);
        while (paddedNum.length() < length) {
            paddedNum.insert(0, '0');
        }
        return paddedNum.toString();
    }

    private boolean startsWith(String s, String prefix, int startIndex) {
        int prefixLength = prefix.length();
        if (startIndex + prefixLength > s.length()) {
            return false;
        }
        for (int i = 0; i < prefixLength; i++) {
            if (s.charAt(startIndex + i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}




