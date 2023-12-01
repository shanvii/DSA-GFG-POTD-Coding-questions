<h2>Check whether BST contains Dead End</h2>

https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1

Given a Binary Search Tree that contains unique positive integer values greater than 0. The task is to complete the function isDeadEnd which returns true if the BST contains a dead end else returns false. Here Dead End means a leaf node, at which no other node can be inserted.

<h3>Example 1:</h3>

Input :   <br>
               8  <br>
             /   \   <br>
           5      9  <br>
         /  \     <br>
        2    7   <br>
       /  <br>
      1     <br>
          
Output :   <br>
Yes  <br>
Explanation :   <br>
Node 1 is a Dead End in the given BST.  <br>

<h3>Example 2:</h3>

Input :     <br>
              8  <br>
            /   \   <br>
           7     10  <br>
         /      /   \  <br>
        2      9     13  <br>
  
Output :   <br>
Yes  <br>
Explanation :   <br>
Node 9 is a Dead End in the given BST.  <br>


Your Task: You don't have to input or print anything. Complete the function isDeadEnd() which takes BST as input and returns a boolean value.  <br>

Expected Time Complexity: O(N), where N is the number of nodes in the BST.  <br>
Expected Space Complexity: O(N)  <br>

Constraints:  <br>
1 <= N <= 1001  <br>
1 <= Value of Nodes <= 10001  <br>

