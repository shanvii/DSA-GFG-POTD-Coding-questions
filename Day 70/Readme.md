## Course Schedule

https://www.geeksforgeeks.org/problems/course-schedule/1

There are a total of n tasks you have to pick, labelled from `0` to `n-1`. Some tasks may have prerequisite tasks, for example to pick task `0` you have to first finish tasks `1`, which is expressed as a pair: `[0, 1]`
Given the total number of n tasks and a list of prerequisite pairs of size `m`. Find a ordering of tasks you should pick to finish all tasks.
Note: There may be multiple correct orders, you just need to return any one of them. If it is impossible to finish all tasks, return an empty array. Driver code will print `"No Ordering Possible"`, on returning an empty array. Returning any correct order will give the output as `1`, whereas any invalid order will give the output `0`. 
 <br>
### Example 1: <br>

**Input:** <br>
n = 2, m = 1 <br>
prerequisites = {{1, 0}} <br>

**Output:** <br>
1

**Explanation:** <br>
The output 1 denotes that the order is valid. So, if you have, implemented your function correctly, then output would be 1 for all test cases. One possible order is `[0, 1]`. <br>

### Example 2: <br>

**Input:** <br>
n = 4, m = 4 <br>
prerequisites = {{1, 0}, <br>
               {2, 0}, <br>
               {3, 1}, <br>
               {3, 2}} <br>
               
**Output:** <br>
1 <br>

**Explanation:** <br>
There are a total of `4` tasks to pick. To pick task `3` you should have finished both tasks `1` and `2`. Both tasks `1` and `2` should be pick after you finished task 0. So one correct task order is `[0, 1, 2, 3]`. Another correct ordering is `[0, 2, 1, 3]`. Returning any of these order will result in an output of 1.
 <br>
**Your Task:** <br>
The task is to complete the function `findOrder()` which takes two integers `n`, and `m` and a list of lists of size `m*2` denoting the prerequisite pairs as input and returns any correct order to finish all the tasks. Return an empty array if it's impossible to finish all tasks.
 <br>
Expected Time Complexity: O(n+m). <br>
Expected Auxiliary Space: O(n+m). <br>
 
Constraints: <br>
1 ≤ n ≤ 10^5
0 ≤ m ≤ min(n*(n-1),10^5) <br>
0 ≤ prerequisites[i][0], prerequisites[i][1] < n <br>
All prerequisite pairs are unique <br>
prerequisites[i][0] ≠ prerequisites[i][1] <br>

![Screenshot (478)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/3af73c99-cacd-461b-bf8d-d2477e1a9cd8)
