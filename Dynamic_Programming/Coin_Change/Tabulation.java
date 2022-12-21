// Time : O(n * sum), Space : O(n * sum).
package Dynamic_Programming.Coin_Change;
public class Tabulation {
    int count_Ways(int coins[], int n, int sum) {
        int dp[][] = new int[n + 1][sum + 1];
        for(int i = 0; i<=n; i++) {
            dp[i][0] = 1;
        }
        for(int j = 1; j<=sum; j++) {
            dp[0][j] = 0;
        }
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=sum; j++) {
                // we always take the case where the coin isn't selected;
                dp[i][j] = dp[i-1][j];
                if(coins[i-1] <= j) {
                    // We select the (i-1)'th coin only 
                    // if its value is <= the sum we need(ie :- j)
                    dp[i][j] += dp[i][j - coins[i-1]];
                }
            }
        }
        return dp[n][sum];
    }
}
