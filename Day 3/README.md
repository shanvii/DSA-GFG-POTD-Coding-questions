<h2>Better String</h2>

Given a pair of strings of equal lengths, Geek wants to find the better string. The better string is the string having more number of distinct subsequences.
If both the strings have equal count of distinct subsequence then return str1.



<h4>Example 1:</h4>

**Input:**
str1 = "gfg", str2 = "ggg" <br>
**Output:** "gfg" <br>
**Explanation:** "gfg" have 7 distinct subsequences whereas "ggg" have 4 distinct subsequences. 



<h4>Example 2:</h4>

**Input:** str1 = "a", str2 = "b" <br>
**Output:** "a" <br>
**Explanation:** Both the strings have only 1 distinct subsequence. 


**Your Task:**
You don't need to read input or print anything. Your task is to complete the function betterString() which takes str1 and str2 as input parameters and returns the better string.


Expected Time Complexity: O( max( str1.length, str2.length ) ) <br>
Expected Auxiliary Space: O( max( str1.length, str2.length ) )

Constraints:
1 <= str1.length , str2.length <= 30
