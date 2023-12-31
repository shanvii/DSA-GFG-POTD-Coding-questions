//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
    
    public:
    bool help(int* coins,int i,int sum)
    {
        //base case
        if(i<0)
        {
            if(sum!=0 and (sum%20==0 or sum%24==0 or sum==2024))
            return 1;
            else
            return 0;
        }
        
        if(sum!=0 and (sum%20==0 or sum%24==0 or sum==2024))
        return 1;
        
        //recursive calls
        //small calculation
        bool a=help(coins,i-1,sum);
        if(a)
        return 1;
        
        bool b=help(coins,i-1,sum+coins[i]);
        return b;
    }
    
    int isPossible(int N , int coins[]) 
    {
        return help(coins,N-1,0);
    }
    
};



//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;
        int coins[N];
        for(int i=0 ; i<N ; i++)
            cin>>coins[i];

        Solution ob;
        cout << ob.isPossible(N,coins) << endl;
    }
    return 0;
}
// } Driver Code Ends
