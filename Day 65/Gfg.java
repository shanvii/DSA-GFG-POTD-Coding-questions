//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            
            int gallery[] = new int[n];
            for(int i=0; i<n; i++)
                gallery[i] = Integer.parseInt(s[i]);
            Solution T = new Solution();
            out.println(T.min_sprinklers(gallery,n));
        }
		out.close();
		
	}
}





// } Driver Code Ends



class Solution {
    int min_sprinklers(int gallery[], int n) {
        ArrayList<int[]> range = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (gallery[i] != -1)
                range.add(new int[]{Math.max(0, i - gallery[i]), Math.min(n - 1, i + gallery[i])});
        }

        range.sort(Comparator.comparingInt(a -> a[0]));

        int x = 0, ans = 0, i = 0, cur = 0;

        while (x <= n - 1) {
            cur = Integer.MIN_VALUE;
            while (i < range.size() && range.get(i)[0] <= x) {
                cur = Math.max(cur, range.get(i)[1]);
                i++;
            }

            if (cur == Integer.MIN_VALUE)
                return -1;

            ans++;
            x = cur + 1;
        }

        return ans;
    }
}
