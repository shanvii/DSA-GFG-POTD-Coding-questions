<h2>Largest rectangular sub-matrix whose sum is 0</h2>

https://www.geeksforgeeks.org/problems/largest-rectangular-sub-matrix-whose-sum-is-0/1

Given a matrix mat[][] of size N x M. The task is to find the largest rectangular sub-matrix by area whose sum is 0.

If there are multiple solutions return the rectangle which starts from minimum column index. If you still have multiple solutions return the one having greatest row number. If no such matrix is present return a zero (0) size matrix.

<h3>Example 1:</h3>

**Input:** <br/> 
N = 3, M = 3  <br/>
mat[][] =  1, 2, 3  <br/>
          -3,-2,-1  <br/>
           1, 7, 5  <br/>

**Output:**  <br/>
1, 2, 3  <br/>
-3,-2,-1  <br/>

**Explanation:** This is the largest sub-matrix, whose sum is 0.  <br/>


<h3>Example 2:</h3>

**Input:**  <br/> 
N = 4, M = 4  <br/>
mat[][] = 9, 7, 16, 5  <br/>
          1,-6,-7, 3  <br/>
          1, 8, 7, 9  <br/>
          7, -2, 0, 10  <br/>

 **Output:**  <br/>
 -6,-7  <br/>
  8, 7  <br/>
  -2, 0   <br/>


**Your Task:**  <br/>
You don't need to read input or print anything. You just have to complete the function sumZeroMatrix() which takes a 2D matrix mat[][], its dimensions N and M as inputs and returns a largest sub-matrix, whose sum is 0.  <br/>

Expected Time Complexity: O(N*M*M).  <br/>
Expected Auxiliary Space: O(N*M).  <br/>


**Constraints:**  <br/>
1 <= N, M <= 100  <br/>
-1000 <= mat[][] <= 1000
 
