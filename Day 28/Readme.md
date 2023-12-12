<h2>Gold Mine Problem</h2>

https://www.geeksforgeeks.org/problems/gold-mine-problem2608/1

Given a gold mine called M of (n x m) dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons. Initially the miner can start from any row in the first column. From a given cell, the miner can move
 <br>
to the cell diagonally up towards the right  <br>
to the right <br>
to the cell diagonally down towards the right <br>
Find out maximum amount of gold which he can collect until he can no longer move. <br>

<h2>Example 1:</h2> <br>

**Input:** n = 3, m = 3
M = {{1, 3, 3}, <br>
     {2, 1, 4}, <br>
     {0, 6, 4}}; <br>
     
**Output:** 12 <br>

**Explaination:**  <br>
The path is {(1,0) -> (2,1) -> (2,2)}. <br>

<h3>Example 2:</h3> <br>

**Input:** n = 4, m = 4 <br>
M = {{1, 3, 1, 5}, <br>
     {2, 2, 4, 1}, <br>
     {5, 0, 2, 3}, <br>
     {0, 6, 1, 2}}; <br>
     
**Output:** 16 <br>

**Explaination:** 
The path is {(2,0) -> (3,1) -> (2,2)  <br>
-> (2,3)} or {(2,0) -> (1,1) -> (1,2)  <br>
-> (0,3)}. <br>

**Your Task:** <br>
You do not need to read input or print anything. Your task is to complete the function maxGold() which takes the values n, m and the mine represented as a 2D array of positive integeres M as input parameters and returns the maximum amount of gold that can be collected.
 <br>
Expected Time Complexity: O(n*m) <br>
Expected Auxiliary Space: O(n*m) <br>

Constraints: <br>
1 ≤ n, m ≤ 500 <br>
0 ≤ M[i][j] ≤ 100
