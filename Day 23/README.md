<h2>Number of subarrays with maximum values in given range</h2>

https://www.geeksforgeeks.org/problems/number-of-subarrays-with-maximum-values-in-given-range5949/1

Given an array of N elements and L and R, print the number of sub-arrays such that the value of the maximum array element in that subarray is at least L and at most R.
 <br>
<h3>Example 1:</h3> <br>

**Input :** <br>
Arr = {2, 0, 11, 3, 0} <br>
L = 1 and R = 10 <br>

**Output :** <br> 
4 <br>

Explanation: <br>
The sub-arrays {2}, {2, 0}, {3} and {3, 0} have maximum in range 1-10. <br>

<h3>Example 2:</h3>

**Input :** <br> 
Arr = {3, 4, 1} <br>
L = 2 and R = 4 <br>

**Output :** <br> 
5 <br>

Explanation: <br>
The sub-arrays {3}, {3, 4}, {3,4,1}, {4} and {4, 1} have maximum in range 2-4. <br>

Your Task: <br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function countSubarrays() that takes an array arr, sizeOfArray (n), element L, integer R, and return the number of subarray with the maximum in range L-R. The driver code takes care of the printing.

Expected Time Complexity: O(N). <br>
Expected Auxiliary Space: O(1). <br>

Constraints: <br>
1 ≤ N ≤ 105
0 ≤ arr[i] ≤ 109
1 ≤ L ≤ R ≤ 109
