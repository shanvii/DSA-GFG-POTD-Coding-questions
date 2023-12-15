<h2>Reach the Nth point</h2>

https://www.geeksforgeeks.org/problems/reach-the-nth-point5433/1

There are N points on the road, you can step ahead by 1 or 2 . If you start from a point 0, and can only move from point i to point i+1 after taking a step of length one, find the number of ways you can reach at point N. 
 <br>
<h3>Example 1:</h3> <br>

**Input:** <br> 
N = 4  <br>

**Output:** <br> 
5 <br>

Explanation: Three ways to reach at 4th
point. They are {1, 1, 1, 1}, {1, 1, 2},
{1, 2, 1} {2, 1, 1}, {2, 2}.

<h3>Example 2:</h3>

**Input:** N = 5
 <br>
**Output:** 8 <br>

Explanation: Three ways to reach at 5th <br>
point. They are {1, 1, 1, 1, 1}, <br>
{1, 1, 1, 2}, {1, 1, 2, 1}, {1, 2, 1, 1}, <br>
{2, 1, 1, 1}{1, 2, 2}, {2, 1, 2}, {2, 2, 1} <br>

Your Task: <br>
You don't need to read or print anyhting. Your task is to complete the function nthPoint() which takes N as input parameter and returns the total number of ways modulo 109 + 7 to reach at Nth point.
 <br>
Expected Time Complexity: O(N) <br>
Expected Space Complexity: O(N) <br>

Constraints: <br>
1 ≤ N ≤ 10^5
