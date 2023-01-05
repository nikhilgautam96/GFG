// Time : O(n), Space : O(1).
package Dynamic_Programming.GFG_Problems;
public class Minimum_jumps_to_reach_end {
    public static int minimumJumps(int arr[], int n) {
        if(arr[0] == 0) return -1;
        if(n == 0) return 0;
        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 0;
        for(int i = 1; i<n; i++) {
            if(i == n-1) {
                return (jumps + 1);
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            if(steps == 0) {
                jumps++;
                if(i >= maxReach) {
                    return -1;
                }
                steps = maxReach - i;
            }
        }
        return jumps;
    }
}
