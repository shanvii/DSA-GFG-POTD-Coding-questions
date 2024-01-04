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
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.singleElement(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int singleElement(int[] arr, int N) {
        int result = 0;

        // Iterate over all bits
        for (int i = 0; i < 32; i++) {
            // Count the number of set bits at ith position
            int count = 0;
            int mask = (1 << i);

            for (int j = 0; j < N; j++) {
                if ((arr[j] & mask) != 0) {
                    count++;
                }
            }

            // If the count is not a multiple of 3, set the bit in the result
            if (count % 3 != 0) {
                result = result | mask;
            }
        }

        return result;
    }
}
