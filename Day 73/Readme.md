## Fractional Knapsack

https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1

Given weights and values of `N` items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
Note: Unlike 0/1 knapsack, you are allowed to break the item here. 
 <br>
### Example 1: <br>

**Input:** <br>
N = 3, W = 50 <br>
value[] = {60,100,120} <br>
weight[] = {10,20,30} <br>

**Output:** <br>
240.000000 <br>

**Explanation:** <br>
Take the item with value 60 and weight 10, value 100 and weight 20 and split the third item with value 120 and weight 30, to fit it into weight 20. so it becomes (120/30)*20=80, so the total weight becomes 60+100+80.0=240.0
Thus, total maximum value of item we can have is 240.00 from the given capacity of sack.  <br>
### Example 2: <br>

**Input:** <br>
N = 2, W = 50 <br>
value[] = {60,100} <br>
weight[] = {10,20} <br>

**Output:** <br>
160.000000 <br>
**Explanation:** <br>
Take both the items completely, without breaking. <br>
Total maximum value of item we can have is 160.00 from the given capacity of sack. <br>

**Your Task :** <br>
Complete the function fractionalKnapsack() that receives maximum capacity , array of structure/class and size N and returns a double value representing the maximum value in knapsack.
Note: The details of structure/class is defined in the comments above the given function. <br>

Expected Time Complexity : O(NlogN) <br>
Expected Auxilliary Space: O(1) <br>

Constraints: <br>
1 <= N <= 10^5 <br>
1 <= W <= 10^9 <br>
1 <= valuei, weighti <= 10^4 <br>

![Screenshot (484)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/15fe1e96-a17f-4c75-a2d9-b02073719aff)
