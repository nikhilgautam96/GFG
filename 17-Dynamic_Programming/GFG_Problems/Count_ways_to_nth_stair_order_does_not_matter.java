// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class Count_ways_to_nth_stair_order_does_not_matter {
    Long countWays(int m) {
        long mod = (long)(1e9 + 7);
        long dp[] = new long[m+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=m; i++) {
            dp[i] = (dp[i-2] % mod + 1) % mod;
        }
        return dp[m] % mod;
    }
}
