// Time : O(n ^ 2), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class Unique_BST {
    static int numTrees(int N) {
        long mod = (long)(1e9 + 7);
        long dp[] = new long[N+1];
        dp[0] = 1;
        for(int i = 1; i<=N; i++) {
            dp[i] = 0;
            for(int j = 0; j<i; j++) {
                dp[i] = (dp[i] % mod + (dp[j] % mod * dp[i-j-1] % mod) % mod) % mod; 
            }
        }
        return (int)dp[N];
    }
}
