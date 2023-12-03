<h2>INORDER TRAVERSAL AND BST</h2>

https://www.geeksforgeeks.org/problems/inorder-traversal-and-bst5855/1

Given an array arr of size N, determine whether this array represents an inorder traversal of a BST.  <br>

**Note:**
All keys in BST must be unique.


<h3>Example 1:</h3>

**Input:** <br>
N = 3 <br>
arr = {2, 4, 5} <br>

**Output:** 1 <br>

**Explaination:** <br>

Given array is inorder traversal for the following tree:<br>

4 <br>
   /<br>
  
  2 <br>  5 <br>

  
<h3>Example 2:</h3> <br>

**Input:** <br>

N = 3 <br>
arr = {2, 4, 1} <br>


**Output:** 0


Explaination: <br>

Given array can not represent any BST. <br>
Your Task: <br>
You don't need to read input or print anything. Your task is to complete the function isRepresentingBST() which takes the array arr[] and its size N as input parameters and returns 1 if array represents Inorder traversal of a BST, else returns 0. <br>

Expected Time Complexity: O(N) <br>
Expected Auxiliary Space: O(1) <br>

Constraints: <br>
1 ≤ N ≤ 105 <br>
1 ≤ arr[i] ≤ 105
