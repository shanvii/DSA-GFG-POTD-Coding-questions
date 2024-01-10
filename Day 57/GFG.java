//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k) {
        // Create a HashMap to store the remainder of the cumulative sum until each index
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        
        // Initialize variables for calculation
        int maxLen = 0;
        int sum = 0;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Calculate the cumulative sum
            sum += a[i];
            
            // Calculate the remainder when divided by K (taking care of negative remainders)
            int remainder = ((sum % k) + k) % k;
            
            // If the remainder is 0, update the maxLen to include the subarray from the start
            if (remainder == 0) {
                maxLen = i + 1;
            } else {
                // If the remainder is already in the HashMap, update maxLen
                if (remainderMap.containsKey(remainder)) {
                    maxLen = Math.max(maxLen, i - remainderMap.get(remainder));
                } else {
                    // Store the remainder with its index
                    remainderMap.put(remainder, i);
                }
            }
        }
        return maxLen;
    }
}



//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    int res = obj.longSubarrWthSumDivByK(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}



// } Driver Code Ends
