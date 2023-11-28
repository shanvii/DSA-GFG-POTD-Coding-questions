<h2>Sum of dependencies in a graph</h2>

Given a directed graph with V nodes and E edges, if there is an edge from u to v, then we will say that u depends on v. Number of Dependencies (NoD) for a node x is the total count of nodes that x depends upon. Find out the sum of number of dependencies of every node.

<h3>Example 1:</h3>

**Input:** <br>
V = 4  <br>
E = 4  <br>
Edges = { {0,2}, {0,3}, {1,3}, {2,3} }  <br>

**Output:**  <br>
4  <br>
**Explanation:**  <br>
For the graph in diagram,   <br>
A depends on C and D i.e. A's NoD is 2,   <br>
B depends on D i.e. B's NoD is 1,  <br>
C depends on D i.e. D's NoD is 1,  <br>
and D depends on none.  <br>
Hence answer -> 0 + 1 + 1 + 2 = 4  <br>


<h3>Example 2:</h3>

**Input:**  <br>
V = 4  <br>
E = 3  <br>
Edges = { {0,3}, {0,2}, {0,1} }  <br>
**Output:**  <br>
3  <br>
**Explanation:**  <br>
The sum of dependencies=3+0+0+0=3.  <br>


**Your Task:**  <br>
You don't need to read input or print anything. Your task is to complete the function sumOfDependencies() which takes the adj (Adjacency list) and V (Number of nodes) as input parameters and returns the total sum of Number of Dependencies of all nodes.  <br>

Expected Time Complexity: O(V)  <br>
Expected Auxillary Space: O(1)  <br>

Constraints:  <br>
1 <= V <= 105  <br>
1 <= E <= 105  <br>

0 <= Edges[i][0], Edges[i][1] <= V-1  <br>
