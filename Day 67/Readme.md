## Distribute candies in a binary tree

https://www.geeksforgeeks.org/problems/distribute-candies-in-a-binary-tree/1

Given a binary tree with `N` nodes, in which each node value represents number of candies present at that node. In one move, one may choose two adjacent nodes and move only one candy from one node to another (the move may be from parent to child, or from child to parent). <br> 
The task is to find the number of moves required such that every node has exactly one candy. <br> 
Note that the testcases are framed such that it is always possible to achieve a configuration in which every node has exactly one candy, after some moves. <br> 

### Example 1:
 <br> 
**Input :**     
             3 <br> 
           /   \ <br> 
          0     0  <br> 
          
**Output :** 2 <br> 

**Explanation:** <br> 
From the root of the tree, we move one  
candy to its left child, and one candy to 
its right child. <br> 

### Example 2:

**Input :**      
             0 <br> 
           /   \ <br> 
          3     0   <br> 
          
**Output :** 3

**Explanation :** <br>  
From the left child of the root, we move 
two candies to the root [taking two moves].  <br> 
Then, we move one candy from the root of the 
tree to the right child. <br> 

**Your task :** <br> 
You don't have to read input or print anything. Your task is to complete the function `distributeCandy()` which takes the root of the tree as input and returns the number of moves required such that every node has exactly one candy.
  <br> 
Expected Time Complexity: O(N) <br> 
Expected Auxiliary Space: O(height of the tree) <br> 
 
Constraints: <br> 
1 <= N <= 10^4 <br> 
0 <= Value of each node <= 10^4 <br> 

![Screenshot (473)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/f5d94655-7122-4997-9e82-96ea7d2a5c9c)
