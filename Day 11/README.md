<h2>Pascal Triangle</h2>

https://www.geeksforgeeks.org/problems/pascal-triangle0652/1

Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.
The elements can be large so return it modulo 109 + 7.

<h3>Example 1:</h3>

**Input:** <br>
N = 4  <br>
**Output:**  <br>
1 3 3 1  <br>
**Explanation:**  <br>
4th row of pascal's triangle is 1 3 3 1.  <br>


<h3>Example 2:</h3>

**Input:**  <br>
N = 5  <br>
**Output:**  <br>
1 4 6 4 1  <br>
**Explanation:**  <br>
5th row of pascal's triangle is 1 4 6 4 1.  <br>


**Your Task:**
Complete the function nthRowOfPascalTriangle() which takes n, as input parameters and returns an array representing the answer. You don't to print answer or take inputs.
<br>

Expected Time Complexity: O(N2) <br>
Expected Auxiliary Space: O(N2) <br>

**Constraints:**  <br>
1 ≤ N ≤ 103
