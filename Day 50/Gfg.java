//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Initialize variables to track the counts of characters 0, 1, and 2.
        int count0 = 0, count1 = 0, count2 = 0;

        // Initialize variables to track the start and end of the window.
        int start = 0, end = 0;

        // Initialize the result variable to store the length of the smallest substring.
        int result = Integer.MAX_VALUE;

        // Iterate through the string using the end pointer.
        while (end < S.length()) {
            // Update counts based on the character at the end pointer.
            if (S.charAt(end) == '0') count0++;
            else if (S.charAt(end) == '1') count1++;
            else count2++;

            // Check if the current window contains all three characters.
            // If yes, try to minimize the window size by moving the start pointer.
            while (count0 > 0 && count1 > 0 && count2 > 0) {
                // Update result with the current window size.
                result = Math.min(result, end - start + 1);

                // Move the start pointer and update counts accordingly.
                if (S.charAt(start) == '0') count0--;
                else if (S.charAt(start) == '1') count1--;
                else count2--;

                start++;
            }

            // Move the end pointer to expand the window.
            end++;
        }

        // If result is still Integer.MAX_VALUE, no valid substring was found.
        // Return -1 in this case, otherwise return the length of the smallest substring.
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }
}
