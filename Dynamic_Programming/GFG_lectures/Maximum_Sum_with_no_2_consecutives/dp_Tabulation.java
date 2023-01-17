// Time : Theta(n), Space : Theta(n).
package Dynamic_Programming.GFG_lectures.Maximum_Sum_with_no_2_consecutives;
public class dp_Tabulation {
    int maxSum(int arr[], int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = arr[0];
        for(int i = 2; i<=n; i++) {
            dp[i] = Math.max(arr[i-1] + dp[i-2], dp[i-1]);
        }
        return dp[n];
    }
}
