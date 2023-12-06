// Time : O(n * Log n)
package Greedy.lectures;
import java.util.*;
public class Activity_selection_problem {
    class Activity {
        int start, end;
        Activity(int s, int e) {
            start = s; end = e;
        }
    }
    class MyComp implements Comparator<Activity> {
        @Override
        public int compare(Activity a, Activity b) {
            return a.end - b.end;
        }
    }
    int maxActivity(Activity arr[]) {
        Arrays.sort(arr, new MyComp());
        // since the First activity is always included so count starts with 1
        int count = 1;
        int prev = 0;
        for(int cur = 1; cur<arr.length; cur++) {
            if(arr[cur].start >= arr[prev].end) {
                count++;
                prev = cur;
            }
        }
        return count;
    }
}
