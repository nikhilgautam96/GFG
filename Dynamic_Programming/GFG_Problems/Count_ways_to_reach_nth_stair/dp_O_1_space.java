// Time : O(n), Space : O(1).
package Dynamic_Programming.GFG_Problems.Count_ways_to_reach_nth_stair;
public class dp_O_1_space {
    int countWays(int n) {
        int mod = (int)(1e9 + 7);
        int n_minus_1 = 1; // dp[0] = 1
        int n_minus_2 = 1; // dp[1] = 1
        int ans = n_minus_2;
        for(int i = 2; i<=n; i++) {
            ans = (n_minus_1 % mod + n_minus_2 % mod) % mod;
            n_minus_1 = n_minus_2;
            n_minus_2 = ans;
        }
        return ans % mod;
    }
}
