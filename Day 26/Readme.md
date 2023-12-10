<h2>Subarray with 0 sum</h2>

https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

Given an array of integers. Find if there is a subarray (of size at-least one) with 0 sum. You just need to return true/false depending upon whether there is a subarray present with 0-sum or not. Printing will be taken care by the driver code.
 <br>
<h3>Example 1:</h3> <br>

**Input:** <br>
n = 5 <br>
arr = {4,2,-3,1,6} <br>

**Output:** <br> 
Yes <br>

**Explanation:** <br> 
2, -3, 1 is the subarray with sum 0. <br>

<h3>Example 2:</h3> <br>

**Input:** <br>
n = 5 <br>
arr = {4,2,0,1,6} <br>

**Output:** <br> 
Yes <br>

Explanation:  <br>
0 is one of the element in the array so there exist a subarray with sum 0. <br>

**Your Task:** <br>
You only need to complete the function subArrayExists() that takes array and n as parameters and returns true or false. <br>

Expected Time Complexity: O(n). <br>
Expected Auxiliary Space: O(n). <br>

Constraints: <br>
1 <= n <= 10^4 <br>
-105 <= a[i] <= 10^5
