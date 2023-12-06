// NP Hard Problem.

// Time taken in this technique is "not" called as "Polynomial" but it is called as,
// "Sudo Polynomial" bcz the time depends on "target" value.
// and in case "target" is "too Large" it can behave worse than "O(2 ^ n) solution"

// Time : Theta(n * target), Space : Theta(n * target)
package Dynamic_Programming.GFG_lectures._01_Knapsack_Problem;
public class dp_Tabulation {
    int knapsack(int target, int wt[], int val[], int n) {
        int dp[][] = new int[n + 1][target + 1];
        // dp[i][j] = max value we can collect with first 'i' items and knapsack capacity 'j'.
        for(int i = 0; i<=n; i++) {
            dp[i][0] = 0;
        }
        for(int j = 1; j<=target; j++) {
            dp[0][j] = 0;
        }
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=target; j++) {
                dp[i][j] = dp[i-1][j]; // when "wt[i-1] > j" then dp[i][j] = dp[i-1][j] itself.
                if(wt[i-1] <= j) {
                    dp[i][j] = Math.max(dp[i][j], val[i-1] + dp[i-1][j - wt[i-1]]);
                }
            }
        }
        return dp[n][target];
    }
}
