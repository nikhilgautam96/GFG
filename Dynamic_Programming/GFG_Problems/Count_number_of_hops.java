// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class Count_number_of_hops {
    static long countWays(int n) {
        if(n == 1 || n == 2) return n;
        long mod = (long)(1e9 + 7);
        long n_minus_1 = 1; // dp[0] = 1;
        long n_minus_2 = 1; // dp[1] = 1;
        long n_minus_3 = 2; // dp[2] = 2;
        long ans = 0;
        for(int i = 3; i<=n; i++) {
            ans = (n_minus_1 % mod + n_minus_2 % mod + n_minus_3 % mod) % mod;
            n_minus_1 = n_minus_2;
            n_minus_2 = n_minus_3;
            n_minus_3 = ans;
        }
        return ans % mod;
    }
}
