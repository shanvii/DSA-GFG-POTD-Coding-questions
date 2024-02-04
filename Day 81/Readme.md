## Decimal Equivalent of Binary Linked List

https://www.geeksforgeeks.org/problems/decimal-equivalent-of-binary-linked-list/1

Given a singly linked list of length `n`. The link list represents a binary number, `ie- it` contains only `0s` and `1s`. Find its decimal equivalent.
The significance of the bits decreases with the increasing index in the linked list. <br>
An empty linked list is considered to represent the decimal value `0`.  <br>

Since the answer can be very large, answer modulo 109+7 should be printed. <br>

### Example 1: <br>
**Input:** <br>
n = 3 <br>
Linked List = {0, 1, 1} <br>

**Output:** <br>
3 <br>

**Explanation:** <br>
0*22 + 1*21 + 1*20 =  1 + 2 + 0 = 3 <br>

### Example 2: <br>

**Input:** <br>
n = 4 <br>
Linked List = {1, 1, 1, 0} <br>

**Output:** <br>
14 <br>

**Explanation:** <br>
1*23 + 1*22 + 1*21 + 0*20 =  8 + 4 + 2 + 0 = 14 <br>

**Your Task:** <br>
You do not have to take any input or print anything. Complete the function `decimalValue()` which takes a head node of a linked list as an input parameter and returns decimal representation of it. <br>

Expected Time Complexity: O(n) <br>
Expected Auxiliary Space: O(1) <br>

Constraints: <br>
0 <= n <= 100 <br>
Data of each node is either 0 or 1 <br>

![Screenshot (500)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/cef67e20-378f-40ff-b5cc-1713fc129888)

