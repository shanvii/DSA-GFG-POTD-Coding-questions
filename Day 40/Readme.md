<h2>Buy Maximum Stocks if i stocks can be bought on i-th day</h2>

https://www.geeksforgeeks.org/problems/buy-maximum-stocks-if-i-stocks-can-be-bought-on-i-th-day/1

In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where price[i] denotes the price of the stock on the ith day. <br>
There is a rule that a customer can buy at most i stock on the ith day. <br>
If the customer has an amount of k amount of money initially. The task is to find out the maximum number of stocks a customer can buy.  <br>

<h3>Example 1:</h3> <br>

**Input:** <br>
price = [10,7,19] <br>
k = 45 <br>

**Output:** <br> 
4 <br>

Explanation:  <br>
A customer purchases 1 stock on day 1, 2 stocks on day 2 and 1 stock on day 3 for 10, 7 * 2 = 14 and 19 respectively. Hence, total amount is 10 + 14 + 19 = 43 and number of stocks purchased is 4. <br>

<h3>Example 2:</h3> <br>

**Input:** <br> 
price = [7,10,4] <br>
k = 100 <br>

**Output:**  <br>
6 <br>
Explanation: <br>
Buy on all 3 days. <br>

**Your Task:** <br>  
You don't need to read input or print anything. Your task is to complete the function buyMaximumProducts() which takes an array price and an integer k and returns an integer as output. <br>

Expected Time Complexity: O(NlogN) <br>
Expected Auxiliary Space: O(N) <br>

Constraints: <br>
1 <= N <= 10^4 <br>
1 <= price[i] <= 10^4 <br>
1 <= k <= 10^4 <br>

![Screenshot (417)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/96b5f016-9f16-4581-ad29-478de89c2f38)
