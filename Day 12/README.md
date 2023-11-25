<h2>Shuffle integers</h2>

Given an array arr of n elements in the following format {a1, a2, a3, a4, ... , an/2, b1, b2, b3, b4, ... , bn/2}, the task is shuffle the array to {a1, b1, a2, b2, a3, b3, ... , an/2, bn/2} without using extra space.
Note that n is even.

<h3>Example 1:</h3>

**Input:**  <br>
n = 4, arr = {1, 2, 9, 15}  <br>
**Output:**  <br>
1 9 2 15  <br>
**Explanation:**  <br>
a1=1, a2=2, b1=9, b2=15. So the final array will be: a1, b1, a2, b2 = {1,9,2,15}.  <br>


<h3>Example 2:</h3>

**Input:**  <br>
n = 6 arr = {1, 2, 3, 4, 5, 6}   <br>
**Output:**   <br>
1 4 2 5 3 6  <br>


**Your Task:**  <br>
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function shuffleArray() that takes array arr, and an integer n as parameters and modifies the given array according to the above-given pattern.  <br>

Expected Time Complexity: O(n).  <br>
Expected Auxiliary Space: O(1).  <br>

**Constraints:**  <br>
1 ≤ n ≤ 105  <br>
1 ≤ arri ≤ 103  <br>
