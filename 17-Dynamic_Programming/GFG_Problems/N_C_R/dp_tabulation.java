// Time : O(n * r), Space : O(r).
// The complexity of this technique might be more than the "naive" approach 
// but since it does not use the multiplication operation, 
// thus it makes this approach much more efficient than the naive one.
package Dynamic_Programming.GFG_Problems.N_C_R;
public class dp_tabulation {
    public static int nCrModp(int n, int r) {
        if(r > n) return 0;
        if(n == r) return 1;
        if(r == n-1 || r == 1) return n;
        if(r > n/2) {
            r = n-r;
        }
        int mod = (int)(1e9 + 7);
        int dp[] = new int[r+1];
        dp[0] = 1; // nCo = 1
        for(int i = 1; i<=n; i++) {
            // if(r > i) --> it doesn't makes any sense to start with 'r'
            // as, iCr for r>i is always '0'.
            for(int j = Math.min(r, i); j>0; j--) {
                dp[j] = (dp[j] + dp[j-1]) % mod;
            }
        }
        return  dp[r] % mod;
    }
}
