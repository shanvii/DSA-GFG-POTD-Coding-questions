<h2>Shortest path from 1 to n</h2>

Consider a directed graph whose vertices are numbered from 1 to n. There is an edge from a vertex i to a vertex j if and only if either j = i + 1 or j = 3 * i. The task is to find the minimum number of edges in a path from vertex 1 to vertex n.

<h3>Example 1:</h3>

**Input:**  <br>  
n = 9  <br>
**Output:**  <br>
2  <br>
**Explanation:**  <br>
Many paths are possible from 1 to 9.  <br>
Shortest one possible is,  <br>
1 -> 3 -> 9, of length 2.  <br>


<h3>Example 2:</h3>

**Input:**  <br>
n = 4  <br>
**Output:**  <br>
2  <br>
**Explanation:**  <br>
Possible paths from 1 to 4 are,  <br>
1 -> 2 -> 3 -> 4 and  <br>
1 -> 3 -> 4.  <br>
Second path of length 2 is the shortest.  <br>

**Your Task:**  <br>
You don't need to read input or print anything. Your task is to complete the function minimumStep() which takes an integer n as inputs and returns the minimum number of edges in a path from vertex 1 to vertex N.    <br>

Expected Time Complexity: O( log(n) )  <br>
Expected Auxiliary Space: O(1)  <br>

**Constraints:**  <br>
1 ≤ N ≤ 105  <br>
