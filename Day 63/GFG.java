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
            String input_line[] = read.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input_line[0]);
            int n = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numberSequence(m, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static int numberSequence(int m, int n) {
        int MOD = 1000000007;
        int[][] dp = new int[n + 1][m + 1];

        // Base case: There is one way to create a sequence of length 0.
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 1;
        }

        // Dynamic Programming approach to fill the dp array.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If seq[i] = j, then seq[i-1] can be any value from 1 to j/2.
                for (int k = 1; k <= j / 2; k++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][k]) % MOD;
                }
            }
        }

        // Sum up the possibilities for the last element in the sequence.
        int result = 0;
        for (int i = 1; i <= m; i++) {
            result = (result + dp[n - 1][i]) % MOD;
        }

        return result;
    }
}
