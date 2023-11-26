<h2>Print Pattern</h2>

Print a sequence of numbers starting with N, without using loop, where replace N with N - 5, until N > 0. After that replace N with N + 5 until N regains its initial value.

<h3>Example 1:</h3>

**Input:** <br>
N = 16  <br>
**Output:**  <br>
16 11 6 1 -4 1 6 11 16  <br>
**Explaination:** <br>
The value decreases until it is greater than 0. After that it increases and stops when it becomes 16 again. <br>


<h3>Example 2:</h3>

**Input:**   <br>
N = 10  <br>
**Output:**  <br>
10 5 0 5 10  <br>
**Explaination:** It follows the same logic as per the above example.<br>

**Your Task:**  <br>
You do not need to read input or print anything. Your task is to complete the function pattern() which takes N as input parameters and returns a list containing the pattern.  <br>

Expected Time Complexity: O(N)  <br>
Expected Auxiliary Space: O(N)  <br>

**Constraints:**  <br>
-105 ≤ N ≤ 105
