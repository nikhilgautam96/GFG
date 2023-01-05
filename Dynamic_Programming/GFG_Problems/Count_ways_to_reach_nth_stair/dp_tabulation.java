// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems.Count_ways_to_reach_nth_stair;
public class dp_tabulation {
    int countWays(int n) {
        int mod = (int)(1e9 + 7);
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=n; i++) {
            dp[i] = (dp[i-1] % mod + dp[i-2] % mod);
        }
        return dp[n] % mod;
    }
}
