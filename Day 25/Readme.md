<h2>Smith Number</h2>

https://www.geeksforgeeks.org/problems/smith-number4132/1

Given a number n, the task is to find out whether this number is a Smith number or not. A Smith number is a composite number whose sum of digits is equal to the sum of digits of its prime factors.
 <br>
### Example 1: <br>
 
**Input:** <br>
n = 4 <br>

**Output:** <br>
1 <br>

**Explanation:** <br>
The sum of the digits of 4 is 4, and the sum of the digits of its prime factors is 2 + 2 = 4. <br>

### Example 2: <br>

**Input:** <br>
n = 378 <br>

**Output:** <br>
1 <br>

Explanation: <br>
378 = 21*33*71 is a Smith number since 3+7+8 = 2*1+3*3+7*1. <br>

**Your Task:** <br>
You don't need to read input or print anything. Your task is to complete the function smithNum() which takes an Integer n as input and returns the answer. <br>

Expected Time Complexity: O(n * log(n)) <br>
Expected Auxiliary Space: O(n) <br>

Constraints: <br>
1 <= n <= 10^5
