// Time : Theta(n), Space : O(1).
package Dynamic_Programming.GFG_lectures.Maximum_Sum_with_no_2_consecutives;
public class dp_Space_optimized {
    int maxSum(int arr[], int n) {
        int prev_prev = arr[0];
        int prev = Math.max(arr[0], arr[1]);
        int res = prev;
        for(int i = 2; i<n; i++) {
            res = Math.max(arr[i] + prev_prev, prev);
            prev_prev = prev;
            prev = res;
        }
        return res;
    }
}
