<h2>BROTHER FROM DIFFERENT ROOTS</h2>
https://www.geeksforgeeks.org/problems/brothers-from-different-root/1

Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x, your task is to complete the function countPairs(), that returns the count of all pairs of (a, b), where a belongs to one BST and b belongs to another BST, such that a + b = x. <br>

<h3>Example 1:</h3>  <br>

**Input:**  <br>
BST1: <br>
       5 <br>
     /   \ <br>
    3     7 <br>
   / \   / \ <br>
  2   4 6   8 <br>
BST2: <br>
       10 <br>
     /    \ <br>
    6      15 <br>
   / \    /  \ <br>
  3   8  11   18 <br>
x = 16 <br>
**Output:** <br>
3
Explanation: <br>
The pairs are: (5, 11), (6, 10) and (8, 8) <br>
<h3>Example 2:</h3> <br>

**Input:**  <br>
BST1: <br>
  1 <br>
   \ <br>
    3 <br>
   / <br>
  2 <br>
BST2: <br>
    3 <br>
   / \ <br>
  2   4 <br>
 /  <br>    
1 <br>
x = 4 <br>
**Output:**
3 <br>
Explanation: <br>
The pairs are: (2, 2), (3, 1) and (1, 3) <br>
**Your Task:** <br>
You don't need to read input or print anything. Your task is to complete the function countPairs(), which takes two BST's as parameter in the form of root1 and root2 and the integer x, that returns the count of all pairs from both the BSTs whose sum is equal to x. <br>

Expected Time Complexity: O(N) <br>
Expected Auxiliary Space: O(N) <br>

Constraints: <br>
1 ≤ Number of nodes ≤ 105 <br>
1 ≤ Data of a node ≤ 106 
