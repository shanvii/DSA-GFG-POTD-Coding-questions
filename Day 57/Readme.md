## Longest subarray with sum divisible by K


https://www.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1



Given an array arr containing `N` integers and a positive integer `K`, find the length of the longest sub array with sum of the elements divisible by the given value K.

### Example 1:

**Input:**
N = 6, K = 3
arr[] = {2, 7, 6, 1, 4, 5}


**Output:** 
4


**Explanation:**
The subarray is {7, 6, 1, 4} with sum 18, which is divisible by 3.


### Example 2:

**Input:**
N = 7, K = 3
arr[] = {-2, 2, -5, 12, -11, -1, 7}


**Output:** 
5


**Explanation:**

The subarray is {2,-5,12,-11,-1} with sum -3, which is divisible by 3.


**Your Task:**

The input is already taken care of by the driver code. You only need to complete the function `longSubarrWthSumDivByK()` that takes an array   `arr`, sizeOfArray `n` and a  positive integer `K`, and returns the length of the longest subarray which has sum divisible by `K`. 

Expected Time Complexity: O(N).

Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 10^5

1 <= K <= 10^9

-10^9 <= A[i] <= 10^9 

![WhatsApp Image 2024-01-10 at 20 23 01_c5abb000](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/96c19451-9486-4467-9887-d24cc9923c9f)
