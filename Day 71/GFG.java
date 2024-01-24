//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
    
            ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                ArrayList<Integer> edge = new ArrayList<>();
                edge.add(u);
                edge.add(v);
                edges.add(edge);
            }
    
            Solution solution = new Solution();
            boolean result = solution.isTree(n, m, edges);
    
            if (result==true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java
class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(ArrayList<Integer> x:edges){
            adj.get(x.get(0)).add(x.get(1));
            adj.get(x.get(1)).add(x.get(0));
        }
        int vis[]=new int[n];
        Arrays.fill(vis,0);
        Queue<int[]> q = new LinkedList<>();
        int arr[]=new int[2];
        arr[0]=0;
        arr[1]=-1;
        q.add(arr);
        vis[0]=1;
        while(!q.isEmpty()){
            int temp[] = q.poll();
            for(int it:adj.get(temp[0])){
                if(vis[it]==0){
                    vis[it]=1;
                    int arr2[]=new int[2];
                    arr2[0]=it;
                    arr2[1]=temp[0];
                    q.add(arr2);
                }
                else{
                    if(it!=temp[1])return false;
                }
            }
        }
        for(int i=0;i<n;i++)if(vis[i]==0)return false;
        return true;
    }
}
