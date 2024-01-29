## Count digit groupings of a number

https://www.geeksforgeeks.org/problems/count-digit-groupings-of-a-number1520/1

Given a string str consisting of digits, you can divide it into sub-groups by separating the string into substrings. For example, `"112"` can be divided as `{"1", "1", "2"}, {"11", "2"}, {"1", "12"}, and {"112"}`.
 <br>
A valid grouping can be done if you are able to divide sub-groups where the sum of digits in a sub-group is less than or equal to the sum of the digits of the sub-group immediately right to it. Your task is to determine the total number of valid groupings that could be done for a given string.
 <br>
### Example 1:  <br>

**Input:** <br> 
str = "1119" <br>

**Output:** <br> 
7 <br>

**Explanation:** <br>  
One valid grouping is {"1", "11", "9"}. <br>
Sum of digits of first sub-group ("1") is 1, <br>
for the second sub-group ("11"), it is 2,  <br>
and for the third one ("9"), it is 9. <br>
As the sum of digits of the sub-groups is 
in increasing order, it forms a valid grouping. <br>
Other valid grouping are {"1", "119"}, {"1","1","19"}, 
{"1","1","1","9"}, {"11","19"}, {"111","9"} and {"1119"}
are six other valid groupings. <br>
### Example 2: <br>

**Input: ** <br>
str = "12" <br>

**Output:** <br> 
2 <br>

**Explanation:** <br> 
{"1","2"} and {"12"} are two valid groupings. <br>

**Your Task:** <br>
You don't need to read or print anything. Your task is to complete the function `TotalCount()` which takes the string str as input parameter and returns total possible groupings. <br>

Expected Time Complexity: O(N3) where N is the length of the string. <br>
Expected Space Complexity: O(N2) <br>

Constraints: <br>
1 <= N <= 100 <br>
stri ∈ {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} <br>

![Screenshot (490)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/9a574906-33d0-4771-9f9e-c31b8e01b9dd)

