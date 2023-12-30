//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    // Function to return the name of the candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
        Map<String, Integer> votesMap = new HashMap<>();

        for (String candidate : arr) {
            votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
        }

        String winner = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votesMap.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();

            if (votes > maxVotes || (votes == maxVotes && candidate.compareTo(winner) < 0)) {
                winner = candidate;
                maxVotes = votes;
            }
        }

        String[] result = new String[2];
        result[0] = winner;
        result[1] = Integer.toString(maxVotes);
        return result;
    }
}
