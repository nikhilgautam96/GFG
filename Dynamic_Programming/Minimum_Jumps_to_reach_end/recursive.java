// Time : O(n ^ n), Space : O(n)
package Dynamic_Programming.Minimum_Jumps_to_reach_end;
public class recursive {
    int minJumps(int arr[], int n) {
        if(n == 1) {
            // we have reached the start, so no jumps needed to get at start.
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<n-1; i++) {
            if(i + arr[i] >= n-1) {
                // we consider this jump.
                int temp = minJumps(arr, i+1);
                if(temp != Integer.MAX_VALUE) {
                    res = Math.min(res, temp + 1);
                }
            }
        }
        return res;
    }
}
