![image](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/065edaa6-0c04-4a7b-a351-644e234de970)<h2>Minimize the Heights II</h2>

https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1

Given an array arr[] denoting heights of N towers and a positive integer K. <br>

For each tower, you must perform exactly one of the following operations exactly once. <br>

Increase the height of the tower by K <br>
Decrease the height of the tower by K <br>
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower. <br>

You can find a slight modification of the problem here. <br>
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.
 <br>
<h3>Example 1:</h3> <br>

**Input:** <br>
K = 2, N = 4 <br>
Arr[] = {1, 5, 8, 10} <br>

**Output:** <br>
5 <br>

Explanation: <br>
The array can be modified as  <br>
{1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.  <br>
The difference between  <br>
the largest and the smallest is 8-3 = 5. <br>

<h3>Example 2:</h3> <br>

**Input:** <br>
K = 3, N = 5 <br>
Arr[] = {3, 9, 12, 16, 20} <br>

**Output:** <br>
11 <br>

Explanation: <br>
The array can be modified as <br>
{3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.  <br>
The difference between  <br>
the largest and the smallest is 17-6 = 11.  <br>

**Your Task:** <br>
You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n, and k as input parameters and returns an integer denoting the minimum difference. <br>

Expected Time Complexity: O(N*logN) <br>
Expected Auxiliary Space: O(N)

Constraints
1 ≤ K ≤ 109
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 109
