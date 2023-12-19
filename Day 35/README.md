<h2>Rightmost different bit</h2>

https://www.geeksforgeeks.org/problems/rightmost-different-bit-1587115621/1

Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both M and N are the same then return -1 in this case.
 <br>
<h3>Example 1:</h3> <br> 

**Input:** <br> 
M = 11, N = 9 <br>

**Output:** 
2
Explanation: 
Binary representation of the given numbers are: 1011 and 1001, 2nd bit from right is different.

<h3>Example 2:</h3>

**Input:** <br> 
M = 52, N = 4 <br>

**Output:** <br> 
5 <br>

Explanation:  <br>
Binary representation of the given numbers are: 110100 and 0100, 5th-bit from right is different. <br>

**User Task:** <br>
The task is to complete the function posOfRightMostDiffBit() which takes two arguments M and N and returns the position of first different bits in M and N from right. If both m and n are the same then return -1 in this case.
 <br>
Expected Time Complexity: O(max(log M, log N)). <br>
Expected Auxiliary Space: O(1). <br>

Constraints: <br>
0 <= M, N <= 10^9

![Screenshot (395)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/cef69708-5fd4-4b37-8cda-b0ed79668c11)

