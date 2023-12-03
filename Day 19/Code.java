//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}


// } Driver Code Ends
//User function Template for Java
class Solution {
    public static int countPairs(Node root1, Node root2, int x) {
        int count = 0;
        
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node current1 = root1, current2 = root2;
        
        while (true) {
          
            while (current1 != null) {
                stack1.push(current1);
                current1 = current1.left;
            }

           
            while (current2 != null) {
                stack2.push(current2);
                current2 = current2.right;
            }

           
            if (stack1.isEmpty() || stack2.isEmpty()) {
                break;
            }

            Node top1 = stack1.peek();
            Node top2 = stack2.peek();

      
            if (top1.data + top2.data == x) {
                count++;

              
                stack1.pop();
                current1 = top1.right;

               
                stack2.pop();
                current2 = top2.left;
            } else if (top1.data + top2.data < x) {
                
                stack1.pop();
                current1 = top1.right;
            } else {
               
                stack2.pop();
                current2 = top2.left;
            }
        }

        return count;
    }
}



//{ Driver Code Starts.

public class Main
{
    static FastIO f;


    static Node buildTree(String str)
    {
    	
    	if(str.length() == 0 || str.charAt(0) == 'N')
    		return null;

    
    	String[] ip = str.split(" ");

    
    	Node root = new Node(Integer.parseInt(ip[0]));

    
    	Queue<Node> queue = new LinkedList<>();
    	queue.add(root);

    
	    int i = 1;
	    while (!queue.isEmpty() && i < ip.length) {

	       
	        Node currNode = queue.poll();

	        
	        String currVal = ip[i];

	       
	        if (!currVal.equals("N")) {

	           
	            currNode.left = new Node(Integer.parseInt(currVal));

	            
	            queue.add(currNode.left);
	        }

	      
	        i++;
	        if (i >= ip.length)
	            break;
	        currVal = ip[i];

	       
	        if (!currVal.equals("N")) {

	            
	            currNode.right = new Node(Integer.parseInt(currVal));

	            
	            queue.add(currNode.right);
	        }
	        i++;
	    }

	    return root;
    }
    
    public static void main(String args[]) throws IOException
    {
        f = new FastIO();
        
        int t = f.nextInt();
        
        while(t-->0)
        {
            String tree1 = f.nextLine(), tree2 = f.nextLine();
            Node root1 = buildTree(tree1), root2 = buildTree(tree2);
            int x = f.nextInt();

            f.out(Solution.countPairs(root1, root2, x) + "\n");
        }
        
        f.flush();
    }
}

class FastIO
{
	BufferedReader br;
	PrintWriter bw, be;
	StringTokenizer st;

	public FastIO()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new PrintWriter(System.out);
		be = new PrintWriter(System.err);
		st = new StringTokenizer("");
	}

	private void read() throws IOException
	{
		st = new StringTokenizer(br.readLine());
	}

	public String nextLine() throws IOException
	{
		return br.readLine();
	}

	public String next() throws IOException
	{
		while(!st.hasMoreTokens())
			read();
		return st.nextToken();
	}

	public int nextInt() throws IOException
	{
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException
	{
		return Long.parseLong(next());
	}

	public float nextFloat() throws IOException
	{
		return Float.parseFloat(next());
	}

	public double nextDouble() throws IOException
	{
		return Double.parseDouble(next());
	}

	public char nextChar() throws IOException
	{
		return next().charAt(0);
	}

	public void out(String s) throws IOException
	{
		bw.print(s);
	}

	public void flush() throws IOException
	{
		bw.flush();
		be.flush();
	}

	public void err(String s) throws IOException
	{
		be.print(s);
	}
}
// } Driver Code Ends
