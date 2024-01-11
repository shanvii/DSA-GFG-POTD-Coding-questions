//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public String removeKdigits(String S, int K){
        int n = S.length();
        int[] v = new int[10];
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && S.charAt(i) < st.peek() && K > 0){
                st.pop();
                K--;
            }
            if(st.isEmpty() && S.charAt(i) == '0'){
                continue;
            }
            st.push(S.charAt(i));
        }
        
        while(!st.isEmpty() && K > 0){
            st.pop();
            K--;
        }
        
        if(st.isEmpty()){
            return "0";
        }
        
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
    
    public static void main(String[] args){
        Solution solution = new Solution();
        String result = solution.removeKdigits("1432219",3);
        System.out.println(result);
    }
    
}
