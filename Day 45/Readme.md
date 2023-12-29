<h2>Check if a string is repetition of its substring of k-length</h2>

https://www.geeksforgeeks.org/problems/check-if-a-string-is-repetition-of-its-substring-of-k-length3302/1

Given a string s, check if it is possible to convert it into a string that is the repetition of a substring of length k. Conversion has to be done by following the steps mentioned below only once:
 <br>
Select two indices i and j (zero-based indexing, i could be equal to j), such that i and j are divisible by k. <br>
Select substrings of length k starting from indices i and j. <br>
Replace substring starting at index i with substring starting at index j within the string. <br>

<h3>Example 1:</h3> <br>

**Input:** <br>
N = 4 <br>
K = 2 <br>
S = "bdac" <br>

**Output:** 1 <br>

Explanation: We can replace either <br>
"bd" with "ac" or "ac" with "bd" <br>

<h3>Example 2:</h3> <br>

**Input:** <br> 
N = 5 <br>
K = 2 <br>
S = "abcde" <br>

**Output:** 0 <br>
Explanation: Since n % k != 0, it's not  <br>
possible to convert s into a string which <br>
is a concatanation of a substring with  <br>
length k. <br>

Your Task: <br>
You don't need to read input or print anything. Your task is to complete the function kSubstrConcat() which takes a string s, its length n and an integer k as inputs and return 1 if convertion of the given string is possible, else 0.
 <br>
Expected Time Complexity: O(n). <br>
Expected Auxiliary Space: O(n). <br>

Constraints: <br>
2 <= k < n <= 10^5 <br>

![Screenshot (423)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/4fcc371b-53b7-49c8-a666-ad728137988c)
