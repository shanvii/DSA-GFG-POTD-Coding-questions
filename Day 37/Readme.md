<h2>Candy</h2>

https://www.geeksforgeeks.org/problems/candy/1

There are N children standing in a line. Each child is assigned a rating value given in the integer array ratings.
You are giving candies to these children subjected to the following requirements: <br>

Each child must have atleast one candy. <br>
Children with a higher rating than its neighbors get more candies than their neighbors. <br>
Return the minimum number of candies you need to have to distribute. <br>

<h3>Example 1:</h3> <br>

**Input:** <br>
N = 3 <br>
ratings = [1, 0, 2] <br>

**Output:** <br> 
5 <br>

Explanation:  <br>
You can allocate to the first, second and third child with 2, 1, 2 candies respectively. <br>

<h3>Example 2:</h3>

**Input:** <br>
N = 3 <br>
ratings = [1, 2, 2] <br>

**Output:** <br> 
4 <br>

Explanation:  <br>
You can allocate to the first, second and third child with 1, 2, 1 candies respectively. <br>
The third child gets 1 candy because it statisfies the above two conditions. <br>

**Your Task:** <br>
You don't need to read input or print anything. Your task is to complete the function minCandy() which takes the interger N and integer array ratings as parameters and returns the minimum number of candies you need to have to distribute.
 <br>
Expected Time Complexity: O(N) <br>
Expected Auxiliary Space: O(N) <br>

Constraints: <br>
1 ≤ N ≤ 10^5 <br>
0 ≤ ratingsi ≤ 10^9 
![Screenshot (409)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/5e95c2bc-f26e-44cd-8c71-c8cb538a06d8)
