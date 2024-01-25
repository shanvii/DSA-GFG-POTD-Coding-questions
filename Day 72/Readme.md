## Shortest Prime Path

https://www.geeksforgeeks.org/problems/shortest-prime-path--141631/1

You are given two four digit prime numbers `num1` and `num2`. Find the distance of the shortest path from `Num1` to `Num2 that can be attained by altering only single digit at a time such that every number that we get after changing a digit is a four digit prime number with no leading zeros.
 <br>
### Example 1: <br>

**Input:** <br>
num1 = 1033  <br>
num2 = 8179 <br>

**Output:** 6 <br>

**Explanation:** <br>
1033 -> 1733 -> 3733 -> 3739 -> 3779 -> 8779 -> 8179. <br>
There are only 6 steps reuired to reach num2 from num1.  <br>
and all the intermediate numbers are 4 digit prime numbers. <br>

### Example 2:
 <br>
 
**Input:** <br>
num1 = 1033  <br>
num2 = 1033 <br>

**Output:** <br>
0 <br>

**Your Task:** <br>  
You don't need to read input or print anything. Your task is to complete the function `solve()` which takes two integers `num1` and `num2` as input parameters and returns the distance of the shortest path from num1 to num2. If it is unreachable then return -1.
 <br>
Expected Time Complexity: O(nlogn) <br>
Expected Auxiliary Space: O(n) <br>

Constraints: <br>
1000<=num1,num2<=9999 <br>
num1 and num2 are prime numbers. <br>

![Screenshot (482)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/593d1903-2a89-4132-846b-2a82f50bb708)
