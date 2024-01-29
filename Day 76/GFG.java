//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.TotalCount(str);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution
{
    final int mod = 100;
    int dp[][];
    
    int solve(int ind,int prev,String str){
       if(ind >= str.length()){
            return 1;
       }
       if(dp[ind][prev] != -1) return dp[ind][prev];
       int sum = 0,res = 0;
       for(int i= ind; i < str.length(); i++){
           sum += (str.charAt(i) - '0');
           if(sum >= prev){
              res += solve(i + 1,sum,str);
           }
       }
       return dp[ind][prev] = res;
    }
    public int TotalCount(String str)
    {
        // Code here
        dp =  new int[mod+1][9*mod + 1];
        for(int i= 0; i <= mod; i++){
             Arrays.fill(dp[i],-1);
        }
        return solve(0,0,str);
    }
}
