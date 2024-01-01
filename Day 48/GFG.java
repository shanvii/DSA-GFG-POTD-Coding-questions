//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean canPair(int[] nums, int k) {
        if(nums.length % 2 != 0) return false; // If the number of elements is odd, can't form pairs
        
        Map<Integer, Integer> remainders = new HashMap<>();
        
        // Count the frequency of remainders
        for(int num : nums) {
            int remainder = num % k;
            remainders.put(remainder, remainders.getOrDefault(remainder, 0) + 1);
        }
        
        // Traverse the array again and check if pairs can be formed
        for(int num : nums) {
            int remainder = num % k;
            
            if(2 * remainder == k) {
                if(remainders.getOrDefault(remainder, 0) % 2 != 0)
                    return false;
            } else if(remainder == 0) {
                if(remainders.getOrDefault(remainder, 0) % 2 != 0)
                    return false;
            } else {
                if(remainders.getOrDefault(remainder, 0) != remainders.getOrDefault(k - remainder, 0))
                    return false;
            }
        }
        
        return true;
    }
}
