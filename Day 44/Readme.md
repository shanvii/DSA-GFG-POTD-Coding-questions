<h2>Wildcard string matching</h2>

https://www.geeksforgeeks.org/problems/wildcard-string-matching1126/1

Given two strings wild and pattern. Determine if the given two strings can be matched given that, wild string may contain * and ? but string pattern will not. * and ? can be converted to another character according to the following rules:
 <br>
* --> This character in string wild can be replaced by any sequence of characters, it can also be replaced by an empty string. <br>
? --> This character in string wild can be replaced by any one character. <br>

<h3>Example 1:</h3>
 <br>
**Input:** <br> 
wild = ge*ks <br>
pattern = geeks <br>

**Output:** Yes <br>
Explanation: Replace the '*' in wild string  <br>
with 'e' to obtain pattern "geeks". <br>

<h3>Example 2:</h3> <br>

**Input:** <br> 
wild = ge?ks* <br>
pattern = geeksforgeeks <br>

**Output:** Yes <br>
Explanation: Replace '?' and '*' in wild string with <br>
'e' and 'forgeeks' respectively to obtain pattern  <br>
"geeksforgeeks" <br>
Your Task: <br>
You don't need to read input or print anything. Your task is to complete the function match() which takes the string wild and pattern as input parameters and returns true if the string wild can be made equal to the string pattern, otherwise, returns false.
 <br>
Expected Time Complexity: O(length of wild string * length of pattern string) <br>
Expected Auxiliary Space: O(length of wild string * length of pattern string) <br>

Constraints: <br>
1 <= length of the two string <= 10^3  <br>

![Screenshot (421)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/5a683074-09ac-4e39-9af9-fbdb79d421f0)
