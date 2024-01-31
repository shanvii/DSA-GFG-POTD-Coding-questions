## Insert and Search in a Trie

https://www.geeksforgeeks.org/problems/trie-insert-and-search0651/1


Complete the Insert and Search functions for a Trie Data Structure. 
 <br>
Insert: Accepts the Trie's root and a string, modifies the root in-place, and returns nothing. <br>
Search: Takes the Trie's root and a string, returns true if the string is in the Trie, otherwise false. <br>
Note: To test the correctness of your code, the code-judge will be inserting a list of N strings called into the Trie, and then will search for the string key in the Trie. The code-judge will generate 1 if the key is present in the Trie, else 0.
 <br>
### Example 1: <br>

**Input:** <br>
n = 8 <br>
list[] = {the, a, there, answer, any, by, bye, their} <br>
key = the <br>

**Output: 1** <br>
**Explanation:** <br>
"the" is present in the given set of strings.  <br>

### Example 2: <br>

**Input:** <br>
n = 8 <br>
list[] = {the, a, there, answer, any, by, bye, their} <br>
key = geeks <br>
**Output:** 0 <br>
**Explanation:** <br> 
"geeks" is not present in the 
given set of strings. <br>

**Your Task:** <br>
You do not have to take any input or print anything. Complete insert and search functions. 
 <br>
Expected Time Complexity: O(M+|key|) <br>
Expected Auxiliary Space: O(M) <br>
Here M = sum of the length of all strings which are present in the list[]  <br>

Constraints: <br>
1 <= N <= 10^4 <br>
1 <= length of list[i] <= 30 <br>
All strings will constitute of lowercase alphabets only. <br>

![Screenshot (494)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/cdba7254-d060-4c26-962f-05122d79d8a7)
