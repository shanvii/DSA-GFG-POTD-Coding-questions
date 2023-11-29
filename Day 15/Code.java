//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        
        while (tc-- > 0) {
            int V = scanner.nextInt();
            int E = scanner.nextInt();
            
            List<Integer>[] adj = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
            
            for (int i = 0; i < E; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            
            // String x=scanner.nextLine();
            // scanner.nextLine();
            
            Solution obj = new Solution();
            int ans = obj.isEulerCircuit(V, adj);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution{
    public int isEulerCircuit(int V, List<Integer>[] adj) {
        int[] degree = new int[V];

        // Calculate the degree of each vertex
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj[i].size(); j++) {
                degree[i]++;
            }
        }

        int oddDegreeCount = 0;
        for (int i = 0; i < V; i++) {
            if (degree[i] % 2 != 0) {
                oddDegreeCount++;
            }
        }

        if (oddDegreeCount == 0) {
            return 2; // Eulerian circuit
        } else if (oddDegreeCount == 2) {
            return 1; // Eulerian path
        } else {
            return 0; // Neither Eulerian circuit nor path
        }
    }
}
