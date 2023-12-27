<h2>Anti Diagonal Traversal of Matrix</h2>

https://www.geeksforgeeks.org/problems/print-diagonally1623/1

Give a N*N square matrix, return an array of its anti-diagonals in top-leftmost to bottom-rightmost order. In an element of a anti-diagonal (i, j), surrounding elements will be (i+1, j-1) and (i-1, j+1). Look at the examples for more clarity.
 <br>
<h3>Example 1:</h3> <br>

**Input:** <br>
N = 2 <br>
matrix[][] = 1 2 <br>
            3 4 <br>
**Output:** <br>
1 2 3 4 <br>
Explanation: <br>
List of anti-diagnoals in order is <br>
{1}, {2, 3}, {4} <br>

<h3>Example 2:</h3> <br>

**Input:** <br>
N = 3 <br>
matrix[][] = 3 2 3 <br>
            4 5 1 <br>
            7 8 9 <br>
**Output:** <br>
3 2 4 3 5 7 1 8 9 <br>

**Explanation:** <br>
List of anti-diagnoals in order is <br>
{3}, {2, 4}, {3, 5, 7}, {1, 8}, {9} <br>

**Your Task:** <br>
You dont need to read input or print anything. Complete the function antiDiagonalPattern() that takes matrix as input parameter and returns a list of integers in order of the values visited in the anti-Diagonal pattern. 
 <br>
Expected Time Complexity: O(N * N) <br>
Expected Auxiliary Space: O(N * N) <br>
 

Constraints: <br>
1 <= N <= 100 <br>
0 <= mat[i][j] <= 100 <br>

![Screenshot (419)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/b6ed59a9-e192-4434-81df-f3d99468967e)
