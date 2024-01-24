## Check if a given graph is tree or not

https://www.geeksforgeeks.org/problems/is-it-a-tree/1

You are given an undirected graph of `N` nodes (numbered from 0 to N-1) and `M` edges. Return `1` if the graph is a tree, else return 0.
 <br>
Note: The input graph can have self-loops and multiple edges. <br>
 <br>
### Example 1: <br>

**Input:** <br>
N = 4, M = 3 <br>
G = [[0, 1], [1, 2], [1, 3]] <br>

**Output:** <br> 
1 <br>

**Explanation:** <br> 
Every node is reachable and the graph has no loops, so it is a tree <br>

### Example 2: <br>

**Input:** <br>
N = 4, M = 3 <br>
G = [[0, 1], [1, 2], [2, 0]] <br>


**Output:** <br> 
0 <br>

**Explanation:** <br> 
3 is not connected to any node and there is a loop 0->1->2->0, so it is not a tree. <br>

**Your Task:** <br>  
You don't need to read input or print anything. Your task is to complete the function `isTree()` which takes the integer `N` (the number nodes in the input graph) and the edges representing the graph as input parameters and returns 1 if the input graph is a tree, else 0.
 <br>
Expected Time Complexity: O(N+M) <br>
Expected Auxiliary Space: O(N) <br>

Constraints: <br>
1 <= N <= 2`*`10^5 <br>
0 <= M <= 2`*`10^5 <br>

![Screenshot (480)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/1b550721-978e-48e1-abba-a1633ec4f707)
