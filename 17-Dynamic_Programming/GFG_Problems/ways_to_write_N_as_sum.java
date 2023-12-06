// Time : O(n ^ 2), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class ways_to_write_N_as_sum {
    int countWays(int n) {
        int mod = (int)(1e9 + 7);
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i<n; i++) {
            for(int j = i; j<=n; j++) {
                dp[j] = (dp[j] % mod + dp[j-i] % mod) % mod;
            }
        }
        return dp[n] % mod;
    }
}
