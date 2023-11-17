<h1>Binary Tree to CDLL</h1>

Given a Binary Tree of N edges. The task is to convert this to a Circular Doubly Linked List (CDLL) in-place. The left and right pointers in nodes are to be used as previous and next pointers respectively in CDLL. The order of nodes in CDLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (left most node in BT) must be head node of the CDLL.

<h3>Example 1:</h3>

**Input:** <br>
      1 <br>
    /   \ <br>
   3     2 <br>
**Output:** <br>
3 1 2  <br>
2 1 3

<br>

**Explanation:**
After converting tree to CDLL when CDLL is is traversed from head to tail and then tail to head, elements are displayed as in the output.


<h3>Example 2:</h3>

**Input:** <br>
     10 <br>
   /    \ <br>
  20    30 <br>
 /  \ <br>
40  60 <br>
**Output:** <br>
40 20 60 10 30  <br>
30 10 60 20 40

<br>

**Explanation:** 
After converting tree to CDLL, when CDLL is is traversed from head to tail and then tail to head, elements are displayed as in the output.

<br>

**Your Task:**
You don't have to take input or print anything. Complete the function bTreeToCList() that takes root as a parameter and returns the head of the list. The driver code prints the linked list twice, first time in the right order, and another time in reverse order.

<br>

**Constraints:** <br>
1 <= N <= 103 <br>
0 <= Data of a node <= 104

<br>
Expected time complexity: O(N)
<br>
Expected auxiliary space: O(h) , where h = height of tree
