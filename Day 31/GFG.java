//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static final int MOD = 1000000007;

    // Function to count the number of ways to reach the Nth point
    static int nthPoint(int n) {
        // Create an array to store the number of ways to reach each point
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1; // There is one way to reach point 0 (starting point)
        dp[1] = 1; // There is one way to reach point 1 (take a step of length 1)

        // Calculate the number of ways for each point from 2 to n
        for (int i = 2; i <= n; i++) {
            // The number of ways to reach the current point is the sum of the ways to reach
            // the previous two points (i-1 and i-2)
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        // Return the number of ways to reach the Nth point
        return dp[n];
    }
}
