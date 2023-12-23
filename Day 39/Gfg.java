//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find all elements in the array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) {
        // Calculate the threshold frequency.
        int threshold = n / k;

        // Create a HashMap to store the frequency of each element.
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and update the frequency of each element in the HashMap.
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        // Count the elements that appear more than n/k times.
        int count = 0;
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > threshold) {
                count++;
            }
        }

        return count;
    }
}
