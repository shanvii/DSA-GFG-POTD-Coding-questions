

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.isRepresentingBST(arr, N));
        }
    }
}

class Solution {
    int prev = Integer.MIN_VALUE;
    int isRepresentingBST(int arr[], int N) {
        for (int i = 0; i < N; i++) {
            if (arr[i] <= prev) {
                return 0;
            }
            prev = arr[i];
        }
        return 1;
    }
}
