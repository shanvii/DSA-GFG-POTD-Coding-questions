## Geekina Hate 1s

https://www.geeksforgeeks.org/problems/geekina-hate-1s/1

It is a universal fact that Geekina hates 1s however it is also known that Geekina loves the integers having atmost k 1s (set-bits) in their binary representation. 
 <br>
Geekina demanded nth such non-negative number from Geek, and being a good friend of Geek, now it's your responsibility to tell him that number.
 <br>
Note: The test cases are generated such that the answer always exists and will fit in the 64-bit data type.
 <br>
### Example 1: <br>

**Input:** <br>
n = 5 <br>
k = 1 <br>
**Output:** <br>
8 <br>
**Explanation:** <br>
Following numbers are loved by Geekina - <br>
0 = (0)2 <br>
1 = (1)2 <br>
2 = (10)2 <br>
4 = (100)2 <br>
8 = (1000)2 <br>

### Example 2: <br>

**Input:** <br>
n = 6 <br>
k = 2 <br>

**Output:** <br>
5 <br>

**Explanation:** <br>
Following numbers are loved by Geekina - <br>
0 = (0)2 <br>
1 = (1)2 <br>
2 = (10)2 <br>
3 = (11)2 <br>
4 = (100)2 <br>
5 = (101)2 <br>

**Your Task:** <br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function `findNthNumer()` that takes `n` and `k` as input parameters. Return the nth number having at most k set-bits.

Expected Time Complexity: O(k*log(n) + constant) <br>
Expected Auxiliary Space: O(k*log(n) + constant) <br>

Constraints: <br>
1 <= n <= 10^9 <br>
1 <= k <= 63 <br>

![Screenshot (488)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/87c22e1c-0f16-4509-9a82-882ac34264e0)
