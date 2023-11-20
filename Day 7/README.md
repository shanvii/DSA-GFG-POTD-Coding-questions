<h2>Intersection of two sorted Linked lists</h2>

Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with without changing the original lists.

Note: The elements of the linked list are not necessarily distinct.

<h3>Example 1:</h3>

**Input:** <br>
LinkedList1 = 1->2->3->4->6 <br>
LinkedList2 = 2->4->6->8 <br>
**Output:** 2 4 6 <br>
**Explanation:** For the given two linked list, 2, 4 and 6 are the elements in the intersection.


<h3>Example 2:</h3>

**Input:** <br>
LinkedList1 = 10->20->40->50 <br>
LinkedList2 = 15->40 <br>
**Output:** 40 <br>
<br>

**Your Task:**
You don't have to take any input of print anything. Your task is to complete the function findIntersection(), which will take head of both of the linked lists as input and should find the intersection of two linked list and add all the elements in intersection to the third linked list and return the head of the third linked list.

<br>
Expected Time Complexity : O(n+m) <br>
Expected Auxilliary Space : O(n+m) <br>

**Note:** n, m are the size of the respective linked lists.<br>

**Constraints:** <br>
1 <= size of linked lists <= 5000 <br>
1 <= Data in linked list nodes <= 104

