## Top k numbers in a stream

https://www.geeksforgeeks.org/problems/top-k-numbers3425/1

Given `N` numbers in an array, your task is to keep at most the top `K` numbers with respect to their frequency.
 <br>
In other words, you have to iterate over the array, and after each index, determine the top `K` most frequent numbers until that iteration and store them in an array in decreasing order of frequency. An array will be formed for each iteration and stored in an array of arrays. If the total number of distinct elements is less than `K`, then keep all the distinct numbers in the array. If two numbers have equal frequency, place the smaller number first in the array.
 <br>

### Example 1:

**Input:**
N=5, K=4 <br>
arr[] = {5, 2, 1, 3, 2}  <br>

**Output:** <br> 
5  <br>
2 5  <br>
1 2 5  <br>
1 2 3 5 ****
2 1 3 5  <br>

**Explanation:** <br>
Firstly there was 5 whose frequency  <br>
is max till now. So resulting sequence is {5}. <br>
Then came 2, which is smaller than 5 but 
their frequencies are same so resulting sequence is {2, 5}. <br>
Then came 1, which is the smallest among all the
numbers arrived, so resulting sequence is {1, 2, 5}. <br>
Then came 3 , so resulting sequence is {1, 2, 3, 5} <br>
Then again 2, which has the highest
frequency among all numbers, 
so resulting sequence {2, 1, 3, 5}. <br>


### Example 2:

**Input:** <br>
N=6, K=3 <br>
arr[] = {2, 1, 2, 1, 2, 1}  <br>

**Output:** <br> 
2  <br>
1 2  <br>
2 1  <br>
1 2  <br>
2 1 <br>
1 2 <br>
**Explanation:**
As total number of distinct values never
exceeds 2, you have to return only those two
values. <br> In the case where frequency of 1 gets
equal with the frequency of 2, you have to 
keep 1 before 2 in the array. <br>

**Your Task:**
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function `kTop()` that takes array `a`, integer `n` and integer `k` as parameters and returns the array of arrays.

Expected Time Complexity: O(N*K). <br>
Expected Auxiliary Space: O(N). <br>

Constraints: <br>
1 ≤ N ≤ 10^4 <br>
1 ≤ K ≤ 10^2 <br>
1 ≤ a[i] ≤ 10^2  <br>

![Screenshot (471)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/4ddf6ab6-24ac-4bb7-ada8-943fd9a81e77)
