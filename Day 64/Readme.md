## All Unique Permutations of an array

https://www.geeksforgeeks.org/problems/all-unique-permutations-of-an-array/1

Given an array `arr[]` of length `n`. Find all possible unique permutations of the array in sorted order. A sequence `A` is greater than sequence `B` if there is an index `i` for which `Aj = Bj` for all `j<i` and `Ai > Bi`.

**Example 1:** <br>

**Input:**  <br>
n = 3 <br>
arr[] = {1, 2, 1} <br>

**Output:** <br> 
1 1 2 <br>
1 2 1 <br>
2 1 1 <br>

**Explanation:** <br>
These are the only possible unique permutations 
for the given array. <br>

**Example 2:** <br>

**Input:** <br> 
n = 2 <br>
arr[] = {4, 5} <br>

**Output:** <br> 
Only possible 2 unique permutations are <br>
4 5 <br>
5 4 <br>

**Your Task:** <br>
You don't need to read input or print anything. You only need to complete the function `uniquePerms()` that takes an integer `n`, and an array arr of size `n` as input and returns a sorted list of lists containing all unique permutations of the array.

Expected Time Complexity:  O(n*n!) <br>
Expected Auxilliary Space: O(n*n!) <br>

Constraints: <br>
1 ≤ n ≤ 9 <br>
1 ≤ arri ≤ 10 <br>
