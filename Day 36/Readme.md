<h2>Modified Game of Nim</h2>

https://www.geeksforgeeks.org/problems/variation-in-nim-game4317/1

You are given an array A of n elements. There are two players player 1 and player 2.
A player can choose any of element from an array and remove it. If the bitwise XOR of all remaining elements equals 0 after removal of the selected element, then that player loses. Find out the winner if player 1 starts the game and they both play their best. 
 <br>
<h3>Example 1:</h3> <br>

**Input:** <br> 
n = 3 <br>
A = [3, 3, 2] <br>

**Output:** <br> 
2 <br>

**Explaination:** <br> 
Optimal removal of values are 3, 2, 3 sequentially. Then the array is empty. So player 2 wins. <br>

<h3>Example 2:</h3> <br>

**Input:** <br> 
n = 2 <br>
A = [3, 3] <br>

**Output:** <br> 
1 <br>

**Explaination:** <br> 
Since the xor of an array is already 0, player 1 wins. <br>

**Your Task:** <br>
You do not need to read input or print anything. Your task is to complete the function findWinner() which takes the number n and the array A as input parameters and returns an integer denoting the winner.
 <br>
Expected Time Complexity: O(n) <br>
Expected Auxiliary Space: O(1) <br>

Constraints: <br>
1 ≤ n ≤ 10^5 <br>
0 ≤ A[i] ≤ 10^9 <br>
![Screenshot (407)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/442ba0cb-44b4-4d57-8744-40fa98b8db58)

