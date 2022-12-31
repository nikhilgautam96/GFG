// Time : O(n * sum), Space : O(n * sum).
package Dynamic_Programming.GFG_Problems;
public class coin_change_number_of_ways {
    public long numberOfWays(int coins[],int numberOfCoins,int value) {
        int dp[][] = new int[numberOfCoins+1][value+1];
        for(int i = 0; i<=numberOfCoins; i++) {
            dp[i][0] = 1;
        }
        for(int j = 1; j<=value; j++) {
            dp[0][j] = 0;
        }
        for(int i = 1; i<=numberOfCoins; i++) {
            for(int j = 1; j<=value; j++) {
                dp[i][j] = dp[i-1][j];
                if(coins[i-1] <= j) {
                    dp[i][j] +=  dp[i][j - coins[i-1]];
                }
            }
        }
        return dp[numberOfCoins][value];
    }
}
