## Sequence of Sequence

https://www.geeksforgeeks.org/problems/sequence-of-sequence1155/1

Given two integers `m` and `n`, try making a special sequence of numbers seq of length `n` such that
seqi+1 >= 2*seqi <br>
seqi > 0 <br>
seqi <= m <br>
Your task is to determine total number of such special sequences possible. <br>

### Example 1:

**Input:**  <br>
m = 10 <br>
n = 4 <br>

**Output:** <br> 
4 <br>

**Explaination:** <br> 
There should be `n` elements and 
value of last element should be at-most `m`.  <br>
The sequences are {1, 2, 4, 8}, {1, 2, 4, 9}, 
{1, 2, 4, 10}, {1, 2, 5, 10}. <br>


### Example 2:

**Input:** <br> 
m = 5 <br>
n = 2 <br>

**Output:** <br> 
6 <br>

**Explaination:** <br> 
The sequences are {1, 2}, 
{1, 3}, {1, 4}, {1, 5}, {2, 4}, {2, 5}. <br>


**Your Task:**
You do not need to read input or print anything. Your task is to complete the function `numberSequence()` which takes the number `m` and `n` as input parameters and returns the number of possible special sequences.
 <br>
Expected Time Complexity: O(m*n) <br>
Expected Auxiliary Space: O(1) <br>

Constraints: <br>
1 ≤ m, n ≤ 100 <br>

![Screenshot (465)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/aa693188-8740-4234-9dd6-80f95436acc7)
