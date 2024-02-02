//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends



//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	 if(s.charAt(0)<0) return -1;
        boolean isNegative = s.charAt(0) == '-';
        int ans = 0;
        if(!isNegative)  ans = s.charAt(0)-'0';
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            if(c-'0'>=0 && c-'0'<=9){
                int digit = c - '0';
                ans = ans*10 + digit;
            }
            else return -1;
        }
        if(isNegative){
            return ans - 2*ans;
        }
        return ans;
    }
}
