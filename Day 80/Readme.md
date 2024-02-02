## Implement Atoi

https://www.geeksforgeeks.org/problems/implement-atoi/1

Given a string, `s`, the objective is to convert it into integer format without utilizing any built-in functions. If the conversion is not feasible, the function should return `-1`.
 <br>
Note: Conversion is feasible only if all characters in the string are numeric or if its first character is `-` and rest are numeric.
 <br>
### Example 1:
 <br>
**Input:** <br>
s = "-123" <br>

**Output:** <br> 
-123 <br>
**Explanation:** <br>
It is possible to convert -123 into an integer 
and is so returned in the form of an integer <br>

### Example 2: <br>

**Input:** <br>
s = "21a" <br>
**Output:** <br>
-1 <br>
**Explanation:** <br> 
The output is -1 as, due to the inclusion of 'a',
the given string cannot be converted to an integer. <br>
**Your Task:** <br>
You do not have to take any input or print anything. Complete the function `atoi()` which takes a string `s` as an input parameter and returns an integer value representing the given string. If the conversion is not feasible, the function should return `-1`.
 <br>
|s| = length of string str. <br>
Expected Time Complexity: O( |s| ),  <br>
Expected Auxiliary Space: O(1) <br>

Constraints: <br>
1 ≤ |s| ≤ 10 <br>

![Screenshot (498)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/dd19a6d5-59e8-4ef7-86f5-81a0c925683d)
