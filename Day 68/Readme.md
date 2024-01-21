## Vertex Cover

https://www.geeksforgeeks.org/problems/vertex-cover/1

Vertex cover of an undirected graph is a list of vertices such that every vertex not in the vertex cover shares their every edge with the vertices in the vertex cover. In other words, for every edge in the graph, atleast one of the endpoints of the graph should belong to the vertex cover. You will be given an undirected graph `G`, and your task is to determine the smallest possible size of a vertex cover.
 <br>
### Example 1: <br>

**Input:** <br>
N=5 <br>
M=6 <br>
edges[][]={{1,2} <br>
           {4, 1}, <br>
           {2, 4}, <br>
           {3, 4}, <br>
           {5, 2}, <br>
           {1, 3}} <br>
           
**Output:** <br>
3 <br>

**Explanation:** <br>
{2, 3, 4} forms a vertex cover 
with the smallest size. <br>

### Example 2: <br>

**Input:** <br>
N=2 <br>
M=1 <br>
edges[][]={{1,2}}  <br>

**Output:** <br> 
1  <br>

**Explanation:** <br> 
Include either node 1 or node 2
in the vertex cover. <br>

**Your Task:** <br>  
You don't need to read input or print anything. Your task is to complete the function `vertexCover()` which takes the edge list and an integer `n` for the number of nodes of the graph as input parameters and returns the size of the smallest possible vertex cover.

Expected Time Complexity: O(M*2N) <br>
Expected Auxiliary Space: O(N2) <br>

 Constraints: <br>
1 <= N <= 16 <br>
1 <= M <= N*(N-1)/2 <br>
1 <= edges[i][0], edges[i][1] <= N <br>

![Screenshot (475)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/34462367-a639-43e4-974b-684007e3b941)
