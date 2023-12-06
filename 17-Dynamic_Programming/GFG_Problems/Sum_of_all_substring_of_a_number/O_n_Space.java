// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems.Sum_of_all_substring_of_a_number;
public class O_n_Space {
    public static long sumSubstrings(String s) {
        long mod = (long)(1e9 + 7);
        int n = s.length();
        long dp[] = new long[n];
        dp[0] = (long)(s.charAt(0) - '0');
        long ans = dp[0];
        for(int i = 1; i<n; i++) {
            long ch = (long)(s.charAt(i) - '0');
            dp[i] = ((ch * (i+1)) + (10 * dp[i-1])) % mod;
            ans = (ans + dp[i]) % mod;
        }
        return ans % mod;
    }
}
