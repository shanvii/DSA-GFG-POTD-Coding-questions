<h2>Winner of an election</h2>

https://www.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1

Given an array of n names arr of candidates in an election, where each name is a string of lowercase characters. A candidate name in the array represents a vote casted to the candidate. Print the name of the candidate that received the maximum count of votes. If there is a draw between two candidates, then print lexicographically smaller name.
 <br>
<h3>Example 1:</h3> <br>

**Input:** <br>
n = 13 <br>
arr[] = {john,johnny,jackie,johnny,john  <br>
jackie,jamie,jamie,john,johnny,jamie, <br>
johnny,john} <br>

**Output:** john 4 <br>

Explanation: john has 4 votes casted for  <br>
him, but so does johny. john is  <br>
lexicographically smaller, so we print  <br>
john and the votes he received. <br>

<h3>Example 2:</h3> <br>

**Input:** <br>
n = 3 <br>
arr[] = {andy,blake,clark} <br>

**Output:** andy 1 <br>
Explanation: All the candidates get 1  <br>
votes each. We print andy as it is  <br>
lexicographically smaller. <br>

**Your Task:** <br>
You only need to complete the function winner() that takes an array of strings arr, and length of arr n as parameters and returns an array of string of length 2. First element of the array should be the name of the candidate and second element should be the number of votes that candidate got in string format.
 <br>
Expected Time Complexity: O(n) <br>
Expected Auxiliary Space: O(n) <br>

Constraints: <br>
1 <= n <= 10^5 <br>
1 <= |arri| <= 10^5 <br>


![Screenshot (425)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/50a8cc67-89b9-431f-9896-4cc95b95cc2b)

