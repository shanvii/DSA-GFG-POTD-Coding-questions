//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        final int MOD = 1000000007;
        long[] endingWith0 = new long[n];
        long[] endingWith1 = new long[n];

        endingWith0[0] = 1;
        endingWith1[0] = 1;

        for (int i = 1; i < n; i++) {
            endingWith0[i] = (endingWith0[i - 1] + endingWith1[i - 1]) % MOD;
            endingWith1[i] = endingWith0[i - 1];
        }

        return (endingWith0[n - 1] + endingWith1[n - 1]) % MOD;
    }
}
