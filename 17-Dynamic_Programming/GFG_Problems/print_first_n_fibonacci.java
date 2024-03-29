// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class print_first_n_fibonacci {
    public static long[] printFibb(int n) {
        if(n == 1) return new long[]{1};
        long dp[] = new long[n];
        dp[0] = 1; dp[1] = 1;
        for(int i = 2; i<n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp;
    }
}
