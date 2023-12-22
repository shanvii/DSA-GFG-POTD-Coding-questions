<h2>Maximum Meetings in One Room</h2>

https://www.geeksforgeeks.org/problems/maximum-meetings-in-one-room/1

There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i]) where S[i] is the start time of meeting i and F[i] is the finish time of meeting i. The task is to find the maximum number of meetings that can be accommodated in the meeting room. You can accommodate a meeting if the start time of the meeting is strictly greater than the finish time of the previous meeting. Print all meeting numbers.
 <br>
Note: If two meetings can be chosen for the same slot then choose meeting with smaller index in the given array.
 <br>
<h3>Example 1:</h3> <br>

**Input:** <br>
N = 6 <br>
S = {1,3,0,5,8,5} <br>
F = {2,4,6,7,9,9}  <br>

**Output:** <br>
{1,2,4,5} <br>

Explanation: <br>
We can attend the 1st meeting from (1 to 2), then the 2nd meeting from (3 to 4), then the 4th meeting from (5 to 7), and the last meeting we can attend is the 5th from (8 to 9). It can be shown that this is the maximum number of meetings we can attend.

<h3>Example 2:</h3>
 <br>
**Input:** <br>
N = 1 <br>
S = {3} <br>
F = {7} <br>

**Output:**
{1} <br>
Explanation: <br>
Since there is only one meeting, we can attend the meeting. <br>

**Your Task:** <br>

You don't need to read input or print anything. Your task is to complete the function maxMeetings() which takes the arrays S, F, and its size N as inputs and returns the meeting numbers we can attend in sorted order.
 <br>
Expected Time Complexity: O(N*log(N)) <br>
Expected Auxiliary Space: O(N) <br>

Constraints: <br>
1 <= N <= 10^5 <br>
0 <= S[i] <= F[i] <= 10^9 <br>
Sum of N over all test cases doesn't exceeds 10^6 <br>

![Screenshot (412)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/bcd219ea-6cce-493d-9a89-d4e8ca9204f3)
