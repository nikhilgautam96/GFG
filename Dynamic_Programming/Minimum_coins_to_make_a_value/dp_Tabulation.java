// Time : O(n * sum), Space : O(sum).
package Dynamic_Programming.Minimum_coins_to_make_a_value;
public class dp_Tabulation {
    int getMin(int coins[], int n, int sum) {
        int dp[] = new int[sum + 1];
        dp[0] = 0; // For sum = 0,  we need 0 coins.
        for(int i = 1; i<=sum; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j = 0; j<n; j++) {
                if(coins[j] <= i) {
                    if(dp[i - coins[j]] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                    }
                }
            }
        }
        return dp[sum];
    }
}
