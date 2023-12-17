//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return arr[0];
        }

        int inclusive = arr[0];
        int exclusive = 0;

        for (int i = 1; i < n; i++) {
            int temp = inclusive;
            inclusive = Math.max(exclusive + arr[i], inclusive);
            exclusive = Math.max(temp, exclusive);
        }

        return Math.max(inclusive, exclusive);
    }
}
