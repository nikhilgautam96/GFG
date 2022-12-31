// Time : O(n * sum), Space : O(sum).
package Dynamic_Programming.GFG_Problems;
public class coin_change_minimum_number_of_coins {
    public long minimumNumberOfCoins(int coins[],int numberOfCoins,int value) {
        long dp[] = new long[value+1];
        dp[0] = 0;
        for(int i = 1; i<=value; i++) {
            dp[i] = Long.MAX_VALUE;
            for(int j = 0; j<numberOfCoins; j++) {
                if(coins[j] <= i) {
                    if(dp[i - coins[j]] != Long.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                    }
                }
            }
        }
        if(dp[value] == Long.MAX_VALUE) return -1;
        
        return dp[value];
    }
}
