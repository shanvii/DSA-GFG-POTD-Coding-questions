<h2>K Sum Paths</h2>

link: https://www.geeksforgeeks.org/problems/k-sum-paths/1

Given a binary tree and an integer K. Find the number of paths in the tree which have their sum equal to K. A path may start from any node and end at any node in the downward direction. Since the answer may be very large, compute it modulo 109+7.

<h3>Example 1:</h3>

**Input:**
Tree =<br> 
          1                                
        /   \                           
       2     3 

K = 3 <br>

**Output:** <br>
2 <br>

**Explanation:** <br>
Path 1 : 1 + 2 = 3 <br>
Path 2 : only leaf node 3 <br>


<h3>Example 2:</h3>

**Input:**
Tree = <br>
           1     <br>
        /     \ <br>
      3        -1 <br>
    /   \     /   \     <br>
   2     1   4     5                    
        /   / \     \           
       1   1   2     6    <br>

K = 5                    <br>
**Output:**  <br>
8

**Explanation:** <br>
The following paths sum to K.  
3 2 <br>
3 1 1 <br>
1 3 1 <br>
4 1 <br>
1 -1 4 1 <br>
-1 4 2 <br>
5 <br>
1 -1 5 <br>


**Your Task:** 
You don't need to read input or print anything. Complete the function sumK() which takes root node and integer K as input parameters and returns the number of paths that have sum K. 

<br>
Expected Time Complexity: O(N) <br>
Expected Auxiliary Space: O(Height of Tree) <br>

<br> 

**Constraints:** <br>
1 ≤ N ≤ 2*104 <br>
-105 ≤ Node Value ≤ 105 <br>
-109 ≤ K ≤ 109
