//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // Create an array to store the quantity of each stock
        int[] quantity = new int[n];

        // Initialize the array with indices (days)
        for (int i = 0; i < n; i++) {
            quantity[i] = i + 1;
        }

        // Sort the arrays based on stock prices using a custom sorting logic
        customSort(price, quantity, n);

        int totalStocks = 0;

        // Iterate through the sorted array and buy stocks as much as possible
        for (int i = 0; i < n; i++) {
            int stockPrice = price[i];
            int stockDay = quantity[i];

            // Calculate the maximum number of stocks that can be bought on this day
            int maxStocksOnDay = Math.min(stockDay, k / stockPrice);

            // Buy the stocks and update the remaining money
            totalStocks += maxStocksOnDay;
            k -= maxStocksOnDay * stockPrice;
        }

        return totalStocks;
    }

    // Custom sorting logic to sort the arrays based on stock prices
    private static void customSort(int[] price, int[] quantity, int n) {
        // Create an array of Pair to store both price and quantity
        int[][] pairs = new int[n][2];

        // Populate the array with price and quantity
        for (int i = 0; i < n; i++) {
            pairs[i][0] = price[i];
            pairs[i][1] = quantity[i];
        }

        // Sort the array based on price in ascending order
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        // Update the original arrays with sorted values
        for (int i = 0; i < n; i++) {
            price[i] = pairs[i][0];
            quantity[i] = pairs[i][1];
        }
    }
}
