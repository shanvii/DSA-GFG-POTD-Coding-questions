<h2>Game of XOR</h2>

https://www.geeksforgeeks.org/problems/game-of-xor1541/1

Given an array A of size N. The value of an array is denoted by the bit-wise XOR of all elements it contains. Find the bit-wise XOR of the values of all subarrays of A.
 <br>
<h3>Example 1:</h3> <br>

**Input:**  <br>
N = 3  <br>
A = [1,2,3]  <br>

**Output:**  <br>
2 <br>

**Explanation:** <br>
xor[1] = 1 <br>
xor[1, 2] = 3 <br>
xor[2, 3] = 1 <br>
xor[1, 2, 3] = 0 <br>
xor[2] = 2 <br>
xor[3] = 3 <br>

**Result :** 1 ^ 3 ^ 1 ^ 0 ^ 2 ^ 3 = 2

<h3>Example 2:</h3>

**Input:** 
N = 2 <br>
A = [1,2] <br>

**Output:** <br> 
0 <br>

**Explanation:** <br>
xor[1] = 1 <br>
xor[1, 2] = 3 <br>
xor[2] = 2 <br>
Result : 1 ^ 3 ^ 2 = 0 <br>

**Your Task:** <br>
You don't need to read input or print anything. Your task is to complete the function gameOfXor() which takes an integer N and array A[] as input parameters and returns the answer. <br>

Expected Time Complexity: O(N) <br>
Expected Auxiliary Space: O(1) <br>

Constraints: <br>
1 <= N <= 105 <br>
0 <= A[i] <= 109
