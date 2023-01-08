// Time : O(n * w), Space : O(w).
package Dynamic_Programming.GFG_Problems;
public class _01_Knapsack {
    static int knapSack(int W, int wt[], int val[], int n) {
        int dp[][] = new int[2][W+1];
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=W; j++) {
                if(i == 0 || j == 0) {
                    dp[i % 2][j] = 0;
                } else {
                    // we always include the case where we dont have to select 
                    // the current item from the sack.
                    dp[i % 2][j] = dp[(i + 1) % 2][j];
                    if(wt[i-1] <= j) {
                        // if the wt of cur item is less than the required weight then
                        // go for the possibility to either include it or not
                        // based on the profit it gives.
                        dp[i % 2][j] = Math.max(dp[i % 2][j], val[i-1] + dp[(i + 1) % 2][j - wt[i-1]]);
                    }
                }
            }
        }
        return dp[n % 2][W];
    }
}
