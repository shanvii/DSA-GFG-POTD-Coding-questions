## Brackets in Matrix Chain Multiplication

https://www.geeksforgeeks.org/problems/brackets-in-matrix-chain-multiplication1024/1

Given an array `p[]` of length n used to denote the dimensions of a series of matrices such that the dimension of i'th matrix is `p[i] * p[i+1]`. There are a total of `n-1` matrices. Find the most efficient way to multiply these matrices together. 
As in `MCM`, you were returning the most effective count but this time return the string which is formed of `A - Z` (only Uppercase) denoting matrices & Brackets( "(" ")" ) denoting multiplication symbols. For example, if `n =11`, the matrixes can be denoted as `A - K` as `n<=26` & brackets as multiplication symbols.
 <br>
NOTE: <br>

Each multiplication is denoted by putting open & closed brackets to the matrices multiplied & also Please note that the order of matrix multiplication matters, as matrix multiplication is non-commutative `A*B != B*A`
As there can be multiple possible answers, the console would print "True" for the correct string and "False" for the incorrect string. You need to only return a string that performs a minimum number of multiplications. <br>

### Example 1: <br>

**Input:** <br> 
n = 5 <br>
p[] = {40, 20, 30, 10, 30} <br>

**Output:** <br> 
True <br>
**Explaination:** <br> 
Let's divide this into matrix(only 4 are possible)  <br>
[ [40, 20] -> A <br>
, [20, 30] -> B <br>
, [30, 10] ->C <br>
, [10, 30] -> D ] <br>
First we perform multiplication of B & C -> (BC) <br>
then we multiply A to (BC) -> (A(BC)) <br>
then we multiply D to (A(BC)) -> ((A(BC))D) <br>
so the solution returned the string ((A(BC))D), which performs minimum multiplications. The total number of multiplications are 20*30*10 + 40*20*10 + 40*10*30 = 26,000. <br>

### Example 2: <br>

**Input:** <br> 
n = 3 <br>
p = {3, 3, 3} <br>

**Output:** <br> 
True <br>
**Explaination:**  <br>
The solution returned the string (AB), which performs minimum multiplications. The total number of multiplications are (3*3*3) = 27. <br>

**Your Task:** <br>
You do not need to read input or print anything. Your task is to complete the function `matrixChainOrder()` which takes `n` and `p[]` as input parameters and returns the string of parenthesis for n-1 matrices. Use uppercase alphabets to denote each matrix.
 <br>
Expected Time Complexity: O(n3) <br>
Expected Auxiliary Space: O(n2) <br>

Constraints: <br>
2 ≤ n ≤ 26  <br>
1 ≤ p[i] ≤ 500  <br>

![Screenshot (486)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/833513dc-35eb-4431-986e-d43ffcc12496)
