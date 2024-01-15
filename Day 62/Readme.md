## Grinding Geek

https://www.geeksforgeeks.org/problems/grinding-geek/1

GeeksforGeeks has introduced a special offer where you can enroll in any course, and if you manage to complete `90%` of the course within `90` days, you will receive a refund of `90%`.
 <br>
Geek was fascinated by this offer. This offer was valid for only `n` days, and each day a new course was available for purchase. Geek decided that if he bought a course on some day, he will complete that course on the same day itself and redeem floor`[90% of cost of the course]` amount back. Find the maximum number of courses that Geek can complete in those `n` days if he had total amount initially.
 <br>
Note: On any day, Geek can only buy the new course that was made available for purchase that day.
 <br>
### Example 1:

**Input:**
n = 2 <br>
total = 10 <br>
cost = [10, 9] <br>

**Output:** 2 <br>

**Explanation:** 
Geek can buy the first course for 10 amount,  <br>
complete it on the same date and redeem 9 back.  <br>
Next, he can buy and complete the 2nd course too. <br>


### Example 2:

**Input:** <br>
n = 11 <br>
total = 10 <br>
cost = [10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1] <br>

**Output:** 10 <br>

**Explanation:** 
Geek can buy and complete all the courses that cost 1.

**Your Task:**
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function `max_courses()` that takes N the number of days, the total amount, and the cost array as input argument and return the maximum amount of courses that could be purchased.

Expected Time Complexity: O(n*total) <br>
Expected Auxiliary Space: O(n*total) <br>

Constraints: <br>
1 <= n <= 1000 <br>
0 <= total <= 1000 <br>
1 <= cost[i] <= 1000 <br>

![Screenshot (463)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/31e90b53-ad91-44e9-8475-47e1a47994cb)
