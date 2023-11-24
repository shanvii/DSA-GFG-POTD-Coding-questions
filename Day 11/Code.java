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

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> result = new ArrayList<>();
        result.add(1L); // First element is always 1
        
        for (int i = 1; i < n; i++) {
            ArrayList<Long> newRow = new ArrayList<>();
            newRow.add(1L); // First element of each row is 1

            for (int j = 1; j < result.size(); j++) {
                long prevVal = result.get(j - 1);
                long currVal = result.get(j);
                newRow.add((prevVal + currVal) % 1000000007);
            }
            
            newRow.add(1L); // Last element of each row is 1
            result = newRow; // Update the result with the newly calculated row
        }
        
        return result;
    }
}
