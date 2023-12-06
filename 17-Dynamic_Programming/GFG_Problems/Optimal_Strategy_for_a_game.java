// Time : O(n ^ 2), Space : o(n ^ 2).
package Dynamic_Programming.GFG_Problems;
public class Optimal_Strategy_for_a_game {
    static long countMaximum(int arr[], int n) {
        int dp[][] = new int[n][n];
        for(int gap = 0; gap < n; gap++) {
            for(int i = 0, j = gap; j<n; i++, j++) {
                if(gap == 0) {
                    dp[i][j] = arr[i];
                } else if(gap == 1) {
                    dp[i][j] = Math.max(arr[i], arr[j]);
                } else {
                    dp[i][j] = Math.max(arr[i] + Math.min(dp[i+2][j], dp[i+1][j-1]),
                                    arr[j] + Math.min(dp[i+1][j-1], dp[i][j-2]));
                }
            }
        }
        return dp[0][n-1];
    }
}
