// Time : Theta(n), Space : Theta(n)
package Dynamic_Programming.Maximum_Cuts;
public class dp {
    int maxCuts(int n, int a, int b, int c) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i<=n; i++) {
            dp[i] = -1;
            if(i-a >= 0) {
                // here we could have done -> dp[i] = max(dp[i], 1 + dp[i-a])
                // but we dont do it bcz if dp[i-a] == -1 that means,
                // there is no possible cut for length (i-a) so,
                // we cannot make cut of len 'a' to len 'i' when len 'i-a' doesn't 
                // have any possible cuts.
                dp[i] = Math.max(dp[i], dp[i-a]);
            }
            if(i-b >= 0) {
                dp[i] = Math.max(dp[i], dp[i-b]);
            }
            if(i-c >= 0) {
                dp[i] = Math.max(dp[i], dp[i-c]);
            }
            if(dp[i] != -1) {
                // means a cut was possible.
                dp[i]++; 
            }
        }
        return dp[n];
    }
}
