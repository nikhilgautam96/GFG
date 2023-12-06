// Time : O(n), Space : O(n).
package Dynamic_Programming.GFG_Problems;
public class Maximize_the_cut_segments {
    public int maximizeCuts(int n, int x, int y, int z) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i<=n; i++) {
            dp[i] = -1;
            if(i-x >= 0) dp[i] = Math.max(dp[i], dp[i-x]);
            if(i-y >= 0) dp[i] = Math.max(dp[i], dp[i-y]);
            if(i-z >= 0) dp[i] = Math.max(dp[i], dp[i-z]);
            
            if(dp[i] != -1) {
                // we dont do dp[i] = Math.max(dpi], 1 + dp[i-x] or [i-y] or [i-z])
                // bcz, in doing so we will be adding a '1' every time with every cut,
                // instead we just need to add '1' for the best possible cut in (x,y,z).
                dp[i] += 1;
            }
        }
        if(dp[n] == -1) return 0;
        return dp[n];
    }
}
