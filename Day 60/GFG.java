//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			insertion llist = new insertion(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		head = ob.insertionSort(llist.head);
		llist.printList(head);
		
        t--;		
        }
    }}
// } Driver Code Ends


//User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node insertionSort(Node head_ref)
    {
        // If the list is empty or has only one element, it is already sorted
        if (head_ref == null || head_ref.next == null) {
            return head_ref;
        }

        Node sortedList = null; // Head of the sorted list

        Node current = head_ref; // Traverse the original list

        while (current != null) {
            Node next = current.next; // Save the next node before changing current's next

            sortedList = sortedInsert(sortedList, current); // Insert current in the sorted list

            current = next; // Move to the next node in the original list
        }

        return sortedList;
    }

    // Helper function to insert a node in a sorted linked list
    private static Node sortedInsert(Node sortedList, Node newNode) {
        if (sortedList == null || sortedList.data >= newNode.data) {
            // If the sorted list is empty or newNode has the smallest value,
            // insert newNode at the beginning of the sorted list
            newNode.next = sortedList;
            return newNode;
        }

        // Locate the node before the point of insertion
        Node current = sortedList;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        // Insert newNode after the current node
        newNode.next = current.next;
        current.next = newNode;

        return sortedList;
    }
}
