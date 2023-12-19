//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        // If both numbers are the same, return -1.
        if (m == n) {
            return -1;
        }
        
        // Find the XOR of the two numbers.
        int xor = m ^ n;
        
        // Find the position of the rightmost set bit in the XOR.
        int position = 1;
        while ((xor & 1) == 0) {
            xor = xor >> 1;
            position++;
        }
        
        return position;
    }
}
