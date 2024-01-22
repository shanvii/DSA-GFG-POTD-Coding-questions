## Paths from root with a specified sum

https://www.geeksforgeeks.org/problems/paths-from-root-with-a-specified-sum/1
 <br>
Given a Binary tree and `a` sum `S`, print all the paths, starting from root, that sums upto the given sum. Path not necessarily end on a leaf node.
 <br>
### Example 1:
 <br>
 
**Input:** <br> 
sum = 8 <br>
Input tree <br>
         1 <br>
       /   \ <br>
     20      3 <br>
           /    \ <br>
         4       15    <br>
        /  \     /  \ <br>
       6    7   8    9    <br>   

**Output :** <br>
1 3 4 <br>
**Explanation :** <br> 
Sum of path 1, 3, 4 = 8. <br>

### Example 2:

**Input :** <br> 
sum = 38 <br>
Input tree <br>
          10 <br>
       /     \ <br>
     28       13 <br>
           /     \ <br>
         14       15 <br>
        /   \     /  \ <br>
       21   22   23   24 <br>
       
**Output :**
10 28 <br>
10 13 15   <br>
**Explanation :** <br>
Sum of path 10, 28 = 38 and
Sum of path 10, 13, 15 = 38. <br>

**Your task :** <br>
You don't have to read input or print anything. Your task is to complete the function `printPaths()` that takes the root of the tree and sum as input and returns a vector of vectors containing the paths that lead to the sum.
 
Expected Time Complexity: O(N) <br>
Expected Space Complexity: O(N2) <br>
 
**Your Task :** <br>
1 <= N <= 2*10^3 <br>
-103 <= sum, Node.key <= 10^3 <br>

![Screenshot (477)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/30d10a9b-d850-4930-8a8d-2cc46d92ea0f)
