//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends




class Solution {
    public static long sumOfPowers(long a, long b) {
        long mod = 1000000007;
        long result = 0;

        for (long i = a; i <= b; i++) {
            result = (result + primeFactorizationSum(i)) % mod;
        }

        return result;
    }

    private static long primeFactorizationSum(long n) {
        long sum = 0;

        // Count the number of 2s that divide n
        while (n % 2 == 0) {
            sum++;
            n /= 2;
        }

        // n must be odd at this point, so a skip of 2 ( i = i + 2) can be used
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                sum++;
                n /= i;
            }
        }

        // If n is a prime greater than 2
        if (n > 2) {
            sum++;
        }

        return sum;
    }
}
