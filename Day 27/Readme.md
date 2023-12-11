<h2>Max Sum Subarray of size K</h2>

https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
 <br>
NOTE*: A subarray is a contiguous part of any given array. <br>

<h3>Example 1:</h3> <br>

**Input:** <br>
N = 4, K = 2 <br>
Arr = [100, 200, 300, 400] <br>

**Output:** <br>
700 <br>

**Explanation:** <br>
Arr3  + Arr4 =700, <br>
which is maximum. <br>

<h3>Example 2:</h3> <br>

**Input:** <br>
N = 4, K = 4 <br>
Arr = [100, 200, 300, 400] <br>

**Output:** <br>
1000 <br>

**Explanation:** <br>
Arr1 + Arr2 + Arr3 + Arr4 =1000, <br>
which is maximum. <br>

**Your Task:** <br>

You don't need to read input or print anything. Your task is to complete the function maximumSumSubarray() which takes the integer K, vector Arr with size N, containing the elements of the array and returns the maximum sum of a subarray of size K.
 <br>
Expected Time Complexity: O(N) <br>
Expected Auxiliary Space: O(1) <br>

Constraints: <br>
1 <= N <= 10^5 <br>
1 <= Arri <= 10^5 <br>
1 <= K <= N
