## Subtraction in Linked List

https://www.geeksforgeeks.org/problems/subtraction-in-linked-list/1

You are given two linked lists that represent two large positive numbers. From the two numbers represented by the linked lists, subtract the smaller number from the larger one. Look at the examples to get a better understanding of the task.
 <br>
### Example 1: <br>

**Input:** <br>
L1 = 1->0->0 <br>
L2 = 1->2 <br>

**Output:** 88 <br>

**Explanation:** <br>  
First linked list represents 100 and the
second one represents 12. 12 subtracted from 100
gives us 88 as the result. <br> It is represented
as 8->8 in the linked list. <br>

### Example 2: <br>

**Input:** <br>
L1 = 0->0->6->3 <br>
L2 = 7->1->0 <br>
**Output:** 647 <br>

**Explanation:** <br> 
First linked list represents 0063 => 63 and 
the second one represents 710. 63 subtracted 
from 710 gives us 647 as the result. <br> It is
represented as 6->4->7 in the linked list. <br>

**Your Task:** <br>
You do not have to take any input or print anything. The task is to complete the function `subLinkedList()` that takes heads of two linked lists as input parameters and which should subtract the smaller number from the larger one represented by the given linked lists and return the head of the linked list representing the result.
 
`n` and `m` are the length of the two linked lists respectively. <br>

Expected Time Complexity:  O(n+m) <br>
Expected Auxiliary Space: O(n+m) <br>

Constraints: <br>
1 <= n <= 10000 <br>
0 <= values represented by the linked lists < 10n <br>
0 <= values represented by the linked lists < 10m <br>

![Screenshot (501)](https://github.com/shanvii/DSA-GFG-Coding-questions/assets/81086303/72c3cf73-cab0-473e-8564-a99dff5fc653)
