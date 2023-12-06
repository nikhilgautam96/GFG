package Greedy.Problems;
import java.util.*;
public class Activity_Selection {
    static class Activity implements Comparable<Activity> {
        int s, e;
        Activity(int s, int e) {
            this.s = s; this.e = e;
        }
        public int compareTo(Activity a) {
            return this.e - a.e;
        }
    }
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n) {
        // add your code here
        Activity arr[] = new Activity[n];
        for(int i = 0; i<n; i++) {
            arr[i] = new Activity(start[i], end[i]);
        }
        Arrays.sort(arr);
        int count = 1;
        int prev = 0;
        for(int i = 1; i<n; i++) {
            if(arr[i].s > arr[prev].e) {
                count++;
                prev = i;
            }
        }
        return count;
    }
}
