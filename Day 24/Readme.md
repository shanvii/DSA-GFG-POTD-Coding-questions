<h2>Transform to prime</h2>

https://www.geeksforgeeks.org/problems/transform-to-prime4635/1

Given an array of n integers. Find the minimum non-negative number to be inserted in array, so that sum of all elements of array becomes prime. <br>

<h3>Example 1:</h3> <br>

**Input:** <br>
N=5 <br>
arr = {2, 4, 6, 8, 12} <br>

**Output:** <br>  
5 <br>

Explanation:  <br>
The sum of the array is 32 ,we can add 5 to this to make it 37 which is a prime number. <br>

<h3>Example 2:</h3> <br>

**Input:** <br>
N=3 <br>
arr = {1, 5, 7} <br>

**Output:** <br>  
0  <br>

Explanation:  <br>
The sum of the array is 13 which is already prime. <br>

**Your Task:** <br>
You don't need to read input or print anything. Your task is to complete the function minNumber() that takes array arr and integer N as input parameters and returns the minimum positive number to be inserted in the array so as to make it's sum a prime number.
 <br>
Expected Time Complexity: O(N log(log N)) <br>
Expected Auxiliary Space: O(1). <br>

Constraints: <br>
1 ≤ N ≤ 105 <br>
1 ≤ sum of all elements ≤ 106 

