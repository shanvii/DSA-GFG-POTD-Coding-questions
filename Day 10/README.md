<h2>AVL Tree Insertion</h2>

https://www.geeksforgeeks.org/problems/avl-tree-insertion/1

Given an AVL tree and N values to be inserted in the tree. Write a function to insert elements into the given AVL tree.

**Note:**
The tree will be checked after each insertion. 
If it violates the properties of balanced BST, an error message will be printed followed by the inorder traversal of the tree at that moment.
If instead all insertions are successful, inorder traversal of the tree will be printed.

<h3>Example 1:</h3>

**Input:** <br>
N = 3 <br>
Values to be inserted = {5,1,4} <br>
**Output:** <br>
1 4 5 <br>
**Explanation:** <br>
Value to be inserted = 5 <br>
    5 <br>
Value to be inserted = 1 <br>
    5 <br>
   / <br>
  1  <br>
Value to be inserted = 4  <br>
  5                     4  <br>
 /    LR rotation        /  \  <br>
1    ----------->       1   5  <br>
 \  <br>
 4  <br>
Therefore the inorder of the final tree will be 1, 4, 5.  <br>


<h3>Example 2:</h3>

**Input:**  <br>
N = 7  <br>
Values to be inserted = {21,26,30,9,4,14,28} <br>
**Output:** <br>
4 9 14 21 26 28 30 <br>
**Explanation:** <br>
Value to be inserted = 21  <br>
    21  <br>
Value to be inserted = 26  <br>
    21  <br>
     \  <br>
     26  <br>
Value to be inserted = 30  <br>
  21                        26  <br>
   \      LL rotation         /  \  <br>
   26    ----------->       21  30  <br>
    \  <br>
     30  <br>
Value to be inserted = 9 <br>
    26  <br>
   /  \  <br>
  21  30  <br>
 /  <br>
9  <br>
Value to be inserted = 4  <br>
      26                          26  <br>
     /  \                          /  \  <br>
    21  30                      9   30  <br>
   /          RR rotation        /  \  <br>
  9          ----------->       4  21  <br>
 /  <br>
4  <br>
Value to be inserted = 14  <br>
      26                          21  <br>
     /  \                          /  \  <br>
    9   30                      9   26  <br>
   / \          LR rotation      /  \    \  <br>
  4  21        ----------->    4  14  30  <br>
     /  <br>
    14  <br>
Value to be inserted = 28  <br>
      21                          21  <br>
     /  \                          /  \  <br>
    9   26                      9   28  <br>
   / \    \     RL rotation       / \    / \  <br>
  4  14   30   ----------->   4  14 26 30  <br>
          /  <br>
         28  <br>
Therefore the inorder of the final tree will be 4, 9, 14, 21, 26, 28, 30.  <br>


**Your Task:** <br>
You don't need to read input or print anything. Complete the function insertToAVL() which takes the root of the tree and the value of the node to be inserted as input parameters and returns the root of the modified tree. <br>

Expected Time Complexity: O(log N) <br>
Expected Auxiliary Space: O(height of tree) <br>

**Constraints:** <br>
1 ≤ N ≤ 2000 <br>
