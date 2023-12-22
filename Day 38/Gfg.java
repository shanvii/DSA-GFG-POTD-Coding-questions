//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // Create a list of meetings
        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++) {
            meetings[i] = new Meeting(i + 1, S[i], F[i]);
        }

        // Sort the list of meetings based on finish times
        Arrays.sort(meetings, Comparator.comparingInt(m -> m.finishTime));

        // Initialize variables
        int endTime = -1;
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the sorted list of meetings
        for (Meeting meeting : meetings) {
            // If the meeting can be attended, select it and update endTime
            if (meeting.startTime > endTime) {
                result.add(meeting.index);
                endTime = meeting.finishTime;
            }
        }

        // Sort the result before returning
        Collections.sort(result);

        // Return the list of selected meeting indices
        return result;
    }

    // Meeting class to represent a meeting with its index, start time, and finish time
    static class Meeting {
        int index;
        int startTime;
        int finishTime;

        public Meeting(int index, int startTime, int finishTime) {
            this.index = index;
            this.startTime = startTime;
            this.finishTime = finishTime;
        }
    }
}
