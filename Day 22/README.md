<h2>How Many X's?</h2>

https://www.geeksforgeeks.org/problems/how-many-xs4514/1

Given two integers L, R, and digit X. Find the number of occurrences of X in all the numbers in the range (L, R) excluding L and R. <br>

<h3>Example 1:</h3> <br>

**Input:** <br>
L=10, R=19, X=1 <br>

**Output:** <br>
9 <br>

Explanation: <br>
There are 9 1s (11, 12, 13, 14, 15, 16, 17, 18) in the numbers in the range (10,19). <br>


<h3>Example 2:</h3> <br>

**Input:** <br>
L=18, R=81, X=9 <br>

**Output:** <br>
7 <br>
Explanation: <br>
There are 7 occurrences of the digit 9 in the numbers in the range (18,81). <br>

**Your Task:** <br>
You don't need to read input or print anything. Your task is to complete the function countX() which takes three integers L, R, and X as input parameters and returns the number of occurrences of X in the numbers in the range(L, R).
 <br>
Expected Time Complexity:O(RLogR) <br>
Expected Auxillary Space:O(1) <br>

Constraints: <br>
1 <= L< R <= 105 <br>
0 <= X <= 9 
