// This question is similar to "Activity Selection Problem"
// Time : O(N * Log N)
package Greedy.Problems;
import java.util.*;
public class N_Meetings_in_a_Room {
    static class Meeting implements Comparable<Meeting> {
        int i, start, end;
        Meeting(int i, int start, int end) {
            this.i = i; this.start = start; this.end = end;
        }
        @Override
        public int compareTo(Meeting m) {
            if(this.end > m.end) return 1; // swap
            else if(this.end < m.end) return -1; // no swap
            else if(this.start < m.start) return -1; // no swap
            return 1; // swap
        }
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n) {
        Meeting arr[] = new Meeting[n];
        for(int i = 0; i<n; i++) {
            arr[i] = new Meeting(i, start[i], end[i]);
        }
        Arrays.sort(arr);
        int count = 1;
        int prev = 0;
        for(int i = 1; i<arr.length; i++) {
            if(arr[i].start > arr[prev].end) {
                count++;
                prev = i;
            }
        }
        return count;
    }
}
