<h2>Painting the Fence
</h2>

https://www.geeksforgeeks.org/problems/painting-the-fence3727/1

Given a fence with n posts and k colors, find out the number of ways of painting the fence so that not more than two consecutive posts have the same colors. Since the answer can be large return it modulo 109 + 7.
 <br>
 
<h3>Example 1:</h3>

**Input:** <br>
n = 3 <br>
k = 2  <br>

**Output:** 6

<h3>Example 2:</h3> <br>

**Input:** <br>
n = 2 <br>
k = 4  <br>

**Output:** 16

Explanation:  <br>
After coloring first post with <br>
4 possible combinations, you can still color <br>
next posts with all 4 colors. Total possible  <br>
combinations will be 4x4=16 <br>

**Your Task:** <br>
Since, this is a function problem. You don't need to take any input or print anything, as it is already accomplished by the driver code. You just need to complete the function countWays() that takes n and k as parameters and returns the number of ways in which the fence can be painted (modulo 109 + 7).
 <br>
Expected Time Complexity: O(N). <br>
Expected Auxiliary Space: O(N). <br>

Constraints: <br>
1 ≤ N ≤ 10^5 <br>
1 ≤ K ≤ 10^5
![Screenshot (387)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/2fb69b37-91f4-46ac-af05-4205b8d9d499)

