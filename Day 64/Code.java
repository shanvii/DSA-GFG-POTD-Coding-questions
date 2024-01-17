//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0; i<n; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> res = ob.uniquePerms(arr,n);
            for(int i=0; i<res.size(); i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        // Create a result list to store unique permutations
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        // Sort the input array to handle duplicates in a systematic way
        Collections.sort(arr);
        
        // Create a boolean array to track whether an element has been used in the current permutation
        boolean[] used = new boolean[n];
        
        // Perform backtracking to generate permutations
        generatePermutations(arr, n, new ArrayList<>(), used, result);
        
        return result;
    }
    
    static void generatePermutations(ArrayList<Integer> arr, int n, ArrayList<Integer> current, boolean[] used, ArrayList<ArrayList<Integer>> result) {
        // If the current permutation has reached the required size, add it to the result
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = 0; i < n; i++) {
            // Skip the element if it has been used or if it's a duplicate and the previous instance is not used
            if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1])) {
                continue;
            }
            
            // Mark the element as used
            used[i] = true;
            
            // Add the current element to the permutation
            current.add(arr.get(i));
            
            // Recursively generate permutations with the current element added
            generatePermutations(arr, n, current, used, result);
            
            // Backtrack: remove the last added element and mark it as unused
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
