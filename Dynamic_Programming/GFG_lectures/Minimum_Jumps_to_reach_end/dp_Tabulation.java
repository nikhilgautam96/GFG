// Time Theta(n ^ 2), Space : Theta(n).
package Dynamic_Programming.GFG_lectures.Minimum_Jumps_to_reach_end;
public class dp_Tabulation {
    int minJumps(int arr[], int n) {
        int dp[] = new int[n];
        dp[0] = 0; // '0' jumps to reach at the begining.
        for(int i = 1; i<n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i = 1; i<n; i++) {
            for(int j = 0; j<i; j++) {
                if(j + arr[j] >= i) {
                    if(dp[j] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                        break;
                    }
                }
            }
        }
        return dp[n-1];
    }
}
