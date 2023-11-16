<h2>Find the String</h2>

Given two integers N and K, the task is to find the string S of minimum length such that it contains all possible strings of size N as a substring. The characters of the string should be from integers ranging from 0 to K-1.  


<br>
<h4>Example 1:</h4>

**Input:** N = 2, K = 2 <br>
**Output:** 00110 <br>
**Explanation:** Allowed characters are from 0 to k-1 (i.e., 0 and 1). There are 4 string possible of size N=2 (i.e "00", "01","10","11") "00110" contains all possible string as a substring. It also has the minimum length.
<br>


<h4>Example 2:</h4>

**Input:** N = 2, K = 3 <br>
**Output:** 0010211220 <br>
**Explanation:** Allowed characters are from 0 to k-1 (i.e., 0, 1 and 2). There are total 9 strings possible of size N, given output string has the minimum length that contains all those strings as substring.
<br>


**Your Task:** <br>
You don't need to read input or print anything. Complete the function findString( ) which takes the integer N and the integer K as input parameters and returns the string.
Note: In case of multiple answers, return any string of minimum length which satisfies above condition. The driver will print the length of the string. In case of wrong answer it will print -1.


<br>
Expected Time Complexity: O(KNlogK)<br>
Expected Space Complexity: O(KNN)

<br> <br>
Constraints: <br>
1 ≤ N ≤ 4 <br>
1 < K < 10 <br>
1 < KNN < 106
